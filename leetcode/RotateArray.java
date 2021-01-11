package leetcode;

class RotateArray {
    public void swap(int[] nums, int j, int l) {
        int temp = nums[j];
        nums[j] = nums[l];
        nums[l] = temp;
    }
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            swap(nums, i, (i+nums.length-k)%nums.length);
        }
    }
}