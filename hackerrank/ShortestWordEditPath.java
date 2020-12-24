package hackerrank;

import java.io.*;
import java.util.*;

class ShortestWordEditPath {
	static int shortestWordEditPath(String source, String target, String[] words) {
		// your code goes here
		Graph graph = new Graph();
		//Queue<String> queue = new LinkedList<String>();
		Queue<Vertex> queue = new LinkedList<Vertex>();
		Set<String> visited = new HashSet<String>(); 

		int dist = 0;
		queue.add(new Vertex(source, dist));
		while(!queue.isEmpty()) {

			//String cur = queue.remove();
			Vertex cur = queue.remove();
			System.out.println(cur);
			visited.add(cur.str);
			graph.addVertex(cur.str, dist);
			for (int i = 0; i < words.length; i++) {
				if (editDistance(cur.str, words[i]) == 1 && !visited.contains(words[i])) {

					queue.add(new Vertex(words[i], cur.dist+1));
					graph.addVertex(words[i], cur.dist+1);
					//graph.addEdge(cur, dist, words[i], dist+1);
					graph.addEdge(cur.str, cur.dist, words[i], cur.dist+1);
					if (editDistance(words[i], target) == 1) {
						return cur.dist+2;
					}
				}
			}
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
		System.out.println(shortestWordEditPath(source, target, words));
	}

}
class Vertex {
	String str;
	int dist;
	Vertex(String str, int dist) {
		this.str = str;
		this.dist = dist;
	}
}

class Graph {

	Graph(){}

	
	private Map<Vertex, List<Vertex>> adjVertices = new HashMap<Vertex, List<Vertex>>();


	public void addVertex(String str, int dist) {
		//System.out.println(adjVertices);
		adjVertices.putIfAbsent(new Vertex(str, dist), new ArrayList<Vertex>());
	}

	public void addEdge(String str1, int dist1, String str2, int dist2) {
		//void addEdge(String str1, String str2) {	
		Vertex v1 = new Vertex(str1, dist1);
		Vertex v2 = new Vertex(str1, dist1);
		adjVertices.get(v1).add(v2);
		adjVertices.get(v2).add(v1);
	}
}