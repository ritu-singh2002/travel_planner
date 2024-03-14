import java.util.*;

public class Hotels {

	// It will store like this: Manali->3(star)->[ hotel1 , hotel2  ];
	static HashMap<String,HashMap<Integer,ArrayList<Hotels>>> allHotels=new HashMap<>();
	
	String Name;
	String owner;   // it will store owner username;
	ArrayList<Rooms> hotel_rooms;
	int rating;
	int star;
	int num_of_person_rated;
	int avgprice;
	
	
	public Hotels() {
		
	}
	
	// Constructor for creating a hotel
	public Hotels(String Name,String owner,int star){
		this.Name=Name;
		this.owner=owner;
		this.hotel_rooms=new ArrayList<>();
		this.rating=0;
		this.star=star;
		this.num_of_person_rated=0;
		
	}
	
	// Adding a Room
	
	public void addRoom(String location,int star,String owner,String name,Scanner s) {
		boolean findloc=false;
		boolean findstar=false;
		boolean findhotel=false;
		for( String loc: allHotels.keySet() ) {
			if(loc.equals(location)) {
				findloc=true;
				for(int st: allHotels.get(loc).keySet() ) {
					if(st==star) {
					   findstar=true;
					   for(Hotels hotl: allHotels.get(loc).get(st) ) {
						   if(hotl.owner.equals(owner) && hotl.Name.equals(name)) {
							   findhotel=true;
							   System.out.println("<-------------| Add Room Menu |----------------->");
							   System.out.println("Choose the type of room: ");
							   int i=1;
							   for( roomType type: roomType.values()) {
								   System.out.println(i+") "+type);
								   i++;
							   }
							   System.out.print("Enter your choice: ");
							   int choice=s.nextInt();
							   String rtype="";
//							   SINGLE, DOUBLE, TRIPLE, QUAD, QUEEN, KING, TWIN, DELUXE, SUPERDELUXE
							   switch(choice){
							   case 1: {
								   rtype="SINGLE";
								   break;
							   }
							   case 2: {
								   rtype="DOUBLE";
								   break;
							   }
							   case 3: {
								   rtype="TRIPLE";
								   break;
							   }
							   case 4: {
								   rtype="QUAD";
								   break;
							   }
							   case 5: {
								   rtype="QUEEN";
								   break;
							   }
							   case 6: {
								   rtype="KING";
								   break;
							   }
							   case 7: {
								   rtype="TWIN";
								   break;
							   }
							   case 8: {
								   rtype="DELUXE";
								   break;
							   }
							   case 9: {
								   rtype="SUPERDELUXE";
								   break;
							   }
							   default:{
								   System.out.println("Please enter correct options !!!");
							   }
							   }
							   					   
							   System.out.println();
							   System.out.println("Enter room per day rent: ");
							   int rent=s.nextInt();
							   Rooms r=new Rooms(rtype,rent);
							   hotl.hotel_rooms.add(r);
							   System.out.println("Room entered successfully!!!!!");
							   return;
						   }
					   }
					}
				}
				
			}
		}
		
		if(!findloc) {
			System.out.println("No Hotel Found for this location, Please change location !!!!");
			return;
		}
		
		if(!findstar) {
			System.out.println("No Hotel Found with this star, Please change star !!!!");
			return;
		}
		
		if(!findhotel) {
			System.out.println("No Hotel Found, Please use correct details  !!!!");
			return;
		}
		
		
	}
	
	
	// Rating the hotel
	public void rate_hotel(String location,int star,String owner,String name,Scanner s) {
		boolean findloc=false;
		boolean findstar=false;
		boolean findhotel=false;
		for( String loc: allHotels.keySet() ) {
			if(loc.equals(location)) {
				findloc=true;
				for(int st: allHotels.get(loc).keySet() ) {
					if(st==star) {
					   findstar=true;
					   for(Hotels hotl: allHotels.get(loc).get(st) ) {
						   if(hotl.owner.equals(owner) && hotl.Name.equals(name)) {
							   findhotel=true;
							   System.out.println("<-------------| Rate Hotel |----------------->");
							   System.out.println("Enter the rating you want to give to user from 1 to 5");
							   int rate=s.nextInt();
							   while(rate<1 || rate>5) {
								   System.out.println("Please enter value in range (1 to 5)!!!!");
								   System.out.println("Enter the rating you want to give to user from 1 to 5");
								   rate=s.nextInt();
							   }
							   hotl.rating=(hotl.rating*hotl.num_of_person_rated+rate)/(hotl.num_of_person_rated+1);
							   hotl.num_of_person_rated++;
							   System.out.println("Hotel rated successfully!!!!!");
							   return;
						   }
					   }
					}
				}
				
			}
		}
		
		if(!findloc) {
			System.out.println("No Hotel Found for this location, Please change location !!!!");
			return;
		}
		
		if(!findstar) {
			System.out.println("No Hotel Found with this star, Please change star !!!!");
			return;
		}
		
		if(!findhotel) {
			System.out.println("No Hotel Found, Please use correct details  !!!!");
			return;
		}
	}
	
	
	// Getting hotel details
	public void hotel_details(String location,int star,String owner,String name,Scanner s) {
		boolean findloc=false;
		boolean findstar=false;
		boolean findhotel=false;
		for( String loc: allHotels.keySet() ) {
			if(loc.equals(location)) {
				findloc=true;
				for(int st: allHotels.get(loc).keySet() ) {
					if(st==star) {
					   findstar=true;
					   for(Hotels hotl: allHotels.get(loc).get(st) ) {
						     System.out.println("<------------------| Hotel Details |------------------------->");
						     System.out.println("Name: "+hotl.Name);
						     System.out.println("Star: "+hotl.star);
						     System.out.println("Rating: "+hotl.rating);
						     System.out.println("Num of user rated: "+hotl.num_of_person_rated);
						     System.out.println("Room details: ");
						     for(Rooms room: hotl.hotel_rooms) {
						    	 System.out.print("Room type: "+room.type);
						    	 System.out.println("  Per day rent: "+room.per_day_rent);
						     }
						     return;
					   }
					}
				}
				
			}
		}
		
		if(!findloc) {
			System.out.println("No Hotel Found for this location, Please change location !!!!");
			return;
		}
		
		if(!findstar) {
			System.out.println("No Hotel Found with this star, Please change star !!!!");
			return;
		}
		
		if(!findhotel) {
			System.out.println("No Hotel Found, Please use correct details  !!!!");
			return;
		}
	}
	
	
	
