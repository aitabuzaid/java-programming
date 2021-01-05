package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Fraud {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {

    	int[] arr = new int[d];
    	int count = 0;
    	float med;
    	for (int i = 0; i < expenditure.length; i++) {
    		if (i < d)
    			arr[i] = expenditure[i];
    		else {	
    			if (i == d)
    				Arrays.sort(arr);
  
        		if (d % 2 == 0)
        			med = (float)(arr[d/2]+arr[d/2-1])/2;
        		else
        			med = arr[d/2];
        		if (expenditure[i] >= 2*med) 
        			count++;
        		
        		int query = expenditure[i-d];
    			int min = 0, max = d;
    			int loc = (min+max)/2;
    			while (query != arr[loc]) {
    				if (query > arr[loc])
    					min = loc+1;
    				else
    					max = loc-1;
    				loc = (min+max)/2;
    			}
    			arr[loc] = expenditure[i];
    			
    			while ((loc < d-1) && (arr[loc] > arr[loc+1]))
    				swap(arr, loc, ++loc);
    			while ((loc > 0) && (arr[loc] < arr[loc-1]))
    				swap(arr, loc, --loc);
        		
    		}
    	}
    	return count;
    }
    
    private static void swap(int[] a, int x, int y) {
    	int temp = a[x];
    	a[x] = a[y];
    	a[y] = temp;
    }


    public static void main(String[] args)  {
    	int[] exp = {1,3,2,5,1,2,4,6,10,3,2,9};
    	int d = 3;

    	System.out.println(activityNotifications(exp, d));
    }
}

