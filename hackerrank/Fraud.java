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
    	//LinkedList<Integer> list = new LinkedList<Integer>();
    	int[] arr = new int[d];
    	int count = 0;
    	for (int i = 0; i < expenditure.length; i++) {
    		if (i < d)
    			arr[i] = expenditure[i];
    		else if (i == d){	
    			Arrays.sort(arr);
        		float med;
        		if (d % 2 == 0)
        			med = (float)(arr[d/2]+arr[d/2-1])/2;
        		else
        			med = arr[d/2];
        		if (expenditure[i] >= 2*med) 
        			count++;    				
    		}
    		else {
    			int query = expenditure[i-d];
    		}
    	}
    	return count;
    }


    public static void main(String[] args)  {
    	int[] exp = {1,3,2,5,1,2,4,6,10,3,2,9};
    	int d = 3;
    	System.out.println(activityNotifications(exp, d));
    }
}

