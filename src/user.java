import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class user {
 String name;
 String username;
 String password;
 String type;
 ArrayList<history> previous_searched;
 
 // This constructor will be called when we are creating an admin
  user(String username,String password,String type){
	  this.username=username;
	  this.password=password;
	  this.type=type;
  }
  
  
 // This constructor will be called when we are creating a customer 
  user(String username,String password,String type,String name){
	  this.username=username;
	  this.password=password;
	  this.type=type;
	  this.name=name;
	  previous_searched=new ArrayList<>();
  }
  
  // For checking the user credentials
  public static String login(Scanner s,HashMap<String,user> userdetails) {
	  System.out.println();
	  System.out.print("Enter your username: ");
	  String usname=s.next();
	  if(!userdetails.containsKey(usname)) {
		  System.out.println("You are not authorised!!! Please register yourself");
		  return "null";
	  }
	  else {
		  int count=0;
		  System.out.println();
		  System.out.print("Enter your password: ");
		  String pass=s.next();
		  while(userdetails.get(usname).password!=pass && count<5) {
			  System.out.println("Please enter correct password ");
			  System.out.print("Number of attempts left: "+ (4-count));
			  System.out.println();
			  System.out.print("Enter your password: ");
			  pass=s.next();
		  }
		  if(count!=5) {
			  return usname;
		  }
		  
		  // It will call main home screen function if the number of attempts cross a limit of 5
		  
		  Main_class.homescreen(s);
		  return "null";
		  
	  }
	  
  }
  
  
  // class for storing user history
  public class history{
	  String from;
	  String to;
	  int budget;
	  
	  history(String from,String to,int budget){
		  this.from=from;
		  this.to=to;
		  this.budget=budget;
	  }
  }
  
}

