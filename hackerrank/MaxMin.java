package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxMin {

    // Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {
    	Arrays.sort(arr);
    	int min;
    	min = arr[k-1]-arr[0];
    	for (int i = 1; i < arr.length-k+1; i++) {
    		if ((arr[i+k-1]-arr[i]) < min)
    			min = arr[i+k-1]-arr[i];
    	}
    	return min;
    }


    public static void main(String[] args) throws IOException {
        System.out.println(maxMin(3, new int[] {10, 100, 300, 200, 1000, 20, 30}));
    }
}