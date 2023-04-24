package algoritmos.graph.dfs;

import algoritmos.graph.model.Graph;

public class Main {
	public static void main(String[] args) {
		// Create a graph
		Graph graph = new Graph(6);
		graph.addDirectedEdge(0, 1);
		graph.addDirectedEdge(0, 2);
		graph.addDirectedEdge(1, 3);
		graph.addDirectedEdge(2, 4);
		graph.addDirectedEdge(3, 5);
		graph.addDirectedEdge(4, 5);

		// Create a DFS and perform traversal
		DFS dfs = new DFS(graph);
		System.out.println("Busca em Profundidade (DFS) a partir do vertice 0:");
		dfs.traverse(0);
	}
}
