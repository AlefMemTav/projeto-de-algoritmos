package algoritmos.graph.dijkstra;

import algoritmos.graph.dijkstra.model.Graph;
import algoritmos.graph.dijkstra.model.Node;

public class Main {
	public static void main(String args[]) {

		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");

		nodeA.addEdge(nodeB, 10);
		nodeA.addEdge(nodeC, 15);

		nodeB.addEdge(nodeD, 12);
		nodeB.addEdge(nodeF, 15);

		nodeC.addEdge(nodeE, 10);

		nodeD.addEdge(nodeE, 2);
		nodeD.addEdge(nodeF, 1);

		nodeF.addEdge(nodeE, 5);

		Graph graph = new Graph();
		// Sets of nodes
		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

		//graph.printGraph();
		graph.printShortestsPaths();

	}

}
