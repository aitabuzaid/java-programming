package hackerrank;

import java.io.*;
import java.util.*;

class Vertex {
	String str;
	//int dist;
	Vertex(String str) {//, int dist) {
		this.str = str;
		//this.dist = dist;
	}
	
	@Override
	public boolean equals(Object that) {
		if (this == that)
			return true;
		
		if (!(that instanceof Vertex)) {
			return false;
		}
		
		Vertex v = (Vertex) that;
		return this.str.equals(v.str);
	}
}

class Graph {
	private Map<Vertex, List<Vertex>> adjVertices = new HashMap<Vertex, List<Vertex>>();

	Graph() {}

	void addVertex(String str) {//, int dist) {
		System.out.println(str);
		//System.out.println(dist);
		System.out.println(adjVertices);
		//adjVertices.putIfAbsent(new Vertex(str, dist), new ArrayList<>());
		adjVertices.putIfAbsent(new Vertex(str), new ArrayList<>());
	}

	//void addEdge(String str1, int dist1, String str2, int dist2) {
	void addEdge(String str1, String str2) {
		Vertex v1 = new Vertex(str1);//, dist1);
		Vertex v2 = new Vertex(str2);//, dist2);
		
		System.out.println(adjVertices);
		System.out.println(adjVertices.get(v1));
		System.out.println(v1);
		adjVertices.get(v1).add(v2);
		adjVertices.get(v2).add(v1);
	}
}

class ShortestWordEditPath {
	static int shortestWordEditPath(String source, String target, String[] words) {
		// your code goes here
		Graph graph = new Graph();
		Queue<String> queue = new LinkedList<String>();
		Set<String> visited = new HashSet<String>(); 
		queue.add(source);
		int dist = 0;
		System.out.println("test");
		while(!queue.isEmpty()) {
			System.out.println("test");
			String cur = queue.remove();
			visited.add(cur);
			graph.addVertex(cur);//, dist);
			for (int i = 0; i < words.length; i++) {
				if (editDistance(cur, words[i]) == 1 && !visited.contains(words[i])) {
					queue.add(words[i]);
					graph.addVertex(words[i]);//, dist+1);
					//graph.addEdge(cur, dist, words[i], dist+1);
					graph.addEdge(cur, words[i]);
					if (editDistance(words[i], target) == 1) {
						return dist+2;
					}
				}
			}
			dist++;
		}

		return -1;
	}

	static int editDistance(String str1, String str2) {
		int dist = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i))
				dist++;
		}
		return dist;
	}

	public static void main(String[] args) {
		String source = "bit";
		String target = "dog";
		String[] words = new String[]{"but", "put", "big", "pot", "pog", "dog", "lot"};
		System.out.println("test");
		System.out.println(shortestWordEditPath(source, target, words));
	}
}