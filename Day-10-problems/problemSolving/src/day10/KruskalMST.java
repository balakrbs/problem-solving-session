package day10;

import java.util.*;

	class Edge implements Comparable<Edge> {
	    int src, dest, weight;

	    Edge(int src, int dest, int weight) {
	        this.src = src;
	        this.dest = dest;
	        this.weight = weight;
	    }

	    public int compareTo(Edge other) {
	        return this.weight - other.weight;
	    }
	}

	class KruskalMST {
	    int V; 
	    List<Edge> edges = new ArrayList<>();

	   KruskalMST(int vertices) {
	        V = vertices;
	    }

	    void addEdge(int src, int dest, int weight) {
	        edges.add(new Edge(src, dest, weight));
	    }

	    int findParent(int[] parent, int i) {
	        if (parent[i] != i)
	            parent[i] = findParent(parent, parent[i]);
	        return parent[i];
	    }

	    void union(int[] parent, int[] rank, int x, int y) {
	        int rootX = findParent(parent, x);
	        int rootY = findParent(parent, y);

	        if (rank[rootX] < rank[rootY]) {
	            parent[rootX] = rootY;
	        } else if (rank[rootX] > rank[rootY]) {
	            parent[rootY] = rootX;
	        } else {
	            parent[rootY] = rootX;
	            rank[rootX]++;
	        }
	    }

	    void kruskalMST() {
	        List<Edge> mst = new ArrayList<>();
	        Collections.sort(edges);

	        int[] parent = new int[V];
	        int[] rank = new int[V];

	        for (int i = 0; i < V; i++) {
	            parent[i] = i;
	            rank[i] = 0;
	        }

	        for (Edge edge : edges) {
	            int rootX = findParent(parent, edge.src);
	            int rootY = findParent(parent, edge.dest);

	            if (rootX != rootY) {
	                mst.add(edge);
	                union(parent, rank, rootX, rootY);
	            }

	            if (mst.size() == V - 1) break;
	        }

	        System.out.println("Edges in the Minimum Spanning Tree:");
	        for (Edge edge : mst) {
	            System.out.println(edge.src + " - " + edge.dest + ": " + edge.weight);
	        }
	    }

	    public static void main(String[] args) {
	        KruskalMST graph = new KruskalMST(4);
	        graph.addEdge(0, 1, 10);
	        graph.addEdge(0, 2, 6);
	        graph.addEdge(0, 3, 5);
	        graph.addEdge(1, 3, 15);
	        graph.addEdge(2, 3, 4);

	        graph.kruskalMST();
	    }
	}

