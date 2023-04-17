package algoritmos.graph.bfs;

import algoritmos.graph.model.Graph;

public class Main {
	public static void main(String args[]) {

		Graph graph = new Graph(6);
		graph.addDirectedEdge(0, 1);
		graph.addDirectedEdge(0, 2);
		graph.addDirectedEdge(1, 3);
		graph.addDirectedEdge(1, 4);
		graph.addDirectedEdge(2, 4);
		graph.addDirectedEdge(3, 4);
		graph.addDirectedEdge(3, 5);
		graph.addDirectedEdge(4, 5);

		BFS bfs = new BFS(graph);
		System.out.println("Busca em Largura (BFS) a partir do vertice 0:");
		bfs.traverse(0);
	}

}
