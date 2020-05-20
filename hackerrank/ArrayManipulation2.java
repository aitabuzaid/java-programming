package hackerrank;
import java.util.*;
import java.util.Map.Entry;

public class ArrayManipulation2 {

	// Complete the ArrayManipulation function below.
	public class Node {
		Node left;
		Node right;
		Node center;
		long val;
		int i, j;
		Node(Node left, Node right, Node center, long val, int i, int j){
			this.left = left;
			this.right = right;
			this.center = center;
			this.val = val;
			this.i = i;
			this.j = j;
			
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int[][] arr = {{1,2,100},{2,5,100},{3,4,100}};
		System.out.println(arrayManipulation(n,arr));

	}
	/**
	 * Initial attempt to solve the array manipulation 
	 * challenge as described in hacker rank.
	 * I used a brute force technique to find the largest
	 * number after executing all queries.
	 * @param n: size of array
	 * @param queries: an m x 3 matrix describing the 
	 * 		  m queries
	 * @return the maximum number in the whole array
	 */

    static long arrayManipulation(int n, int[][] queries) {
        return 1;
    }


}
