package leetcode;

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[max]) {
                max++;
                nums[max] = nums[i];
            }
        }
        return max+1;
    }
}
