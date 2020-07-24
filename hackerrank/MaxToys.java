package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int count = 0;
        int totalPrice = 0;
        
        for(int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length - 1; j++) {
                if (prices[j] > prices[j+1]) {
                    swap(prices, j, j+1);
                }
            }
        }
        
        for (int i = 0; i < prices.length; i++) {
            if (totalPrice+prices[i] < k) {
                totalPrice += prices[i];
                count = i+1;
            }
            else break;
        }
        return count;
    }
    
    private static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    private static void quickSort(int[] arr) {
    	quickSort(arr, 0, arr.length-1);
    }
    
    private static void quickSort(int[] arr, int min, int max) {
    	int k = (min + max) / 2;    
    	swap(arr, k, max);
    	int p = pivot(arr, min, max-1, arr[max]);
    	swap(arr, max, p);
    	if (p > min+1) quickSort(arr, min, p-1);
    	if (p < max-1) quickSort(arr, p+1, max);
    }
    
    private static int pivot(int[] arr, int min, int max, int pValue) {
    	int i = min;
    	int j = max;
    	while (i <= j) {
    		if (arr[i] <= pValue)
    			i++;
    		else if (arr[j] > pValue)
    			j--;
    		else
    			swap(arr, i, j);
    	}
    	
    	return i;
    }


    public static void main(String[] args) {
        int[] arr = {0,4,3,12,1,5};
        quickSort(arr);
    }
}
