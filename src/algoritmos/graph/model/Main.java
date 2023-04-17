package algoritmos.graph.model;

public class Main {
	public static void main(String args[]) {

		Graph graph = new Graph(5);

		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 3);
		graph.addEdge(2, 1);
		graph.addEdge(3, 2);
		graph.addEdge(4, 1);

		graph.printGraph();
	}
}