	// Find hotel according to budget
	public ArrayList<Hotels> find_hotel(String location,int star,int budget) {
		ArrayList<Hotels> ans=new ArrayList<>();
		for(Hotels hotl: allHotels.get(location).get(star) ) {
			if (hotl.hotel_rooms.size()>0) {
				int avgprice = 0;
				for (Rooms room : hotl.hotel_rooms) {
					avgprice += room.per_day_rent;
				}
				avgprice /= hotl.hotel_rooms.size();
				hotl.avgprice = avgprice;
				if (avgprice <= budget) {
					ans.add(hotl);
				}
			}
		}
		return ans;
	}
	
	

//	 update hotel details - Currently not working
//	public void update_details(String location,int star,String owner,String name,Scanner s) {
//		boolean findloc=false;
//		boolean findstar=false;
//		boolean findhotel=false;
//		for( String loc: allHotels.keySet() ) {
//			if(loc.equals(location)) {
//				findloc=true;
//				for(int st: allHotels.get(loc).keySet() ) {
//					if(st==star) {
//					   findstar=true;
//					   for(Hotels hotl: allHotels.get(loc).get(st) ) {
//						     System.out.println("<------------------| Hotel Details |------------------------->");
//						     System.out.println("Name: "+hotl.Name);
//						     System.out.println("Star: "+hotl.star);
//						     System.out.println("Rating: "+hotl.rating);
//						     System.out.println("Num of user rated: "+hotl.num_of_person_rated);
//						     System.out.println("Room details: ");
//						     for(Rooms room: hotl.hotel_rooms) {
//						    	 System.out.print("Room type: "+room.type);
//						    	 System.out.println("  Per day rent: "+room.per_day_rent);
//						     }
//						     return;
//					   }
//					}
//				}
//				
//			}
//		}
//		
//		if(!findloc) {
//			System.out.println("No Hotel Found for this location, Please change location !!!!");
//			return;
//		}
//		
//		if(!findstar) {
//			System.out.println("No Hotel Found with this star, Please change star !!!!");
//			return;
//		}
//		
//		if(!findhotel) {
//			System.out.println("No Hotel Found, Please use correct details  !!!!");
//			return;
//		}
//	}
   
   
	 
}
