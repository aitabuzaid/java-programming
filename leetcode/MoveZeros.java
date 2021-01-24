package leetcode;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == 0) {
        		int j = i+1;
        		while (nums[j]) 
        	}
        }
        
    }
    

    public static void swap(int[] nums, int i, int j) {
    	System.out.println("swap: "+i+" "+ j);
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    
    public static void main(String[] args) {
    	//int[] arr = new int[] {1,3,2,0,4,9,0,0,5};
    	//int[] arr = new int[] {1,3,2,2,4,9,6,7,5};
    	//int[] arr = new int[] {0,1,0,0,0,4,9,0,0,0,5,6,0,0,7};
    	int[] arr = new int[] {0,0,0,0,0,0,0,9,6,5,9,8,1,5,7};
    	moveZeroes(arr);
    	System.out.println(Arrays.toString(arr));
    }
}