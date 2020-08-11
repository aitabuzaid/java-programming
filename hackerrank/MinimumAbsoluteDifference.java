package hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumAbsoluteDifference {

	// Complete the minimumAbsoluteDifference function below.
	static int minimumAbsoluteDifference(int[] arr) {
		Arrays.sort(arr);
		int min = arr[1]-arr[0];
		for (int i = 1; i < arr.length-1; i++) {
			if ((arr[i+1]-arr[i]) < min)
				min = arr[i+1]-arr[i];
		}
		
		return min;
	}


	public static void main(String[] args) {
		System.out.println(minimumAbsoluteDifference(new int[] {1,3,-3,5,-5}));
	}
}
