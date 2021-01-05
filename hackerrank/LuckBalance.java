package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LuckBalance {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
    	
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	int count = 0;
    	for (int i = 0; i < contests.length; i++) {
    		if (contests[i][1] == 1)
    			list.add(contests[i][0]);
    		else
    			count += contests[i][0];
    			
    	}
    	
    	Object [] tempArr = new Object[list.size()];
    	tempArr = list.toArray();
    	Arrays.sort(tempArr);
    	for (int i = 0; i < tempArr.length; i++)
    		if (i < (tempArr.length-k))
    			count -= (int)tempArr[i];
    		else
    			count += (int)tempArr[i];

    	return count;
    }



    public static void main(String[] args){
    	System.out.println(
    		   luckBalance(3,new int[][] {{5,1},
    									  {2,1},
    									  {1,1},
    									  {8,1},
    									  {10,0},
    									  {5,0}})
    		   );
    }
}
