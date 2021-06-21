package leetcode;

public class MissingNumber {
	
	public int missingNumber(int[] nums) {
        int full_sum = (nums.length*(nums.length+1))/2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return full_sum-sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
