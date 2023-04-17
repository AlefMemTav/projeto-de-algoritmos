package algoritmos.graph.model;

public class Main {
	public static void main(String args[]) {

		Graph graph = new Graph(5);

		graph.addDirectedEdge(0, 1);
		graph.addDirectedEdge(0, 4);
		graph.addDirectedEdge(1, 3);
		graph.addDirectedEdge(2, 1);
		graph.addDirectedEdge(3, 2);
		graph.addDirectedEdge(4, 1);

		graph.printGraph();
	}
}