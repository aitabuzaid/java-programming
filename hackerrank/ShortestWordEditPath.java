package hackerrank;

import java.io.*;
import java.util.*;

class Solution {
	class Vertex {
		String str;
		int dist;
		Vertex(String str, int dist) {
			this.str = str;
			this.dist = dist;
		}
	}
	
	class Graph {
		private Map<Vertex, List<Vertex>> adjVertices;
		void addVertex(String str, int dist) {
			adjVertices.putIfAbsent(new Vertex(str, dist), new ArrayList<>());
		}
		
		void removeVertex(String str, int dist) {
			Vertex v = new Vertex(str, dist);
			adjVertices.values().stream().forEach(e -> e.remove(v));
			adjVertices.remove(new Vertex(str, dist))
		}
	}

	static int shortestWordEditPath(String source, String target, String[] words) {
		// your code goes here
		DiGra
		return 0;
	}

	public static void main(String[] args) {
	
	}
}
