package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GreedyFlorest {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
    	Arrays.sort(c);
    	int counter = 0;
    	int multiplier = 1;
    	int cost = 0;
    	for (int i = c.length-1; i >= 0; i--) {
    		if ((counter != 0) && (counter % k == 0))
    			multiplier++;
    		cost += c[i]*multiplier;
    		counter++;
    	}
    	return cost;
    }


    public static void main(String[] args){
    	System.out.println(getMinimumCost(2, new int[] {2,5,6}));
    }
}
