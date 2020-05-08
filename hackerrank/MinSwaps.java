package hackerrank;
import java.util.*;
import java.util.Map.Entry;

public class MinSwaps {

	// Complete the minimumBribes function below.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,1,3,2,4,5,6};
		minimumSwaps(arr);

	}

	
	static void minimumSwaps(int[] arr) {
		int i = 0, swaps = 0;
		int temp;
		while(i < arr.length){
			if (arr[i] == i+1) i++;
			else{
				temp = arr[arr[i]-1];
				arr[arr[i]-1] = arr[i];
				arr[i] = temp;
				swaps++;
			}
			//for (int j = 0; j<arr.length; j++)
			//	System.out.print(arr[j]+" ");
			//System.out.println();
		}
		System.out.println(swaps);
	}		
}
 