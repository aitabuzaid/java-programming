package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

class AbsValSort {

	static int[] absSort(int[] arr) {
		// your code goes here
		Integer[] arr2 = IntStream.of(arr).boxed().toArray( Integer[]::new );
		
		Arrays.sort(arr2, new Comparator<Integer>() 
		{
			public int compare(Integer a, Integer b) {
				if (Math.abs(a) < Math.abs(b))
					return -1;
				else if (Math.abs(a) > Math.abs(b))
					return 1;
				else if (a < b)
					return -1;
				else if (a > b)
					return 1;
				return 0;
			}
		});

		for (int i =0; i < arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}

		return arr;
	}




	static class ValComp implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			if (Math.abs(a) < Math.abs(b))
				return -1;
			else if (Math.abs(a) > Math.abs(b))
				return 1;
			else if (a < b)
				return -1;
			else if (a > b)
				return 1;
			return 0;
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,-7,-2,-2,0};
		absSort(arr);
	}

}
