import java.sql.*;
import java.util.*;


public class Main_class {
	static String username;
	static HashMap<String,user> userdetails;
	
	public static void homescreen(Scanner s) {
		System.out.println("<-------------------- Welcome to PNP Travel Planner -------------------->");
		System.out.println("1). Login ( Customer)");
		System.out.println("2). Register ( Customer)");
		System.out.println("3). Login ( Admin)");
		System.out.print("Enter your choice: ");
		int choice=s.nextInt();
		
		switch(choice) {
		case 1:{
		        	
		}
		case 2:{
			
		}
		case 3:{
			
		}
		default:{
			System.out.println("Please choose valid option!!!!!");
			homescreen(s);
		}
		}
		
	}
	
	
	// Function for Activities related menu 
	public static void activity_menu(Scanner s) {
		Activities ac=new Activities();
	  while(true) {
      System.out.println("<----------------| Activity Menu |--------------->");
      System.out.println("1) Add activity");
      System.out.println("2) Get activities of a particular location ");
      System.out.println("3) Get activity by name and location");
      System.out.println("4) remove activity ");
      System.out.println("5) rate this activity");
      System.out.println("6) comment on activity");
      System.out.println("7) update an activity");
      System.out.println("8) find best activities under my budget ");
      System.out.println("Enter your choice: ");
      int ch=s.nextInt();
      if(ch==-1) {
    	  break;
      }
      switch(ch) {
      case 1:{
    	  System.out.println("Please enter location: ");
    	  String loc=s.next();
    	  ac.add_activity(loc, s);
    	  break;
      }
      case 2:{
    	  System.out.println("Please enter location: ");
    	  String loc=s.next();
    	  ArrayList<activity_details> list=ac.get_activities_at_location(loc);
    	  System.out.println("Following activities are there in "+loc+" : ");
    	  int i=1;
    	  for(activity_details act: list ) {
    		  System.out.println(i+") "+act.Name+"   cost: "+act.price+"(per person) and rating: "+act.rating);
    		  i++;
    	  }  	  
    	  
    	  break;
      }
      case 3:{
    	  System.out.println("Please enter location: ");
    	  String loc=s.next();
    	  System.out.println();
    	  System.out.println("Please enter Activity name: ");
    	  String name=s.next();
    	  activity_details act=ac.get_activity(loc, name);
    	  if(act==null) {
    		  System.out.println("Sorry "+name+ " not found in "+loc+" !!!!");
    		  
    	  }
    	  else {
    		  System.out.println(act.Name+"   cost: "+act.price+"(per person) and rating: "+act.rating);
    		  int i=1;
    		  System.out.println("<------------- Past User's experience  --------------->");
    		  if(act.comments.size()==0) {
    			  System.out.println("Sorry no experience found!!!");
    		  }
    		  for( String cmt: act.comments ) {
    			  System.out.println(i+") "+cmt);
    			  i++;
    		  }
    	  }
    	  
    	  break;
      }
      case 4:{
    	  System.out.println("Please enter location: ");
    	  String loc=s.next();
    	  System.out.println();
    	  System.out.println("Please enter Activity name: ");
    	  String name=s.next();
    	  ac.remove_activity(name, loc);
    	  break;
      }
      case 5:{
    	  System.out.println("Please enter location: ");
    	  String loc=s.next();
    	  System.out.println();
    	  System.out.println("Please enter Activity name: ");
    	  String name=s.next();
    	  ac.rate_activity(name, loc, s);
    	  break;
      }
      case 6:{
    	  System.out.println("Please enter location: ");
    	  String loc=s.next();
    	  System.out.println();
    	  System.out.println("Please enter Activity name: ");
    	  String name=s.next();
    	  ac.comment_activity(loc, name, s);
    	  break;
      }
      
      case 7:{
    	  System.out.println("Please enter location: ");
    	  String loc=s.next();
    	  System.out.println();
    	  System.out.println("Please enter Activity name: ");
    	  String name=s.next();
    	  ac.update_activity(loc, name, s);
    	  
    	break;  
      }
      case 8:{
    	  System.out.println("Please enter location: ");
    	  String loc=s.next();
    	  System.out.println();
    	  System.out.println("Please enter cost: ");
    	  int cost=s.nextInt();
    	  ArrayList<activity_details> act=ac.find_best_activity(loc, cost);
    	  if(act.size()==0) {
    		  System.out.println("Sorry no activity found within your budget !!!1");
    	  }
    	  else {
    		  int i=1;
    		  System.out.println("You can do these activities to enjoy your trip:  ");
    		  for(activity_details a: act ) {
    			  System.out.println(i+") "+a.Name+" - cost(per person): "+a.price);
    			  i++;
    		  }
    	  }
    	  
    	  break;
      }
      
      default:{
    	  System.out.println("Please choose valid options !!!!!");
      }
      
      
      }
      System.out.println();
      System.out.println();
	  }
      
		
	}
	
	
	
	
	// After loggedin function (User)
	public static void userLoggedFunction(Scanner s,ArrayList<Edge> graph[]) {
		System.out.println("<--------------------| Travel Planner |-----------------------------> ");
		System.out.println();
		int cityindex=1;
		String source="",destination="";
		
		// Printing the list of location
				for(String city: sampleClass.places ) {
					  System.out.println(cityindex+") "+city);
					  cityindex++;
				}
		System.out.println();
		System.out.print("Please choose your source city: ");
		int src=s.nextInt();
		
		// Checking the valid input
		
		while(src < 0 && src >= cityindex) {
			System.out.println("Please enter valid option between "+1+" to "+(cityindex-1));
			src=s.nextInt();
		}
		
		source=sampleClass.places[src-1];
		System.out.println();
		System.out.print("Please choose your Destination city: ");
		int des=s.nextInt();
		
		// Checking the valid input
		
		while(des < 0 && des >= cityindex && des==src) {
			System.out.println("Please enter valid option between "+1+" to "+(cityindex-1));
			des=s.nextInt();
		}
		destination=sampleClass.places[des-1];
		
		System.out.println();
		System.out.print("Please enter your budget: ");
		int budget=s.nextInt();
		while(budget<=0) {
			System.out.println("Please enter budget greater than 0 !!!!!");
			budget=s.nextInt();
		}
		
		System.out.println();
		System.out.print("Please enter the number of days for your trip: ");
		int days=s.nextInt();
		while(days<=0) {
			System.out.println("Please enter valid days !!!!");
			days=s.nextInt();
		}
		System.out.println();
		
		
		boolean loopexit=false;
		Path newPath= new Path();
		while(true) {
		System.out.println("Let's choose how you would like to travel:-");
		System.out.println("1) for cheapest path by any transport");
		System.out.println("2) for cheapest path by Flight");
		System.out.println("3) for cheapest path by Train");
		System.out.println("4) for cheapest path by Bus");
		System.out.print("Enter your choice: ");
		int opt=s.nextInt();
		
	    src--;
		des--;
		
		switch(opt) {
		case 1:{
				newPath=desPath.getCheapestPath(graph, src, des , source, destination);
				 loopexit=true; break;
			}
		case 2:{
				newPath=desPath.getCheapestPathPlane(graph,src,des, source, destination);
				 loopexit=true; break;
			}
		case 3:{
				newPath=desPath.getCheapestPathTrain(graph,src,des, source, destination);
				 loopexit=true; break;
			}
		case 4:{
			    newPath=desPath.getCheapestPathBus(graph,src,des, source, destination);
			     loopexit=true; break;
			}
		default:{
			System.out.println("Please choose valid options !!!! ");
			System.out.print("Enter your choice: ");
			}
		}
		
		if(budget-newPath.cost<0) {
			System.out.println("Out of Budget, Please use cheap transport !!!!");
			loopexit=false;
		}
		else {
			budget-=newPath.cost;
		}
		
		if(loopexit) break;
		
	    }
		
		// Till here we are able to find the transport cost and path 
		
		// Find best hotel
		System.out.println("Now your transportation plan is ready !!!!   Budget left="+budget);
		System.out.println();
		
		Hotels hotel=new Hotels();
		while(true) {
		System.out.println("Let's find the best hotel for you: ");
		System.out.println("1) Do you want 1 star hotel ?");
		System.out.println("2) Do you want 2 star hotel ?");
		System.out.println("3) Do you want 3 star hotel ?");
		System.out.println("4) Do you want 4 star hotel ?");
		System.out.println("5) Do you want 5 star hotel ?");
		System.out.print("Enter your choice: ");
		int star=s.nextInt();
		
		while(star<1 || star>5) {
			System.out.println("Please enter valid option between 1 to 5 !!!!");
			System.out.print("Enter your choice: ");
			star=s.nextInt();
			System.out.println();
		}
		
		ArrayList<Hotels> allHotels=hotel.find_hotel(destination, star, budget/days);
		int hotelIndex=1;
		for(Hotels hotl: allHotels ) {
			System.out.println(hotelIndex+") "+ hotl.Name +"        avg room cost: "+hotl.avgprice );
			hotelIndex++;
		}
		
		System.out.print("Enter your choice: ");
		int hotelchoice=s.nextInt();
		
		while(hotelchoice<=0 || hotelchoice>allHotels.size()) {
			System.out.println("Please enter valid option !!!!!");
			System.out.print("Enter your choice: ");
			 hotelchoice=s.nextInt();
			 System.out.println();
		}
		
		Hotels requiredHotel=allHotels.get(hotelchoice-1);
		
		int roomIndex=1;
		
		for(Rooms room: requiredHotel.hotel_rooms ) {
		      System.out.println(roomIndex+") "+room.type+"   per day charges: "+room.per_day_rent);	
		      roomIndex++;
		}
		System.out.println();
		System.out.print("Enter your choice: ");
		int roomchoice=s.nextInt();
		
		Rooms selectedRoom=requiredHotel.hotel_rooms.get(roomchoice-1);
		int totalHotelCost=selectedRoom.per_day_rent*days;
		
		if(budget<totalHotelCost) {
			System.out.println("Please choose cheaper hotel, you are getting out of budget !!!!");
		}
		else {
			System.out.println("Hotel Selected Successfully !!!!");
			budget-=totalHotelCost;
			break;
		}
		
	}
		
		// Till here we are able to select Hotel
		
		// Find the best Activities
		System.out.println();
		System.out.println("Now your Hotel is also ready !!!!     Budget left= "+budget);
		System.out.println();
		
		Activities act=new Activities();
		
		System.out.println("How you want to select activities:  ");
		System.out.println("1) Select by own");
		System.out.println("2) Let Computer select best for you ");;
		System.out.print("Enter your choice: ");
		int selectionChoice=s.nextInt();
		
		while(selectionChoice < 1 || selectionChoice>2) {
			System.out.println("Please enter valid options ");
			selectionChoice=s.nextInt();
		}
		ArrayList<activity_details> UserActivities=new ArrayList<>();
		
		if(selectionChoice==1) {
		            
			// User selecting by own
			
			ArrayList<activity_details> allActivites=act.get_activities_at_location(destination);
			if(allActivites!=null) {
				int ActivityIndex=1;
			   for(activity_details activity: allActivites ) {
				   System.out.println(ActivityIndex+") "+activity.Name+"      Price: "+activity.price);
				   ActivityIndex++;
			   }
			   while(true) {
			   System.out.println("Select your activity: ");
			   int ActivityChoice=s.nextInt();
			   
			   while(ActivityChoice<1 || ActivityChoice>allActivites.size() ) {
				   System.out.println("Please enter valid options !!!!");
				   System.out.println("Select your activity: ");
				   ActivityChoice=s.nextInt();
			   }
			    
			   while(budget<allActivites.get(ActivityChoice-1).price || ActivityChoice<1 || ActivityChoice>allActivites.size()) {
				   System.out.println("Please select activity under budget !!!!    Your budget is: "+budget);
				   System.out.println("Select your activity: ");
				   ActivityChoice=s.nextInt();
			   }
			   
			   budget-=allActivites.get(ActivityChoice-1).price;
			   UserActivities.add(allActivites.get(ActivityChoice-1));
			   
			   System.out.println("Do you want to Select more Activites: ");
			   System.out.println("1) yes");
			   System.out.println("2) no");
			   System.out.println("Enter your choice");
			   int choice=s.nextInt();
			   while(choice<1 | choice>2) {
				   System.out.println("Please choose valid option !!!!");
				   System.out.println("Enter your choice");
				   choice=s.nextInt();
			   }
			   if(choice==2) {
				   break;
			   }
			   
			   }
			   
			}
			
			
			
		}
		else {
			
			// Computer deciding the activities
			
			UserActivities=act.find_best_activity(destination,budget);
			
		}
		
		for(activity_details activity : UserActivities ) {
			budget-=activity.price;
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Congratulations We have fetched best plan for you !!!!!!!");
		
		
		// Display the users path
		
	
		
		if(budget>0) {
			System.out.println("Hurrahh!!! We have saved your "+budget+". Enjoy food and shopping with this money !!!");
		}
		
		
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
//		homescreen(sc);
		
		ArrayList<Edge> graph[]=sampleClass.addTransportDetails();
		Hotels.allHotels=sampleClass.addHotelDetails();
		Activities.all_activities = sampleClass.addActivities();
		userLoggedFunction(sc,graph);
		
//	  activity_menu(sc);
		
		
		
		

	}

}
