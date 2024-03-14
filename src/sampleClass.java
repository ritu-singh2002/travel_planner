import java.util.ArrayList;
import java.util.HashMap;

		public class sampleClass {
			public static String places[]= {"delhi","manali","jaipur","mumbai","srinagar","darjeeling","kolkata","mysore","mussoorie","shimla"};
			public static ArrayList<Edge>[] addTransportDetails() {

				ArrayList<Edge> graph[]=new ArrayList[10];
				for(int i=0;i<10;i++)
					graph[i]=new ArrayList<Edge>();
// CREATION OF GRAPH
				//delhi & jaipur
				// Transport: TRAIN
				graph[0].add(new Edge("delhi","jaipur",565,2,"Train"));
				graph[2].add(new Edge("jaipur","delhi",565,0,"Train"));
				//Transport: BUS
				graph[0].add(new Edge("delhi","jaipur",400,2,"Bus"));
				graph[2].add(new Edge("jaipur","delhi",400,0,"Bus"));
				// Transport: PLANE
				graph[0].add(new Edge("delhi","jaipur",3435,2,"Plane"));
				graph[2].add(new Edge("jaipur","delhi",3435,0,"Plane"));
	//delhi & mumbai
		// Transport: TRAIN
		graph[0].add(new Edge("delhi","mumbai",1630,3,"Train"));
		graph[3].add(new Edge("mumbai","delhi",1630,0,"Train"));
		//Transport: BUS
		graph[0].add(new Edge("delhi","mumbai",2000,3,"Bus"));
		graph[3].add(new Edge("mumbai","delhi",2000,0,"Bus"));
		// Transport: PLANE
		graph[0].add(new Edge("delhi","mumbai",6000,3,"Plane"));
		graph[3].add(new Edge("mumbai","delhi",6000,0,"Plane"));
	//delhi & kolkata
		// Transport: TRAIN
		graph[0].add(new Edge("delhi","kolkata",1520,6,"Train"));
		graph[6].add(new Edge("kolkata","delhi",1520,0,"Train"));
		//Transport: BUS
		graph[0].add(new Edge("delhi","kolkata",2000,6,"Bus"));
		graph[6].add(new Edge("kolkata","delhi",2000,0,"Bus"));
		// Transport: PLANE
		graph[0].add(new Edge("delhi","kolkata",5500,6,"Plane"));
		graph[6].add(new Edge("kolkata","delhi",5500,0,"Plane"));
	//delhi & manali
		// Transport: TRAIN
		graph[0].add(new Edge("delhi","manali",300,1,"Train"));
		graph[1].add(new Edge("manali","delhi",300,0,"Train"));
		//Transport: BUS
		graph[0].add(new Edge("delhi","manali",150,1,"Bus"));
		graph[1].add(new Edge("manali","delhi",150,0,"Bus"));
		// Transport: PLANE
		graph[0].add(new Edge("delhi","manali",2500,1,"Plane"));
		graph[1].add(new Edge("manali","delhi",2500,0,"Plane"));
	//delhi & shimla
		// Transport: TRAIN
		graph[0].add(new Edge("delhi","shimla",450,9,"Train"));
		graph[9].add(new Edge("shimla","delhi",450,0,"Train"));
		//Transport: BUS
		graph[0].add(new Edge("delhi","shimla",170,9,"Bus"));
		graph[9].add(new Edge("shimla","delhi",170,0,"Bus"));
		// Transport: PLANE
		graph[0].add(new Edge("delhi","shimla",2400,9,"Train"));
		graph[9].add(new Edge("shimla","delhi",2400,0,"Train"));
	//manali & shimla
		// Transport: TRAIN
		graph[1].add(new Edge("manali","shimla",150,9,"Train"));
		graph[9].add(new Edge("shimla","manali",150,1,"Train"));
		// Transport: BUS
		graph[1].add(new Edge("manali","shimla",50,9,"Bus"));
		graph[9].add(new Edge("shimla","manali",50,1,"Bus"));
		// Transport: PLANE
		graph[1].add(new Edge("manali","shimla",1000,9,"Plane"));
		graph[9].add(new Edge("shimla","manali",1000,1,"Plane"));
	//manali & mussoorie
		// Transport: TRAIN
		graph[1].add(new Edge("manali","mussoorie",150,8,"Train"));
		graph[8].add(new Edge("mussoorie","manali",150,1,"Train"));
		// Transport: BUS
		graph[1].add(new Edge("manali","mussoorie",40,8,"Bus"));
		graph[8].add(new Edge("mussoorie","manali",40,1,"Bus"));
		// Transport: PLANE
		graph[1].add(new Edge("manali","mussoorie",1500,8,"Plane"));
		graph[8].add(new Edge("mussoorie","manali",1500,1,"Plane"));
	//manali & srinagar
		// Transport: TRAIN
		graph[1].add(new Edge("manali","srinagar",100,4,"Train"));
		graph[4].add(new Edge("srinagar","manali",100,1,"Train"));
		// Transport: BUS
		graph[1].add(new Edge("manali","srinagar",60,4,"Bus"));
		graph[4].add(new Edge("srinagar","manali",60,1,"Bus"));
		// Transport: PLANE
		graph[1].add(new Edge("manali","srinagar",1200,4,"Plane"));
		graph[4].add(new Edge("srinagar","manali",1200,1,"Plane"));
	//jaipur & mumbai
		// Transport: TRAIN
		graph[2].add(new Edge("jaipur","mumbai",500,3,"Train"));
		graph[3].add(new Edge("mumbai","jaipur",500,2,"Train"));
		// Transport: BUS
		graph[2].add(new Edge("jaipur","mumbai",600,3,"Bus"));
		graph[3].add(new Edge("mumbai","jaipur",600,2,"Bus"));
		// Transport: PLANE
		graph[2].add(new Edge("jaipur","mumbai",5000,3,"Plane"));
		graph[3].add(new Edge("mumbai","jaipur",5000,2,"Plane"));
	//mumbai & mysore
		// Transport: TRAIN
		graph[3].add(new Edge("mumbai","mysore",250,7,"Train"));
		graph[7].add(new Edge("mysore","mumbai",250,3,"Train"));
		// Transport: BUS
		graph[3].add(new Edge("mumbai","mysore",100,7,"Bus"));
		graph[7].add(new Edge("mysore","mumbai",100,3,"Bus"));
		// Transport: PLANE
		graph[3].add(new Edge("mumbai","mysore",2000,7,"Plane"));
		graph[7].add(new Edge("mysore","mumbai",2000,3,"Plane"));
	//srinagar & shimla
		// Transport: TRAIN
		graph[4].add(new Edge("srinagar","shimla",1500,9,"Train"));
		graph[9].add(new Edge("shimla","srinagar",1500,4,"Train"));
		// Transport: BUS
		graph[4].add(new Edge("srinagar","shimla",1400,9,"Bus"));
		graph[9].add(new Edge("shimla","srinagar",1400,4,"Bus"));
		// Transport: PLANE
		graph[4].add(new Edge("srinagar","shimla",1270,9,"Plane"));
		graph[9].add(new Edge("shimla","srinagar",1270,4,"Plane"));
	//darjeeling & kolkata
		// Transport: TRAIN
		graph[5].add(new Edge("darjeeling","kolkata",120,6,"Train"));
		graph[6].add(new Edge("kolkata","darjeeling",120,5,"Train"));
		// Transport: BUS
		graph[5].add(new Edge("darjeeling","kolkata",50,6,"Bus"));
		graph[6].add(new Edge("kolkata","darjeeling",50,5,"Bus"));
		// Transport: PLANE
		graph[5].add(new Edge("darjeeling","kolkata",1000,6,"Plane"));
		graph[6].add(new Edge("kolkata","darjeeling",1000,5,"Plane"));
	//kolkata & mysore
		// Transport: TRAIN
		graph[6].add(new Edge("kolkata","mysore",2000,7,"Train"));
		graph[7].add(new Edge("mysore","kolkata",2000,6,"Train"));
		// Transport: BUS
		graph[6].add(new Edge("kolkata","mysore",1700,7,"Bus"));
		graph[7].add(new Edge("mysore","kolkata",1700,6,"Bus"));
		// Transport: PLANE
		graph[6].add(new Edge("kolkata","mysore",1500,7,"Plane"));
		graph[7].add(new Edge("mysore","kolkata",1500,6,"Plane"));
		
		return graph;
	}
	// ADDING HOTEL DETAILS
	public static HashMap<String,HashMap<Integer,ArrayList<Hotels>>> addHotelDetails(){
		HashMap<String,HashMap<Integer,ArrayList<Hotels>>> allHotels=new HashMap<>();
		// DELHI
		HashMap<Integer,ArrayList<Hotels>> mapd=new HashMap<>();
		// 1 STAR
		ArrayList<Hotels> hosd=new ArrayList<>();
		hosd.add(new Hotels("Hotel Sunshine","Aakash",1));
		hosd.get(0).hotel_rooms.add(new Rooms("SINGLE",200));
		hosd.get(0).hotel_rooms.add(new Rooms("DOUBLE",400));
		hosd.get(0).hotel_rooms.add(new Rooms("TRIPLE",800));
		hosd.get(0).hotel_rooms.add(new Rooms("QUAD",1200));
		hosd.get(0).hotel_rooms.add(new Rooms("QUEEN",1500));
		hosd.get(0).hotel_rooms.add(new Rooms("KING",2000));
		hosd.get(0).hotel_rooms.add(new Rooms("TWIN",2300));
		hosd.get(0).hotel_rooms.add(new Rooms("DELUXE",2600));
		hosd.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3000));
		// 2 STAR
		ArrayList<Hotels> htsd=new ArrayList<>();
		htsd.add(new Hotels("Hotel Ritz","Rohan",2));
		htsd.get(0).hotel_rooms.add(new Rooms("SINGLE",350));
		htsd.get(0).hotel_rooms.add(new Rooms("DOUBLE",700));
		htsd.get(0).hotel_rooms.add(new Rooms("TRIPLE",1000));
		htsd.get(0).hotel_rooms.add(new Rooms("QUAD",1350));
		htsd.get(0).hotel_rooms.add(new Rooms("QUEEN",1800));
		htsd.get(0).hotel_rooms.add(new Rooms("KING",2200));
		htsd.get(0).hotel_rooms.add(new Rooms("TWIN",2500));
		htsd.get(0).hotel_rooms.add(new Rooms("DELUXE",2800));
		htsd.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3500));
		// 3 STAR
		ArrayList<Hotels> hthsd=new ArrayList<>();
		hthsd.add(new Hotels("Hotel RedFox","Priyanaka",3));
		hthsd.get(0).hotel_rooms.add(new Rooms("SINGLE",500));
		hthsd.get(0).hotel_rooms.add(new Rooms("DOUBLE",1000));
		hthsd.get(0).hotel_rooms.add(new Rooms("TRIPLE",1500));
		hthsd.get(0).hotel_rooms.add(new Rooms("QUAD",1800));
		hthsd.get(0).hotel_rooms.add(new Rooms("QUEEN",2100));
		hthsd.get(0).hotel_rooms.add(new Rooms("KING",2500));
		hthsd.get(0).hotel_rooms.add(new Rooms("TWIN",3000));
		hthsd.get(0).hotel_rooms.add(new Rooms("DELUXE",3500));
		hthsd.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4000));
		// 4 STAR
		ArrayList<Hotels> hfsd=new ArrayList<>();
		hfsd.add(new Hotels("Hotel ParkInn","Supriya",4));
		hfsd.get(0).hotel_rooms.add(new Rooms("SINGLE",800));
		hfsd.get(0).hotel_rooms.add(new Rooms("DOUBLE",1200));
		hfsd.get(0).hotel_rooms.add(new Rooms("TRIPLE",1800));
		hfsd.get(0).hotel_rooms.add(new Rooms("QUAD",2200));
		hfsd.get(0).hotel_rooms.add(new Rooms("QUEEN",2500));
		hfsd.get(0).hotel_rooms.add(new Rooms("KING",3000));
		hfsd.get(0).hotel_rooms.add(new Rooms("TWIN",3500));
		hfsd.get(0).hotel_rooms.add(new Rooms("DELUXE",4000));
		hfsd.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4500));
		// 5 STAR
		ArrayList<Hotels> hfisd=new ArrayList<>();
		hfisd.add(new Hotels("Hotel Hilton Garden Inn","Vijay",5));
		hfisd.get(0).hotel_rooms.add(new Rooms("SINGLE",1000));
		hfisd.get(0).hotel_rooms.add(new Rooms("DOUBLE",1500));
		hfisd.get(0).hotel_rooms.add(new Rooms("TRIPLE",2000));
		hfisd.get(0).hotel_rooms.add(new Rooms("QUAD",2500));
		hfisd.get(0).hotel_rooms.add(new Rooms("QUEEN",3000));
		hfisd.get(0).hotel_rooms.add(new Rooms("KING",3500));
		hfisd.get(0).hotel_rooms.add(new Rooms("TWIN",4000));
		hfisd.get(0).hotel_rooms.add(new Rooms("DELUXE",4500));
		hfisd.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",5000));

		mapd.put(1, hosd);
		mapd.put(2, htsd);
		mapd.put(3, hthsd);
		mapd.put(4, hfsd);
		mapd.put(5, hfisd);

		allHotels.put(places[0],mapd);

		// MANALI
		HashMap<Integer,ArrayList<Hotels>> mapm=new HashMap<>();
		// 1 STAR
		ArrayList<Hotels> hosm=new ArrayList<>();
		hosm.add(new Hotels("Hotel NeelKamal","Aakash",1));
		hosm.get(0).hotel_rooms.add(new Rooms("SINGLE",200));
		hosm.get(0).hotel_rooms.add(new Rooms("DOUBLE",400));
		hosm.get(0).hotel_rooms.add(new Rooms("TRIPLE",800));
		hosm.get(0).hotel_rooms.add(new Rooms("QUAD",1200));
		hosm.get(0).hotel_rooms.add(new Rooms("QUEEN",1500));
		hosm.get(0).hotel_rooms.add(new Rooms("KING",2000));
		hosm.get(0).hotel_rooms.add(new Rooms("TWIN",2300));
		hosm.get(0).hotel_rooms.add(new Rooms("DELUXE",2600));
		hosm.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3000));
		// 2 STAR
		ArrayList<Hotels> htsm=new ArrayList<>();
		htsm.add(new Hotels("Hotel Roxy","Rohan",2));
		htsm.get(0).hotel_rooms.add(new Rooms("SINGLE",350));
		htsm.get(0).hotel_rooms.add(new Rooms("DOUBLE",700));
		htsm.get(0).hotel_rooms.add(new Rooms("TRIPLE",1000));
		htsm.get(0).hotel_rooms.add(new Rooms("QUAD",1350));
		htsm.get(0).hotel_rooms.add(new Rooms("QUEEN",1800));
		htsm.get(0).hotel_rooms.add(new Rooms("KING",2200));
		htsm.get(0).hotel_rooms.add(new Rooms("TWIN",2500));
		htsm.get(0).hotel_rooms.add(new Rooms("DELUXE",2800));
		htsm.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3500));
		// 3 STAR
		ArrayList<Hotels> hthsm=new ArrayList<>();
		hthsm.add(new Hotels("Hotel Apple Paradise","Priyanaka",3));
		hthsm.get(0).hotel_rooms.add(new Rooms("SINGLE",500));
		hthsm.get(0).hotel_rooms.add(new Rooms("DOUBLE",1000));
		hthsm.get(0).hotel_rooms.add(new Rooms("TRIPLE",1500));
		hthsm.get(0).hotel_rooms.add(new Rooms("QUAD",1800));
		hthsm.get(0).hotel_rooms.add(new Rooms("QUEEN",2100));
		hthsm.get(0).hotel_rooms.add(new Rooms("KING",2500));
		hthsm.get(0).hotel_rooms.add(new Rooms("TWIN",3000));
		hthsm.get(0).hotel_rooms.add(new Rooms("DELUXE",3500));
		hthsm.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4000));
		// 4 STAR
		ArrayList<Hotels> hfsm=new ArrayList<>();
		hfsm.add(new Hotels("Hotel Snow Valley","Supriya",4));
		hfsm.get(0).hotel_rooms.add(new Rooms("SINGLE",800));
		hfsm.get(0).hotel_rooms.add(new Rooms("DOUBLE",1200));
		hfsm.get(0).hotel_rooms.add(new Rooms("TRIPLE",1800));
		hfsm.get(0).hotel_rooms.add(new Rooms("QUAD",2200));
		hfsm.get(0).hotel_rooms.add(new Rooms("QUEEN",2500));
		hfsm.get(0).hotel_rooms.add(new Rooms("KING",3000));
		hfsm.get(0).hotel_rooms.add(new Rooms("TWIN",3500));
		hfsm.get(0).hotel_rooms.add(new Rooms("DELUXE",4000));
		hfsm.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4500));
		// 5 STAR
		ArrayList<Hotels> hfism=new ArrayList<>();
		hfism.add(new Hotels("Hotel Woodlines","Vijay",5));
		hfism.get(0).hotel_rooms.add(new Rooms("SINGLE",1000));
		hfism.get(0).hotel_rooms.add(new Rooms("DOUBLE",1500));
		hfism.get(0).hotel_rooms.add(new Rooms("TRIPLE",2000));
		hfism.get(0).hotel_rooms.add(new Rooms("QUAD",2500));
		hfism.get(0).hotel_rooms.add(new Rooms("QUEEN",3000));
		hfism.get(0).hotel_rooms.add(new Rooms("KING",3500));
		hfism.get(0).hotel_rooms.add(new Rooms("TWIN",4000));
		hfism.get(0).hotel_rooms.add(new Rooms("DELUXE",4500));
		hfism.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",5000));

		mapm.put(1, hosm);
		mapm.put(2, htsm);
		mapm.put(3, hthsm);
		mapm.put(4, hfsm);
		mapm.put(5, hfism);

		allHotels.put(places[1],mapm);

		// JAIPUR
		HashMap<Integer,ArrayList<Hotels>> mapj=new HashMap<>();
		// 1 STAR
		ArrayList<Hotels> hosj=new ArrayList<>();
		hosj.add(new Hotels("Hotel Shiv Palace","Aakash",1));
		hosj.get(0).hotel_rooms.add(new Rooms("SINGLE",200));
		hosj.get(0).hotel_rooms.add(new Rooms("DOUBLE",400));
		hosj.get(0).hotel_rooms.add(new Rooms("TRIPLE",800));
		hosj.get(0).hotel_rooms.add(new Rooms("QUAD",1200));
		hosj.get(0).hotel_rooms.add(new Rooms("QUEEN",1500));
		hosj.get(0).hotel_rooms.add(new Rooms("KING",2000));
		hosj.get(0).hotel_rooms.add(new Rooms("TWIN",2300));
		hosj.get(0).hotel_rooms.add(new Rooms("DELUXE",2600));
		hosj.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3000));
		// 2 STAR
		ArrayList<Hotels> htsj=new ArrayList<>();
		htsd.add(new Hotels("Hotel Evergreen","Rohan",2));
		htsd.get(0).hotel_rooms.add(new Rooms("SINGLE",350));
		htsd.get(0).hotel_rooms.add(new Rooms("DOUBLE",700));
		htsd.get(0).hotel_rooms.add(new Rooms("TRIPLE",1000));
		htsd.get(0).hotel_rooms.add(new Rooms("QUAD",1350));
		htsd.get(0).hotel_rooms.add(new Rooms("QUEEN",1800));
		htsd.get(0).hotel_rooms.add(new Rooms("KING",2200));
		htsd.get(0).hotel_rooms.add(new Rooms("TWIN",2500));
		htsd.get(0).hotel_rooms.add(new Rooms("DELUXE",2800));
		htsd.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3500));
		// 3 STAR
		ArrayList<Hotels> hthsj=new ArrayList<>();
		hthsj.add(new Hotels("Hotel Ibis Jaipur","Priyanaka",3));
		hthsj.get(0).hotel_rooms.add(new Rooms("SINGLE",500));
		hthsj.get(0).hotel_rooms.add(new Rooms("DOUBLE",1000));
		hthsj.get(0).hotel_rooms.add(new Rooms("TRIPLE",1500));
		hthsj.get(0).hotel_rooms.add(new Rooms("QUAD",1800));
		hthsj.get(0).hotel_rooms.add(new Rooms("QUEEN",2100));
		hthsj.get(0).hotel_rooms.add(new Rooms("KING",2500));
		hthsj.get(0).hotel_rooms.add(new Rooms("TWIN",3000));
		hthsj.get(0).hotel_rooms.add(new Rooms("DELUXE",3500));
		hthsj.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4000));
		// 4 STAR
		ArrayList<Hotels> hfsj=new ArrayList<>();
		hfsj.add(new Hotels("Hotel Leisure Inn Grand","Supriya",4));
		hfsj.get(0).hotel_rooms.add(new Rooms("SINGLE",800));
		hfsj.get(0).hotel_rooms.add(new Rooms("DOUBLE",1200));
		hfsj.get(0).hotel_rooms.add(new Rooms("TRIPLE",1800));
		hfsj.get(0).hotel_rooms.add(new Rooms("QUAD",2200));
		hfsj.get(0).hotel_rooms.add(new Rooms("QUEEN",2500));
		hfsj.get(0).hotel_rooms.add(new Rooms("KING",3000));
		hfsj.get(0).hotel_rooms.add(new Rooms("TWIN",3500));
		hfsj.get(0).hotel_rooms.add(new Rooms("DELUXE",4000));
		hfsj.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4500));
		// 5 STAR
		ArrayList<Hotels> hfisj=new ArrayList<>();
		hfisj.add(new Hotels("Hotel Jaipur Mariott","Vijay",5));
		hfisj.get(0).hotel_rooms.add(new Rooms("SINGLE",1000));
		hfisj.get(0).hotel_rooms.add(new Rooms("DOUBLE",1500));
		hfisj.get(0).hotel_rooms.add(new Rooms("TRIPLE",2000));
		hfisj.get(0).hotel_rooms.add(new Rooms("QUAD",2500));
		hfisj.get(0).hotel_rooms.add(new Rooms("QUEEN",3000));
		hfisj.get(0).hotel_rooms.add(new Rooms("KING",3500));
		hfisj.get(0).hotel_rooms.add(new Rooms("TWIN",4000));
		hfisj.get(0).hotel_rooms.add(new Rooms("DELUXE",4500));
		hfisj.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",5000));

		mapj.put(1, hosj);
		mapj.put(2, htsj);
		mapj.put(3, hthsj);
		mapj.put(4, hfsj);
		mapj.put(5, hfisj);

		allHotels.put(places[2],mapj);

		// MUMBAI
		HashMap<Integer,ArrayList<Hotels>> mapb=new HashMap<>();
		// 1 STAR
		ArrayList<Hotels> hosb=new ArrayList<>();
		hosb.add(new Hotels("Hotel Oasis","Aakash",1));
		hosb.get(0).hotel_rooms.add(new Rooms("SINGLE",200));
		hosb.get(0).hotel_rooms.add(new Rooms("DOUBLE",400));
		hosb.get(0).hotel_rooms.add(new Rooms("TRIPLE",800));
		hosb.get(0).hotel_rooms.add(new Rooms("QUAD",1200));
		hosb.get(0).hotel_rooms.add(new Rooms("QUEEN",1500));
		hosb.get(0).hotel_rooms.add(new Rooms("KING",2000));
		hosb.get(0).hotel_rooms.add(new Rooms("TWIN",2300));
		hosb.get(0).hotel_rooms.add(new Rooms("DELUXE",2600));
		hosb.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3000));
		// 2 STAR
		ArrayList<Hotels> htsb=new ArrayList<>();
		htsb.add(new Hotels("Hotel Kemps Corner","Rohan",2));
		htsb.get(0).hotel_rooms.add(new Rooms("SINGLE",350));
		htsb.get(0).hotel_rooms.add(new Rooms("DOUBLE",700));
		htsb.get(0).hotel_rooms.add(new Rooms("TRIPLE",1000));
		htsb.get(0).hotel_rooms.add(new Rooms("QUAD",1350));
		htsb.get(0).hotel_rooms.add(new Rooms("QUEEN",1800));
		htsb.get(0).hotel_rooms.add(new Rooms("KING",2200));
		htsb.get(0).hotel_rooms.add(new Rooms("TWIN",2500));
		htsb.get(0).hotel_rooms.add(new Rooms("DELUXE",2800));
		htsb.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3500));
		// 3 STAR
		ArrayList<Hotels> hthsb=new ArrayList<>();
		hthsb.add(new Hotels("Hotel Bawa Continental","Priyanaka",3));
		hthsb.get(0).hotel_rooms.add(new Rooms("SINGLE",500));
		hthsb.get(0).hotel_rooms.add(new Rooms("DOUBLE",1000));
		hthsb.get(0).hotel_rooms.add(new Rooms("TRIPLE",1500));
		hthsb.get(0).hotel_rooms.add(new Rooms("QUAD",1800));
		hthsb.get(0).hotel_rooms.add(new Rooms("QUEEN",2100));
		hthsb.get(0).hotel_rooms.add(new Rooms("KING",2500));
		hthsb.get(0).hotel_rooms.add(new Rooms("TWIN",3000));
		hthsb.get(0).hotel_rooms.add(new Rooms("DELUXE",3500));
		hthsb.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4000));

		// 4 STAR
		ArrayList<Hotels> hfsb=new ArrayList<>();
		hfsb.add(new Hotels("Hotel Cliffton","Supriya",4));
		hfsb.get(0).hotel_rooms.add(new Rooms("SINGLE",800));
		hfsb.get(0).hotel_rooms.add(new Rooms("DOUBLE",1200));
		hfsb.get(0).hotel_rooms.add(new Rooms("TRIPLE",1800));
		hfsb.get(0).hotel_rooms.add(new Rooms("QUAD",2200));
		hfsb.get(0).hotel_rooms.add(new Rooms("QUEEN",2500));
		hfsb.get(0).hotel_rooms.add(new Rooms("KING",3000));
		hfsb.get(0).hotel_rooms.add(new Rooms("TWIN",3500));
		hfsb.get(0).hotel_rooms.add(new Rooms("DELUXE",4000));
		hfsb.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4500));
		// 5 STAR
		ArrayList<Hotels> hfisb=new ArrayList<>();
		hfisb.add(new Hotels("Taj Hotel","Vijay",5));
		hfisb.get(0).hotel_rooms.add(new Rooms("SINGLE",1000));
		hfisb.get(0).hotel_rooms.add(new Rooms("DOUBLE",1500));
		hfisb.get(0).hotel_rooms.add(new Rooms("TRIPLE",2000));
		hfisb.get(0).hotel_rooms.add(new Rooms("QUAD",2500));
		hfisb.get(0).hotel_rooms.add(new Rooms("QUEEN",3000));
		hfisb.get(0).hotel_rooms.add(new Rooms("KING",3500));
		hfisb.get(0).hotel_rooms.add(new Rooms("TWIN",4000));
		hfisb.get(0).hotel_rooms.add(new Rooms("DELUXE",4500));
		hfisb.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",5000));

		mapb.put(1, hosb);
		mapb.put(2, htsb);
		mapb.put(3, hthsb);
		mapb.put(4, hfsb);
		mapb.put(5, hfisb);

		allHotels.put(places[3],mapb);

        // SRINAGAR
		HashMap<Integer,ArrayList<Hotels>> maps=new HashMap<>();
		// 1 STAR
		ArrayList<Hotels> hoss=new ArrayList<>();
		hoss.add(new Hotels("Hotel Newgreen View","Aakash",1));
		hoss.get(0).hotel_rooms.add(new Rooms("SINGLE",200));
		hoss.get(0).hotel_rooms.add(new Rooms("DOUBLE",400));
		hoss.get(0).hotel_rooms.add(new Rooms("TRIPLE",800));
		hoss.get(0).hotel_rooms.add(new Rooms("QUAD",1200));
		hoss.get(0).hotel_rooms.add(new Rooms("QUEEN",1500));
		hoss.get(0).hotel_rooms.add(new Rooms("KING",2000));
		hoss.get(0).hotel_rooms.add(new Rooms("TWIN",2300));
		hoss.get(0).hotel_rooms.add(new Rooms("DELUXE",2600));
		hoss.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3000));
		// 2 STAR
		ArrayList<Hotels> htss=new ArrayList<>();
		htss.add(new Hotels("Hotel Humzaa","Rohan",2));
		htss.get(0).hotel_rooms.add(new Rooms("SINGLE",350));
		htss.get(0).hotel_rooms.add(new Rooms("DOUBLE",700));
		htss.get(0).hotel_rooms.add(new Rooms("TRIPLE",1000));
		htss.get(0).hotel_rooms.add(new Rooms("QUAD",1350));
		htss.get(0).hotel_rooms.add(new Rooms("QUEEN",1800));
		htss.get(0).hotel_rooms.add(new Rooms("KING",2200));
		htss.get(0).hotel_rooms.add(new Rooms("TWIN",2500));
		htss.get(0).hotel_rooms.add(new Rooms("DELUXE",2800));
		htss.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3500));
		// 3 STAR
		ArrayList<Hotels> hthss=new ArrayList<>();
		hthss.add(new Hotels("Hotel Metropolis","Priyanaka",3));
		hthss.get(0).hotel_rooms.add(new Rooms("SINGLE",500));
		hthss.get(0).hotel_rooms.add(new Rooms("DOUBLE",1000));
		hthss.get(0).hotel_rooms.add(new Rooms("TRIPLE",1500));
		hthss.get(0).hotel_rooms.add(new Rooms("QUAD",1800));
		hthss.get(0).hotel_rooms.add(new Rooms("QUEEN",2100));
		hthss.get(0).hotel_rooms.add(new Rooms("KING",2500));
		hthss.get(0).hotel_rooms.add(new Rooms("TWIN",3000));
		hthss.get(0).hotel_rooms.add(new Rooms("DELUXE",3500));
		hthss.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4000));
		// 4 STAR
		ArrayList<Hotels> hfss=new ArrayList<>();
		hfss.add(new Hotels("Hotel The Grand Mamta","Supriya",4));
		hfss.get(0).hotel_rooms.add(new Rooms("SINGLE",800));
		hfss.get(0).hotel_rooms.add(new Rooms("DOUBLE",1200));
		hfss.get(0).hotel_rooms.add(new Rooms("TRIPLE",1800));
		hfss.get(0).hotel_rooms.add(new Rooms("QUAD",2200));
		hfss.get(0).hotel_rooms.add(new Rooms("QUEEN",2500));
		hfss.get(0).hotel_rooms.add(new Rooms("KING",3000));
		hfss.get(0).hotel_rooms.add(new Rooms("TWIN",3500));
		hfss.get(0).hotel_rooms.add(new Rooms("DELUXE",4000));
		hfss.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4500));
		// 5 STAR
		ArrayList<Hotels> hfiss=new ArrayList<>();
		hfiss.add(new Hotels("Hotel Radisson Srinagar","Vijay",5));
		hfiss.get(0).hotel_rooms.add(new Rooms("SINGLE",1000));
		hfiss.get(0).hotel_rooms.add(new Rooms("DOUBLE",1500));
		hfiss.get(0).hotel_rooms.add(new Rooms("TRIPLE",2000));
		hfiss.get(0).hotel_rooms.add(new Rooms("QUAD",2500));
		hfiss.get(0).hotel_rooms.add(new Rooms("QUEEN",3000));
		hfiss.get(0).hotel_rooms.add(new Rooms("KING",3500));
		hfiss.get(0).hotel_rooms.add(new Rooms("TWIN",4000));
		hfiss.get(0).hotel_rooms.add(new Rooms("DELUXE",4500));
		hfiss.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",5000));

		maps.put(1, hoss);
		maps.put(2, htss);
		maps.put(3, hthss);
		maps.put(4, hfss);
		maps.put(5, hfiss);

		allHotels.put(places[4],maps);

		// DARJEELING
		HashMap<Integer,ArrayList<Hotels>> mapdj=new HashMap<>();
		// 1 STAR
		ArrayList<Hotels> hosdj=new ArrayList<>();
		hosdj.add(new Hotels("Hotel Seven Seas","Aakash",1));
		hosdj.get(0).hotel_rooms.add(new Rooms("SINGLE",200));
		hosdj.get(0).hotel_rooms.add(new Rooms("DOUBLE",400));
		hosdj.get(0).hotel_rooms.add(new Rooms("TRIPLE",800));
		hosdj.get(0).hotel_rooms.add(new Rooms("QUAD",1200));
		hosdj.get(0).hotel_rooms.add(new Rooms("QUEEN",1500));
		hosdj.get(0).hotel_rooms.add(new Rooms("KING",2000));
		hosdj.get(0).hotel_rooms.add(new Rooms("TWIN",2300));
		hosdj.get(0).hotel_rooms.add(new Rooms("DELUXE",2600));
		hosdj.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3000));
		// 2 STAR
		ArrayList<Hotels> htsdj=new ArrayList<>();
		htsdj.add(new Hotels("Hotel Sandrup","Rohan",2));
		htsdj.get(0).hotel_rooms.add(new Rooms("SINGLE",350));
		htsdj.get(0).hotel_rooms.add(new Rooms("DOUBLE",700));
		htsdj.get(0).hotel_rooms.add(new Rooms("TRIPLE",1000));
		htsdj.get(0).hotel_rooms.add(new Rooms("QUAD",1350));
		htsdj.get(0).hotel_rooms.add(new Rooms("QUEEN",1800));
		htsdj.get(0).hotel_rooms.add(new Rooms("KING",2200));
		htsdj.get(0).hotel_rooms.add(new Rooms("TWIN",2500));
		htsdj.get(0).hotel_rooms.add(new Rooms("DELUXE",2800));
		htsdj.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3500));
		// 3 STAR
		ArrayList<Hotels> hthsdj=new ArrayList<>();
		hthsdj.add(new Hotels("Hotel Mystic Rodhi","Priyanaka",3));
		hthsdj.get(0).hotel_rooms.add(new Rooms("SINGLE",500));
		hthsdj.get(0).hotel_rooms.add(new Rooms("DOUBLE",1000));
		hthsdj.get(0).hotel_rooms.add(new Rooms("TRIPLE",1500));
		hthsdj.get(0).hotel_rooms.add(new Rooms("QUAD",1800));
		hthsdj.get(0).hotel_rooms.add(new Rooms("QUEEN",2100));
		hthsdj.get(0).hotel_rooms.add(new Rooms("KING",2500));
		hthsdj.get(0).hotel_rooms.add(new Rooms("TWIN",3000));
		hthsdj.get(0).hotel_rooms.add(new Rooms("DELUXE",3500));
		hthsdj.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4000));
		// 4 STAR
		ArrayList<Hotels> hfsdj=new ArrayList<>();
		hfsdj.add(new Hotels("Hotel Pine & Ferns","Supriya",4));
		hfsdj.get(0).hotel_rooms.add(new Rooms("SINGLE",800));
		hfsdj.get(0).hotel_rooms.add(new Rooms("DOUBLE",1200));
		hfsdj.get(0).hotel_rooms.add(new Rooms("TRIPLE",1800));
		hfsdj.get(0).hotel_rooms.add(new Rooms("QUAD",2200));
		hfsdj.get(0).hotel_rooms.add(new Rooms("QUEEN",2500));
		hfsdj.get(0).hotel_rooms.add(new Rooms("KING",3000));
		hfsdj.get(0).hotel_rooms.add(new Rooms("TWIN",3500));
		hfsdj.get(0).hotel_rooms.add(new Rooms("DELUXE",4000));
		hfsdj.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4500));
		// 5 STAR
		ArrayList<Hotels> hfisdj=new ArrayList<>();
		hfisdj.add(new Hotels("Hotel The Summer Capital","Vijay",5));
		hfisdj.get(0).hotel_rooms.add(new Rooms("SINGLE",1000));
		hfisdj.get(0).hotel_rooms.add(new Rooms("DOUBLE",1500));
		hfisdj.get(0).hotel_rooms.add(new Rooms("TRIPLE",2000));
		hfisdj.get(0).hotel_rooms.add(new Rooms("QUAD",2500));
		hfisdj.get(0).hotel_rooms.add(new Rooms("QUEEN",3000));
		hfisdj.get(0).hotel_rooms.add(new Rooms("KING",3500));
		hfisdj.get(0).hotel_rooms.add(new Rooms("TWIN",4000));
		hfisdj.get(0).hotel_rooms.add(new Rooms("DELUXE",4500));
		hfisdj.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",5000));

		mapj.put(1, hosdj);
		mapj.put(2, htsdj);
		mapj.put(3, hthsj);
		mapj.put(4, hfsdj);
		mapj.put(5, hfisdj);

		allHotels.put(places[5],mapj);

		// KOLKATA
		HashMap<Integer,ArrayList<Hotels>> mapk=new HashMap<>();
		// 1 STAR
		ArrayList<Hotels> hosk=new ArrayList<>();
		hosk.add(new Hotels("Hotel Jimmy","Aakash",1));
		hosk.get(0).hotel_rooms.add(new Rooms("SINGLE",200));
		hosk.get(0).hotel_rooms.add(new Rooms("DOUBLE",400));
		hosk.get(0).hotel_rooms.add(new Rooms("TRIPLE",800));
		hosk.get(0).hotel_rooms.add(new Rooms("QUAD",1200));
		hosk.get(0).hotel_rooms.add(new Rooms("QUEEN",1500));
		hosk.get(0).hotel_rooms.add(new Rooms("KING",2000));
		hosk.get(0).hotel_rooms.add(new Rooms("TWIN",2300));
		hosk.get(0).hotel_rooms.add(new Rooms("DELUXE",2600));
		hosk.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3000));
		// 2 STAR
		ArrayList<Hotels> htsk=new ArrayList<>();
		htsk.add(new Hotels("Hotel Park Street","Rohan",2));
		htsk.get(0).hotel_rooms.add(new Rooms("SINGLE",350));
		htsk.get(0).hotel_rooms.add(new Rooms("DOUBLE",700));
		htsk.get(0).hotel_rooms.add(new Rooms("TRIPLE",1000));
		htsk.get(0).hotel_rooms.add(new Rooms("QUAD",1350));
		htsk.get(0).hotel_rooms.add(new Rooms("QUEEN",1800));
		htsk.get(0).hotel_rooms.add(new Rooms("KING",2200));
		htsk.get(0).hotel_rooms.add(new Rooms("TWIN",2500));
		htsk.get(0).hotel_rooms.add(new Rooms("DELUXE",2800));
		htsk.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3500));
		// 3 STAR
		ArrayList<Hotels> hthsk=new ArrayList<>();
		hthsk.add(new Hotels("Hotel Town House","Priyanaka",3));
		hthsk.get(0).hotel_rooms.add(new Rooms("SINGLE",500));
		hthsk.get(0).hotel_rooms.add(new Rooms("DOUBLE",1000));
		hthsk.get(0).hotel_rooms.add(new Rooms("TRIPLE",1500));
		hthsk.get(0).hotel_rooms.add(new Rooms("QUAD",1800));
		hthsk.get(0).hotel_rooms.add(new Rooms("QUEEN",2100));
		hthsk.get(0).hotel_rooms.add(new Rooms("KING",2500));
		hthsk.get(0).hotel_rooms.add(new Rooms("TWIN",3000));
		hthsk.get(0).hotel_rooms.add(new Rooms("DELUXE",3500));
		hthsk.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4000));
		// 4 STAR
		ArrayList<Hotels> hfsk=new ArrayList<>();
		hfsk.add(new Hotels("Hotel Golder Tulip","Supriya",4));
		hfsk.get(0).hotel_rooms.add(new Rooms("SINGLE",800));
		hfsk.get(0).hotel_rooms.add(new Rooms("DOUBLE",1200));
		hfsk.get(0).hotel_rooms.add(new Rooms("TRIPLE",1800));
		hfsk.get(0).hotel_rooms.add(new Rooms("QUAD",2200));
		hfsk.get(0).hotel_rooms.add(new Rooms("QUEEN",2500));
		hfsk.get(0).hotel_rooms.add(new Rooms("KING",3000));
		hfsk.get(0).hotel_rooms.add(new Rooms("TWIN",3500));
		hfsk.get(0).hotel_rooms.add(new Rooms("DELUXE",4000));
		hfsk.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4500));
		// 5 STAR
		ArrayList<Hotels> hfisk=new ArrayList<>();
		hfisk.add(new Hotels("Hotel Taj Bengal","Vijay",5));
		hfisk.get(0).hotel_rooms.add(new Rooms("SINGLE",1000));
		hfisk.get(0).hotel_rooms.add(new Rooms("DOUBLE",1500));
		hfisk.get(0).hotel_rooms.add(new Rooms("TRIPLE",2000));
		hfisk.get(0).hotel_rooms.add(new Rooms("QUAD",2500));
		hfisk.get(0).hotel_rooms.add(new Rooms("QUEEN",3000));
		hfisk.get(0).hotel_rooms.add(new Rooms("KING",3500));
		hfisk.get(0).hotel_rooms.add(new Rooms("TWIN",4000));
		hfisk.get(0).hotel_rooms.add(new Rooms("DELUXE",4500));
		hfisk.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",5000));
		mapk.put(1, hosk);
		mapk.put(2, htsk);
		mapk.put(3, hthsk);
		mapk.put(4, hfsk);
		mapk.put(5, hfisk);

		allHotels.put(places[6],mapk);

		// MYSORE
		HashMap<Integer,ArrayList<Hotels>> mapmy=new HashMap<>();
		// 1 STAR
		ArrayList<Hotels> hosmy=new ArrayList<>();
		hosmy.add(new Hotels("Hotel Golden Residency","Aakash",1));
		hosmy.get(0).hotel_rooms.add(new Rooms("SINGLE",200));
		hosmy.get(0).hotel_rooms.add(new Rooms("DOUBLE",400));
		hosmy.get(0).hotel_rooms.add(new Rooms("TRIPLE",800));
		hosmy.get(0).hotel_rooms.add(new Rooms("QUAD",1200));
		hosmy.get(0).hotel_rooms.add(new Rooms("QUEEN",1500));
		hosmy.get(0).hotel_rooms.add(new Rooms("KING",2000));
		hosmy.get(0).hotel_rooms.add(new Rooms("TWIN",2300));
		hosmy.get(0).hotel_rooms.add(new Rooms("DELUXE",2600));
		hosmy.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3000));
		// 2 STAR
		ArrayList<Hotels> htsmy=new ArrayList<>();
		htsmy.add(new Hotels("Hotel Grand Maurya","Rohan",2));
		htsmy.get(0).hotel_rooms.add(new Rooms("SINGLE",350));
		htsmy.get(0).hotel_rooms.add(new Rooms("DOUBLE",700));
		htsmy.get(0).hotel_rooms.add(new Rooms("TRIPLE",1000));
		htsmy.get(0).hotel_rooms.add(new Rooms("QUAD",1350));
		htsmy.get(0).hotel_rooms.add(new Rooms("QUEEN",1800));
		htsmy.get(0).hotel_rooms.add(new Rooms("KING",2200));
		htsmy.get(0).hotel_rooms.add(new Rooms("TWIN",2500));
		htsmy.get(0).hotel_rooms.add(new Rooms("DELUXE",2800));
		htsmy.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3500));
		// 3 STAR
		ArrayList<Hotels> hthsmy=new ArrayList<>();
		hthsmy.add(new Hotels("Hotel Heritage Inn","Priyanaka",3));
		hthsmy.get(0).hotel_rooms.add(new Rooms("SINGLE",500));
		hthsmy.get(0).hotel_rooms.add(new Rooms("DOUBLE",1000));
		hthsmy.get(0).hotel_rooms.add(new Rooms("TRIPLE",1500));
		hthsmy.get(0).hotel_rooms.add(new Rooms("QUAD",1800));
		hthsmy.get(0).hotel_rooms.add(new Rooms("QUEEN",2100));
		hthsmy.get(0).hotel_rooms.add(new Rooms("KING",2500));
		hthsmy.get(0).hotel_rooms.add(new Rooms("TWIN",3000));
		hthsmy.get(0).hotel_rooms.add(new Rooms("DELUXE",3500));
		hthsmy.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4000));
		// 4 STAR
		ArrayList<Hotels> hfsmy=new ArrayList<>();
		hfsmy.add(new Hotels("Hotel Rio Meridian","Supriya",4));
		hfsmy.get(0).hotel_rooms.add(new Rooms("SINGLE",800));
		hfsmy.get(0).hotel_rooms.add(new Rooms("DOUBLE",1200));
		hfsmy.get(0).hotel_rooms.add(new Rooms("TRIPLE",1800));
		hfsmy.get(0).hotel_rooms.add(new Rooms("QUAD",2200));
		hfsmy.get(0).hotel_rooms.add(new Rooms("QUEEN",2500));
		hfsmy.get(0).hotel_rooms.add(new Rooms("KING",3000));
		hfsmy.get(0).hotel_rooms.add(new Rooms("TWIN",3500));
		hfsmy.get(0).hotel_rooms.add(new Rooms("DELUXE",4000));
		hfsmy.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4500));
		// 5 STAR
		ArrayList<Hotels> hfismy=new ArrayList<>();
		hfismy.add(new Hotels("Hotel Radisson Blu Plaza","Vijay",5));
		hfismy.get(0).hotel_rooms.add(new Rooms("SINGLE",1000));
		hfismy.get(0).hotel_rooms.add(new Rooms("DOUBLE",1500));
		hfismy.get(0).hotel_rooms.add(new Rooms("TRIPLE",2000));
		hfismy.get(0).hotel_rooms.add(new Rooms("QUAD",2500));
		hfismy.get(0).hotel_rooms.add(new Rooms("QUEEN",3000));
		hfismy.get(0).hotel_rooms.add(new Rooms("KING",3500));
		hfismy.get(0).hotel_rooms.add(new Rooms("TWIN",4000));
		hfismy.get(0).hotel_rooms.add(new Rooms("DELUXE",4500));
		hfismy.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",5000));

		mapmy.put(1, hosmy);
		mapmy.put(2, htsmy);
		mapmy.put(3, hthsmy);
		mapmy.put(4, hfsmy);
		mapmy.put(5, hfismy);

		allHotels.put(places[7],mapmy);

        // MUSSOORIE
		HashMap<Integer,ArrayList<Hotels>> mapmu=new HashMap<>();
		// 1 STAR
		ArrayList<Hotels> hosmu=new ArrayList<>();
		hosmu.add(new Hotels("Hotel Natraj","Aakash",1));
		hosmu.get(0).hotel_rooms.add(new Rooms("SINGLE",200));
		hosmu.get(0).hotel_rooms.add(new Rooms("DOUBLE",400));
		hosmu.get(0).hotel_rooms.add(new Rooms("TRIPLE",800));
		hosmu.get(0).hotel_rooms.add(new Rooms("QUAD",1200));
		hosmu.get(0).hotel_rooms.add(new Rooms("QUEEN",1500));
		hosmu.get(0).hotel_rooms.add(new Rooms("KING",2000));
		hosmu.get(0).hotel_rooms.add(new Rooms("TWIN",2300));
		hosmu.get(0).hotel_rooms.add(new Rooms("DELUXE",2600));
		hosmu.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3000));
		// 2 STAR
		ArrayList<Hotels> htsmu=new ArrayList<>();
		htsmu.add(new Hotels("Hotel City Castle","Rohan",2));
		htsmu.get(0).hotel_rooms.add(new Rooms("SINGLE",350));
		htsmu.get(0).hotel_rooms.add(new Rooms("DOUBLE",700));
		htsmu.get(0).hotel_rooms.add(new Rooms("TRIPLE",1000));
		htsmu.get(0).hotel_rooms.add(new Rooms("QUAD",1350));
		htsmu.get(0).hotel_rooms.add(new Rooms("QUEEN",1800));
		htsmu.get(0).hotel_rooms.add(new Rooms("KING",2200));
		htsmu.get(0).hotel_rooms.add(new Rooms("TWIN",2500));
		htsmu.get(0).hotel_rooms.add(new Rooms("DELUXE",2800));
		htsmu.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3500));
		// 3 STAR
		ArrayList<Hotels> hthsmu=new ArrayList<>();
		hthsmu.add(new Hotels("Hotel Sun N Snow","Priyanaka",3));
		hthsmu.get(0).hotel_rooms.add(new Rooms("SINGLE",500));
		hthsmu.get(0).hotel_rooms.add(new Rooms("DOUBLE",1000));
		hthsmu.get(0).hotel_rooms.add(new Rooms("TRIPLE",1500));
		hthsmu.get(0).hotel_rooms.add(new Rooms("QUAD",1800));
		hthsmu.get(0).hotel_rooms.add(new Rooms("QUEEN",2100));
		hthsmu.get(0).hotel_rooms.add(new Rooms("KING",2500));
		hthsmu.get(0).hotel_rooms.add(new Rooms("TWIN",3000));
		hthsmu.get(0).hotel_rooms.add(new Rooms("DELUXE",3500));
		hthsmu.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4000));

		// 4 STAR
		ArrayList<Hotels> hfsmu=new ArrayList<>();
		hfsmu.add(new Hotels("Hotel Sterling Mussoorie","Supriya",4));
		hfsmu.get(0).hotel_rooms.add(new Rooms("SINGLE",800));
		hfsmu.get(0).hotel_rooms.add(new Rooms("DOUBLE",1200));
		hfsmu.get(0).hotel_rooms.add(new Rooms("TRIPLE",1800));
		hfsmu.get(0).hotel_rooms.add(new Rooms("QUAD",2200));
		hfsmu.get(0).hotel_rooms.add(new Rooms("QUEEN",2500));
		hfsmu.get(0).hotel_rooms.add(new Rooms("KING",3000));
		hfsmu.get(0).hotel_rooms.add(new Rooms("TWIN",3500));
		hfsmu.get(0).hotel_rooms.add(new Rooms("DELUXE",4000));
		hfsmu.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4500));
		// 5 STAR
		ArrayList<Hotels> hfismu=new ArrayList<>();
		hfismu.add(new Hotels("Hotel JW Mariot","Vijay",5));
		hfismu.get(0).hotel_rooms.add(new Rooms("SINGLE",1000));
		hfismu.get(0).hotel_rooms.add(new Rooms("DOUBLE",1500));
		hfismu.get(0).hotel_rooms.add(new Rooms("TRIPLE",2000));
		hfismu.get(0).hotel_rooms.add(new Rooms("QUAD",2500));
		hfismu.get(0).hotel_rooms.add(new Rooms("QUEEN",3000));
		hfismu.get(0).hotel_rooms.add(new Rooms("KING",3500));
		hfismu.get(0).hotel_rooms.add(new Rooms("TWIN",4000));
		hfismu.get(0).hotel_rooms.add(new Rooms("DELUXE",4500));
		hfismu.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",5000));

		mapmu.put(1, hosmu);
		mapmu.put(2, htsmu);
		mapmu.put(3, hthsmu);
		mapmu.put(4, hfsmu);
		mapmu.put(5, hfismu);

		allHotels.put(places[8],mapmu);

		// SHIMLA
		HashMap<Integer,ArrayList<Hotels>> mapsh=new HashMap<>();
		// 1 STAR
		ArrayList<Hotels> hossh=new ArrayList<>();
		hossh.add(new Hotels("Hotel Omkar","Aakash",1));
		hossh.get(0).hotel_rooms.add(new Rooms("SINGLE",200));
		hossh.get(0).hotel_rooms.add(new Rooms("DOUBLE",400));
		hossh.get(0).hotel_rooms.add(new Rooms("TRIPLE",800));
		hossh.get(0).hotel_rooms.add(new Rooms("QUAD",1200));
		hossh.get(0).hotel_rooms.add(new Rooms("QUEEN",1500));
		hossh.get(0).hotel_rooms.add(new Rooms("KING",2000));
		hossh.get(0).hotel_rooms.add(new Rooms("TWIN",2300));
		hossh.get(0).hotel_rooms.add(new Rooms("DELUXE",2600));
		hossh.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3000));
		// 2 STAR
		ArrayList<Hotels> htssh=new ArrayList<>();
		htssh.add(new Hotels("Hotel WoodPark","Rohan",2));
		htssh.get(0).hotel_rooms.add(new Rooms("SINGLE",350));
		htssh.get(0).hotel_rooms.add(new Rooms("DOUBLE",700));
		htssh.get(0).hotel_rooms.add(new Rooms("TRIPLE",1000));
		htssh.get(0).hotel_rooms.add(new Rooms("QUAD",1350));
		htssh.get(0).hotel_rooms.add(new Rooms("QUEEN",1800));
		htssh.get(0).hotel_rooms.add(new Rooms("KING",2200));
		htssh.get(0).hotel_rooms.add(new Rooms("TWIN",2500));
		htssh.get(0).hotel_rooms.add(new Rooms("DELUXE",2800));
		htssh.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",3500));
		// 3 STAR
		ArrayList<Hotels> hthssh=new ArrayList<>();
		hthssh.add(new Hotels("Hotel Cristle Palace","Priyanaka",3));
		hthssh.get(0).hotel_rooms.add(new Rooms("SINGLE",500));
		hthssh.get(0).hotel_rooms.add(new Rooms("DOUBLE",1000));
		hthssh.get(0).hotel_rooms.add(new Rooms("TRIPLE",1500));
		hthssh.get(0).hotel_rooms.add(new Rooms("QUAD",1800));
		hthssh.get(0).hotel_rooms.add(new Rooms("QUEEN",2100));
		hthssh.get(0).hotel_rooms.add(new Rooms("KING",2500));
		hthssh.get(0).hotel_rooms.add(new Rooms("TWIN",3000));
		hthssh.get(0).hotel_rooms.add(new Rooms("DELUXE",3500));
		hthssh.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4000));
		// 4 STAR
		ArrayList<Hotels> hfssh=new ArrayList<>();
		hfssh.add(new Hotels("Hotel The Manor Service","Supriya",4));
		hfssh.get(0).hotel_rooms.add(new Rooms("SINGLE",800));
		hfssh.get(0).hotel_rooms.add(new Rooms("DOUBLE",1200));
		hfssh.get(0).hotel_rooms.add(new Rooms("TRIPLE",1800));
		hfssh.get(0).hotel_rooms.add(new Rooms("QUAD",2200));
		hfssh.get(0).hotel_rooms.add(new Rooms("QUEEN",2500));
		hfssh.get(0).hotel_rooms.add(new Rooms("KING",3000));
		hfssh.get(0).hotel_rooms.add(new Rooms("TWIN",3500));
		hfssh.get(0).hotel_rooms.add(new Rooms("DELUXE",4000));
		hfssh.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",4500));
		// 5 STAR
		ArrayList<Hotels> hfissh=new ArrayList<>();
		hfissh.add(new Hotels("Hotel WoodVista","Vijay",5));
		hfissh.get(0).hotel_rooms.add(new Rooms("SINGLE",1000));
		hfissh.get(0).hotel_rooms.add(new Rooms("DOUBLE",1500));
		hfissh.get(0).hotel_rooms.add(new Rooms("TRIPLE",2000));
		hfissh.get(0).hotel_rooms.add(new Rooms("QUAD",2500));
		hfissh.get(0).hotel_rooms.add(new Rooms("QUEEN",3000));
		hfissh.get(0).hotel_rooms.add(new Rooms("KING",3500));
		hfissh.get(0).hotel_rooms.add(new Rooms("TWIN",4000));
		hfissh.get(0).hotel_rooms.add(new Rooms("DELUXE",4500));
		hfissh.get(0).hotel_rooms.add(new Rooms("SUPERDELUXE",5000));

		mapsh.put(1, hossh);
		mapsh.put(2, htssh);
		mapsh.put(3, hthssh);
		mapsh.put(4, hfssh);
		mapsh.put(5, hfissh);

		allHotels.put(places[9],mapsh);

		return allHotels;
	}
	public static HashMap<String,ArrayList<activity_details>> addActivities(){
		HashMap<String,ArrayList<activity_details>> all_activities=new HashMap<>();
// DELHI
		ArrayList<activity_details> aid=new ArrayList<>();
		aid.add(new activity_details("Adventure Island",550,"Opposite Rithala Metro Station, Sector-10, Rohini, New Delhi"));
		aid.add(new activity_details("Ice Skating in Delhi",489,"NH-8, Gurugram, Haryana"));
		aid.add(new activity_details("Just Chill Water Park",599,"Main GT Karnal Road near GTB, Memorial Delhi"));

		all_activities.put(places[0], aid);
// MANALI
		ArrayList<activity_details> aim=new ArrayList<>();
		aim.add(new activity_details("Trek to Beas Kund",3850,"Online Booking (Start Point/End Point of Trek: Solang Valley)"));
		aim.add(new activity_details("Bhrigu Lake Trek",5299,"Online Booking (Start Point/End Point of Trip: Old Manali)"));
		aim.add(new activity_details("Paragliding",1450,"Dobhi, Manali"));

		all_activities.put(places[1], aim);
// JAIPUR
		ArrayList<activity_details> aij=new ArrayList<>();
		aij.add(new activity_details("Light And Sound Show At Amer With Dinner At Nahargarh",3990,"Amber Fort and a Restaurant in Jaipur"));
		aij.add(new activity_details("Nahargarh Cycling Expedition",1299,"MI Road, Panch Batti, Jaipur"));
		aij.add(new activity_details("Village Jeep Safari",1206,"Rusirani, Jaipur"));

		all_activities.put(places[2], aij);
// MUMBAI
		ArrayList<activity_details> aib=new ArrayList<>();
		aib.add(new activity_details("Bollywood Tour Mumbai",2999,"Bollywood Studio"));
		aib.add(new activity_details("Shivganga Waterpark and Resort Day Out",850,"Shivganga Waterpark and Resort"));
		aib.add(new activity_details("Pawna Lake Camping",799,"Kamshet, Maharashtra"));

		all_activities.put(places[3], aib);
// SRINAGAR
		ArrayList<activity_details> ais=new ArrayList<>();
		ais.add(new activity_details("Shankaracharya Temple",0,"Durgjan, Srinagar, Jammu and Kashmir"));
		ais.add(new activity_details("Indira Gandhi Memorial Tulip Garden",50,"Cheshma Shahi Road, Rainawari, Srinagar, Jammu and Kashmir"));
		ais.add(new activity_details("Birdwatching At Manasabal Lake",0,"Jhelum Valley, Jammu and Kashmir"));

		all_activities.put(places[4], ais);

// DARJEELING
		ArrayList<activity_details> aida=new ArrayList<>();
		aida.add(new activity_details("River Rafting",900,"Teesta river"));
		aida.add(new activity_details("Sandakphu - Trek The Peak",9000,"Sandakphu"));
		aida.add(new activity_details("The Toy Train",100,"Ghoom, Darjeeling"));

		all_activities.put(places[5], aida);

// KOLKATA
		ArrayList<activity_details> aik=new ArrayList<>();
		aik.add(new activity_details("Sundarbans",15,"Hoogly River, West Bengal, India"));
		aik.add(new activity_details("Science City",50,"J.B.S Haldane Avenue, Kolkata, West Bengal"));
		aik.add(new activity_details("Nicco Park",150,"Jheel Meel, Sector IV, Salt Lake City, Kolkata, West Bengal"));

		all_activities.put(places[6], aik);

// MYSORE
		ArrayList<activity_details> aimy=new ArrayList<>();
		aimy.add(new activity_details("Helicopter Ride",6000,"Mysuru, Karnataka, India"));
		aimy.add(new activity_details("Nagarhole National Park Safari",600,"Nagarhole National Park And Tiger Reserve"));
		aimy.add(new activity_details("K Gudi Wilderness Camp",1800,"K Gudi Wilderness Camp-Junglelodges"));

		all_activities.put(places[7], aimy);

// MUSSOORIE
		ArrayList<activity_details> aimu=new ArrayList<>();
		aimu.add(new activity_details("Trek at Hathipaon",1000,"Happy Valley"));
		aimu.add(new activity_details("Ropeway to Gun Hill",75,"Gun Hill"));
		aimu.add(new activity_details("Paragliding",4000,"Mussoorie Lake and Jharipani"));

		all_activities.put(places[8], aimu);

// SHIMLA
		ArrayList<activity_details> aish=new ArrayList<>();
		aish.add(new activity_details("Toy Train Ride: Passing Through The Green Hills",225,"Kalka – Shimla"));
		aish.add(new activity_details("Ice skating: Asia’s Only Open-Air Ice Skating Rink",100,"Shimla"));
		aish.add(new activity_details("Rafting",1500,"Tattapani, Shimla"));

		all_activities.put(places[9], aish);

		return all_activities;
	}
	
}
