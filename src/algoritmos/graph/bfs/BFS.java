package algoritmos.graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import algoritmos.graph.model.Graph;

public class BFS {
	private Graph graph;
	private boolean[] visited;

	public BFS(Graph graph) {
		this.graph = graph;
		visited = new boolean[graph.getV()];
	}

	public void traverse(int startVertex) {

		Queue<Integer> queue = new LinkedList<Integer>();

		visited[startVertex] = true;
		queue.offer(startVertex);

		while (!queue.isEmpty()) {

			int vertex = queue.poll();
			System.out.print(vertex + " ");

			ArrayList<LinkedList<Integer>> adjacencyList = graph.getAdjacencyList();
			LinkedList<Integer> adjList = adjacencyList.get(vertex);
			for (Integer adj : adjList) {

				if (!visited[adj]) {
					visited[adj] = true;
					queue.offer(adj);
				}
			}
		}
	}
}
