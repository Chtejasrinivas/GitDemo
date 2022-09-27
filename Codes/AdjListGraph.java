import java.util.*;


public class AdjListGraph {
	
	private LinkedList<Integer>[ ] adj;
	private int V; // number of vertices
	private int E; // number of edges
	
	public AdjListGraph(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for(int v = 0; v < V; v++) {
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
		E++;
}
public void dfs(){
		boolean[] visited = new boolean[V];
		for(int v = 0; v < V; v++){
			if(!visited[v]){
				dfs(v, visited);
			}
		}
	}
private void dfs(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");
		for(int w : adj[v]){
			if(!visited[w]){
				dfs(w, visited);
			}
		}
	}
public void bfs(int s) {
		boolean[] visited = new boolean[V];

		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.offer(s);

		while(!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u + " ");

			for(int v : adj[u]) {
				if(!visited[v]) {
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}
public static void main(String[] args) {
		AdjListGraph g = new AdjListGraph(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		System.out.println(g);
		g.dfs();
	}
}