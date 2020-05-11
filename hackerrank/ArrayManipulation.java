package hackerrank;
import java.util.*;
import java.util.Map.Entry;

public class ArrayManipulation {

	// Complete the ArrayManipulation function below.


	public static void main(String[] args) {
		int n = 5;
		int[][] arr = {{1,2,100},{2,5,100},{3,4,100}};
		System.out.println(arrayManipulation(n,arr));

	}

	static long arrayManipulation(int n, int[][] queries) {
        long max = 0;
        int[] arr = new int[n]; 
        for (int i = 0; i < queries.length; i++){
            for (int j = queries[i][0]-1; j <= queries[i][1]-1; j++){
                arr[j] += queries[i][2];
                if (arr[j] > max) max = arr[j];
            }
        }
    return max;
    }


}
