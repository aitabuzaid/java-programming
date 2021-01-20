package leetcode;

import java.util.Arrays;

public class PlusOne {
    static int[] plusOne(int[] digits) {
        int car = 0;
        int res;
        int n = digits.length-1;
        res = (digits[n]+1) % 10;
        car = (digits[n]+1) / 10;
        digits[n] = res;
        while (car != 0 && n > 0) {
            n--;
            res = (digits[n]+car) % 10;
            car = (digits[n]+car) / 10;
            digits[n] = res;
        }
        int[] digits2 = new int[digits.length+1];
        if (car == 1) {
        	
        	digits2[0] = car;
        	for (int i = 0; i < digits.length; i++) {
        		digits2[i+1] = digits[i];
        	}
        }
        return digits2;
    }
    
    public static void main(String[] args) {
    	int[] arr = new int[] {9,9,9,9,9,9};
    	int[] arr2 = plusOne(arr);
    	System.out.println(Arrays.toString(arr2));
    }
}