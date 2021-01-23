package leetcode;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        moveZeroes(nums, 0, nums.length-1);
        
    }
    
    public static void moveZeroes(int[] nums, int min, int max) {
    	System.out.println(min+" "+ max);
    	if (max <= min)
    		return;
    	int mid = (min + max)/2;
    	moveZeroes(nums, min, mid);
    	moveZeroes(nums, mid+1, max);
    	mid++;
    	/*
    	while (nums[min] != 0 && max < )
    		min++;
    	System.out.println(min+" "+ max);
    	while (nums[mid] != 0)
    		swap(nums, min++, mid++);
    	*/
    	
    	while (min < max) {
    		if (nums[min] != 0)
    			min++;
    		else if (nums[mid] != 0 && mid <= max) {
    			swap(nums, min++, mid++);
    		}
    		else
    			break;
    	}
    }
    public static void swap(int[] nums, int i, int j) {
    	System.out.println("swap: "+i+" "+ j);
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    
    public static void main(String[] args) {
    	int[] arr = new int[] {1,3,2,0,4,9,0,0,5};
    	moveZeroes(arr);
    	System.out.println(Arrays.toString(arr));
    }
}