package hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SwapNodes {

	/*
	 * Complete the swapNodes function below.
	 */
	static int[][] swapNodes(int[][] indexes, int[] queries) {
		/*
		 * Write your code here.
		 */
		int[][] result = null;
		return result;
	}

	static void inOrderPrint(Node node) {
		if (node.getLeft() != null)
			inOrderPrint(node.getLeft());
		System.out.print(node.val+" ");
		if (node.getRight() != null)
			inOrderPrint(node.getRight());
	}

	static void inOrderPrint(int[][] indexes) {
		if (indexes[0][0] != -1)
			inOrderPrint(0, 0, indexes);
		System.out.print(1+" ");
		if (indexes[0][1] != -1)
			inOrderPrint(0, 1, indexes);
	}

	static void inOrderPrint(int i, int j, int[][] indexes) {
		if (indexes[2*(i+1)+j-1][0] != -1)
			inOrderPrint(2*(i+1)+j-1, 0, indexes);
		System.out.print(indexes[i][j]+" ");
		if (indexes[2*(i+1)+j-1][1] != -1)
			inOrderPrint(2*(i+1)+j-1, 1, indexes);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {


		int n = Integer.parseInt(scanner.nextLine().trim());

		int[][] indexes = new int[n][2];

		for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
			String[] indexesRowItems = scanner.nextLine().split(" ");

			for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
				int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
				indexes[indexesRowItr][indexesColumnItr] = indexesItem;
			}
		}

		int queriesCount = Integer.parseInt(scanner.nextLine().trim());

		int[] queries = new int[queriesCount];

		for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
			int queriesItem = Integer.parseInt(scanner.nextLine().trim());
			queries[queriesItr] = queriesItem;
		}

		//for (int i = 0; i < indexes.length; i++)
		//		System.out.print(indexes[i][0]+" "+indexes[i][1]+"\n");
		inOrderPrint(indexes);

		/*
        int[][] result = swapNodes(indexes, queries);

        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                System.out.println(String.valueOf(result[resultRowItr][resultColumnItr]));

                if (resultColumnItr != result[resultRowItr].length - 1) {
                	System.out.println(" ");
                }
            }

            if (resultRowItr != result.length - 1) {
            	System.out.println("\n");
            }
        }
		 */

	}
}
