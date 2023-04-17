package algoritmos.graph.model;

import java.util.*;

public class Graph {
	private int V;
	private ArrayList<LinkedList<Integer>> adjacencyList;

	public Graph(int v) {
		this.V = v;
		this.adjacencyList = new ArrayList<>(v);
		for (int i = 0; i < v; ++i) {
			adjacencyList.add(new LinkedList<>());
		}
	}

	public void addEdge(int v, int w) {
		adjacencyList.get(v).add(w);
	}

	public void printGraph() {
		for (int v = 0; v < V; ++v) {
			System.out.println("Vertice " + v + ":");
			for (Integer adj : adjacencyList.get(v))
				System.out.print(" -> " + adj);
			System.out.println();
		}
	}

	public int getV() {
		return V;
	}

	public void setV(int v) {
		V = v;
	}

	public ArrayList<LinkedList<Integer>> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(ArrayList<LinkedList<Integer>> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

}