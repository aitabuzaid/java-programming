package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WhatFlavors {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < cost.length; i++) {
    		if (!map.containsKey(cost[i]))
    			map.put(money-cost[i],i+1);
    		else
    			System.out.println(map.get(cost[i])+" "+(i+1));
    	}
    }

    public static void main(String[] args) {
    	whatFlavors(new int[] {1,4,5,3,2}, 4);
    }
}
