package algoritmos.graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import algoritmos.graph.model.Graph;

/**
 * BFS (Breadth-First Search) traversal algorithm for a graph.
 */
public class BFS {
	/** The graph to be traversed. */
	private Graph graph;

	/** Array to keep track of visited vertices during traversal. */
	private boolean[] visited;

	/**
	 * Constructs a BFS with the specified graph.
	 * 
	 * @param graph the graph to perform BFS on
	 */
	public BFS(Graph graph) {
		this.graph = graph;
		visited = new boolean[graph.getNumVertices()];
	}

	/**
	 * Performs BFS traversal starting from the specified start vertex.
	 * 
	 * @param startVertex the start vertex for BFS traversal
	 */
	public void traverse(int startVertex) {

		Queue<Integer> queue = new LinkedList<Integer>();

		visited[startVertex] = true;
		queue.offer(startVertex);

		ArrayList<LinkedList<Integer>> adjacencyList = graph.getAdjacencyList();
		while (!queue.isEmpty()) {

			int vertex = queue.poll();
			printVertex(vertex);

			LinkedList<Integer> adjList = adjacencyList.get(vertex);
			for (Integer adj : adjList) {

				if (!visited[adj]) {
					visited[adj] = true;
					queue.offer(adj);
				}
			}
		}
	}

	/**
	 * Prints a visited vertex.
	 * 
	 * @param vertex the visited vertex
	 */
	private void printVertex(int vertex) {
		System.out.print(vertex + " ");
	}
}
