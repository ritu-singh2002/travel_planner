import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Activities {
    static HashMap<String,ArrayList<activity_details>> all_activities=new HashMap<>();
    
    
    
    // Function for adding the activites at a particular location
    	public void add_activity(String location,Scanner sc) {
		System.out.println("<-----------------| Please enter Activity details |-------------------> ");
		System.out.print("Enter activity name: ");
		String name=sc.next();
		System.out.println();
		System.out.print("Enter activity cost (per person): ");
		int cost=sc.nextInt();
		System.out.println();
		
		if(this.all_activities.containsKey(location)) {
		      for( activity_details at: this.all_activities.get(location) ) {
		    	  if(at.Name.equals(name)) {
		    		  
		    		  // This activity is already present in our system
		    		   
		    	  }
		      }
		      this.all_activities.get(location).add( new activity_details(name,cost,location) );
		}
		else {
			// Creating location first
			this.all_activities.put(location, new ArrayList<>());
			this.all_activities.get(location).add( new activity_details(name,cost,location) );
			
		}
		System.out.println(name+" added Successfully !!!!");
	}
	
	
	// Function for getting activity details of a particular location
		public ArrayList<activity_details> get_activities_at_location(String location){
		if(this.all_activities.containsKey(location)) {
			return this.all_activities.get(location);
		}
		else {
			System.out.println("No activity found for this place !!!!");
			return null;
		}
	}
	
	// Function for getting a particular activity of a particular location
		public activity_details get_activity(String location,String name) {
		   if(this.all_activities.containsKey(location)) {
                for(activity_details at: this.all_activities.get(location) ) {
                	
                	if(at.Name.equals(name)) {
                		return at;
                	}
                }
                // No Activity found !!!!
                return null;
		   }
		   else {
			   // Location does not exist 
			   return null;
		   }
		}

	// Function for updating activities 
		public void update_activity(String location,String name,Scanner sc) {
			if(this.all_activities.containsKey(location)) {
				
				for( activity_details ac: this.all_activities.get(location) ) {
					if(ac.Name.equals(name)) {
						while(true) {
							System.out.println("What changes you want to make? choose the correct option for that ");
							System.out.println("1) Name");
							System.out.println("2) Price");
							System.out.println("3) Return from activity updation");
							System.out.print("Enter your choice: ");
							int ch=sc.nextInt();
							System.out.println();
							if(ch==3) {
								break;
							}
							switch(ch){
							case 1:{ 
								System.out.print("Enter new name: ");
								ac.Name=sc.next();
								System.out.println("\n Name Updation successfully !!!!");
								break;}
							
							case 2:{  
								System.out.print("Enter new price: ");
								ac.price=sc.nextInt();
								System.out.println("\n Price Updation successfully !!!!");
								break;}
							default: System.out.println("Please choose valid option !!!!");
							}
						}
					}
				}
			
			}
			else {
				System.out.println("Sorry "+name+" is not found in "+location+" !!!!");
				return;
			}
		}

	// Function to remove a activity
		public void remove_activity(String name,String location) {
			activity_details ac=this.get_activity(location, name);
			if(ac!=null) {
			  this.all_activities.get(location).remove(ac);
			  System.out.println(ac.Name+" is Successfully removed !!!!");
			}
			else {
				System.out.println("Sorry not found!!!!!");
			}
			
		}

	// Function to rate a activity
		public void rate_activity(String name,String location,Scanner sc) {
			
			if(this.all_activities.containsKey(location)) {
			   
				for(activity_details ac: this.all_activities.get(location) ) {
					if(ac.Name.equals(name)) {
						System.out.println("How many stars you want to give to "+ac.Name);
						int r=sc.nextInt();
						ac.num_of_users_rated++;
						ac.rating=(ac.rating+r)/ac.num_of_users_rated;
						return;
					}
				}
				
			}
		}

		
	// Function to comment on activity
		public void comment_activity(String location,String name,Scanner sc) {
			if(this.all_activities.containsKey(location)) {
				
				System.out.print("Write your experience here: ");
//				System.out.println();
				String cmt=sc.nextLine();
				
				for(activity_details ac: this.all_activities.get(location) ) {
					if(ac.Name.equals(name)) {
						ac.comments.add(cmt);
					}
				}
				System.out.println("Comment added successfully !!!!");
				
			}
			else {
				System.out.println("Sorry no activity found !!!!");
			}
		}

		
	// Function to find best actvities 
		// Here applying 0 1 knapsack DP standard problem concept
		public ArrayList<activity_details> find_best_activity(String location,int cost){
			ArrayList<activity_details> all=this.get_activities_at_location(location);
			Pair[][] dp=new Pair[all.size()+1][cost+1];
			int n=all.size();
		    for(int i=0;i<=cost;i++) {
		    	dp[0][i]=new Pair();
		    }
		    for(int i=0;i<n+1;i++) {
		    	dp[i][0]=new Pair();
		    }
		    
		    for(int i=1;i<n+1;i++) {
		    	for(int j=1;j<cost+1;j++) {
		    		
		    			    		
		    		if( all.get(i-1).price<=j) {
		    		 int newvalue=all.get(i-1).rating + dp[i-1][j- all.get(i-1).price ].rate;
		    		 if(newvalue> dp[i-1][j].rate ) {
		    			 ArrayList<activity_details> temp=new ArrayList<>();
		    			 temp.addAll(dp[i-1][j- all.get(i-1).price ].ac);
		    			 temp.add( all.get(i-1) );
		    			 dp[i][j]=new Pair(newvalue,temp );
		    		 }
		    		 else {
		    			 dp[i][j]=dp[i-1][j];
		    		 }
		    	      
		    		}
		    		else {
		    			dp[i][j]=dp[i-1][j];
		    		}		   			    		    		
		    	}
		    }
		    
			return dp[n][cost].ac;
		}

		
		private class Pair{
			int rate;
			ArrayList<activity_details> ac;
			Pair(){
				rate=0;
				ac=new ArrayList<>();
			}
			Pair(int rate,ArrayList<activity_details> ac){
				this.rate=rate;
				this.ac=ac;
			}
			
		}
	
}
