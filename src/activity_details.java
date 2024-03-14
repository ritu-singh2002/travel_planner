import java.util.ArrayList;

public class activity_details {
	String Name;
	int price;
	String location;
	int rating;
	int num_of_users_rated;
	ArrayList<String> comments;
	
	activity_details(String Name,int price,String location){
		this.Name=Name;
		this.price=price;
		this.location=location;
		this.rating=0;
		this.num_of_users_rated=0;
		comments=new ArrayList<>();
	}
}
