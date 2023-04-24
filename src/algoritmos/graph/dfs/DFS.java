package algoritmos.graph.dfs;

import java.util.ArrayList;
import java.util.LinkedList;

import algoritmos.graph.model.Graph;

/**
 * DFS (Depth-First Search) traversal algorithm for a graph.
 */
public class DFS {
	/** The graph to be traversed. */
	private Graph graph;

	/** Array to keep track of visited vertices during traversal. */
	private boolean[] visited;

	/**
	 * Constructs a DFS with the specified graph.
	 * 
	 * @param graph the graph to perform DFS on
	 */
	public DFS(Graph graph) {
		this.graph = graph;
		visited = new boolean[graph.getNumVertices()];
	}

	/**
	 * Performs DFS traversal starting from the specified start vertex.
	 * 
	 * @param startVertex the start vertex for DFS traversal
	 */
	public void traverse(int startVertex) {
		visited[startVertex] = true;
		printVertex(startVertex);

		ArrayList<LinkedList<Integer>> adjacencyList = graph.getAdjacencyList();
		LinkedList<Integer> adjList = adjacencyList.get(startVertex);
		for (Integer adj : adjList) {
			if (!visited[adj]) {
				traverse(adj);
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
