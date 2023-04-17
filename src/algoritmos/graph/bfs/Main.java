package algoritmos.graph.bfs;

import algoritmos.graph.model.Graph;

public class Main {
	public static void main(String args[]) {

		Graph graph = new Graph(6);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);

		BFS bfs = new BFS(graph);
		System.out.println("Busca em Largura (BFS) a partir do vertice 0:");
		bfs.traverse(0);
	}

}