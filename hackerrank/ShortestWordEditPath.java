package hackerrank;

import java.io.*;
import java.util.*;



class Graph {

	
	private Map<String, List<String>> adjVertices = new HashMap<String, List<String>>();

	Graph() {}

	void addVertex(String str) {//, int dist) {
		//System.out.println(adjVertices);
		adjVertices.putIfAbsent(str, new ArrayList<String>());
	}

	//void addEdge(String str1, int dist1, String str2, int dist2) {
	void addEdge(String str1, String str2) {
		adjVertices.get(str1).add(str2);
		adjVertices.get(str2).add(str1);
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

		while(!queue.isEmpty()) {

			String cur = queue.remove();
			System.out.println(cur);
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
		System.out.println(shortestWordEditPath(source, target, words));
	}
}