package day10;

import java.util.*;

public class DetectCycle {

	static class Graph {
		private int V;
		private List<List<Integer>> adjList;

		Graph(int vertices) {
			V = vertices;
			adjList = new ArrayList<>();
			for (int i = 0; i < V; i++)
				adjList.add(new ArrayList<>());
		}

		void addEdge(int src, int dest) {
			adjList.get(src).add(dest);
		}

		boolean isCyclic() {
			boolean[] visited = new boolean[V];
			boolean[] inPath = new boolean[V];

			for (int i = 0; i < V; i++) {
				if (!visited[i] && isCyclicUtil(i, visited, inPath))
					return true;
			}
			return false;
		}

		private boolean isCyclicUtil(int v, boolean[] visited, boolean[] inPath) {
			if (inPath[v]) return true;
			if (visited[v]) return false;

			visited[v] = true;
			inPath[v] = true; 

			for (int neighbor : adjList.get(v)) {
				if (isCyclicUtil(neighbor, visited, inPath))
					return true;
			}

			inPath[v] = false;
			return false;
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);

		if (graph.isCyclic())
			System.out.println("Graph contains a cycle");
		else
			System.out.println("Graph does not contain a cycle");
	}
}

