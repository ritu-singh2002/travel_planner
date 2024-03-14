import java.util.ArrayList;
import java.util.PriorityQueue;

public class desPath {
	//Finding out cheapest path using Dijkstra Algorithm
		//for any transport
		public static Path getCheapestPath(ArrayList<Edge>[] graph, int s, int d,String src,String des) {
			PriorityQueue<Pair> pq=new PriorityQueue<>();
			pq.add(new Pair(s,0,src+""));
			boolean vis[]=new boolean[10];
			Pair rem=new Pair();
			while(pq.size()>0) {
				rem=pq.remove(); 
				if(vis[rem.v])
					continue;
				vis[rem.v]=true;
				if(rem.v==d)
					break;
				for(Edge e:graph[rem.v]) {
					if(!vis[e.des])
						pq.add(new Pair(e.des,rem.psf+e.price,rem.path+" by "+e.transport+" -> "+e.nbr));
				}
			}
//			System.out.println("Total cost = Rs. "+rem.psf+"  "+rem.path);
			return new Path(rem.psf,rem.path);
		}
		
		//for Plane
		public static Path getCheapestPathPlane(ArrayList<Edge>[] graph, int s, int d,String src,String des) {
			PriorityQueue<Pair> pq=new PriorityQueue<>();
			pq.add(new Pair(s,0,src+""));
			boolean vis[]=new boolean[10];
			Pair rem=new Pair();
			while(pq.size()>0) {
				rem=pq.remove();
				if(vis[rem.v])
					continue;
				vis[rem.v]=true;
				if(rem.v==d)
					break;
				for(Edge e:graph[rem.v]) {
					if(!vis[e.des] && e.transport.equals("Plane"))
						pq.add(new Pair(e.des,rem.psf+e.price,rem.path+" by "+e.transport+" -> "+e.nbr));
				}
			}
//			System.out.println("Total cost = Rs. "+rem.psf+"  "+rem.path);
			return new Path(rem.psf,rem.path);
		}
		
		//for Bus
		public static Path getCheapestPathBus(ArrayList<Edge>[] graph, int s, int d,String src,String des) {
			PriorityQueue<Pair> pq=new PriorityQueue<>();
			pq.add(new Pair(s,0,src+""));
			boolean vis[]=new boolean[10];
			Pair rem=new Pair();
			while(pq.size()>0) {
				rem=pq.remove();
				if(vis[rem.v])
					continue;
				vis[rem.v]=true;
				if(rem.v==d)
					break;
				for(Edge e:graph[rem.v]) {
					if(!vis[e.des] && e.transport.equals("Bus"))
						pq.add(new Pair(e.des,rem.psf+e.price,rem.path+" by "+e.transport+" -> "+e.nbr));
				}
			}
//			System.out.println("Total cost = Rs. "+rem.psf+"  "+rem.path);
			return new Path(rem.psf,rem.path);
		}
		
		//for Train
		public static Path getCheapestPathTrain(ArrayList<Edge>[] graph, int s, int d,String src,String des) {
			PriorityQueue<Pair> pq=new PriorityQueue<>();
			pq.add(new Pair(s,0,src+""));
			boolean vis[]=new boolean[10];
			Pair rem=new Pair();
			while(pq.size()>0) {
				rem=pq.remove();
				if(vis[rem.v])
					continue;
				vis[rem.v]=true;
				if(rem.v==d)
					break;
				for(Edge e:graph[rem.v]) {
					if(!vis[e.des] && e.transport.equals("Train"))
						pq.add(new Pair(e.des,rem.psf+e.price,rem.path+" by "+e.transport+" -> "+e.nbr));
				}
			}
//			System.out.println("Total cost = Rs. "+rem.psf+"  "+rem.path);
			return new Path(rem.psf,rem.path);
		}
		
		//Inner class
		private static class Pair implements Comparable<Pair>{
			int v,psf;
			String path;
			public Pair(int v,int psf,String path) {
				this.v=v;
				this.psf = psf;
				this.path=path;
			}
			public Pair() {
				
			}
			@Override
			public int compareTo(Pair o) {
				return this.psf-o.psf;
			}
		}
}
