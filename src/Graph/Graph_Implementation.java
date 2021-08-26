package Graph;
import java.util.*;

public class Graph_Implementation {
    private LinkedList<Integer> adj[];

    public Graph_Implementation(int v){
        adj = new LinkedList[v];
        for(int i =0; i<v; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
    public void addEdges(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public int BFS(int source, int destination){
        boolean vis[] = new boolean[adj.length];
        int parent[] = new int[adj.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        parent[source] = -1;
        vis[source] = true;

        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur == destination) break;;

            for(int neighbour: adj[cur]){
                if(!vis[neighbour]){
                    vis[neighbour] = true;
                    q.add(neighbour);
                    parent[neighbour] = cur;
                }
            }
        }
        int cur = destination;
        int distance = 0;
        while(parent[cur] != -1){
            System.out.print(cur+"->");
            cur = parent[cur];
            distance++;
        }
        return distance;
    }

    private boolean DFSUtil(int source, int destination, boolean vis[]){
        if(source == destination) return true;
        for(int neighbour: adj[source]){
            if(!vis[neighbour]){
                vis[neighbour] = true;
                boolean isConnected = DFSUtil(neighbour, destination, vis);
                if(isConnected) return true;
            }
        }
        return false;
    }
    public boolean DFS(int source,int destination){
        boolean vis[]=new boolean[adj.length];
        vis[source] = true;
        return DFSUtil(source, destination, vis);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter c an e");
        int v = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("Enter " + e + "edges");
        Graph_Implementation graph = new Graph_Implementation(v);
        for(int i=0;i<e;i++){
            int source = sc.nextInt();
            int detination = sc.nextInt();

            graph.addEdges(source, detination);
        }
        System.out.println("Enter source and Destination");
        int source = sc.nextInt();
        int destination = sc.nextInt();

        //int dis = graph.BFS(source, destination);
        //System.out.println("min dis "+ dis);
        System.out.println(graph.DFS(source,destination));
        sc.close();
    }
}
