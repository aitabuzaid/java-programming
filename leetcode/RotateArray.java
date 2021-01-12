package leetcode;

class RotateArray {
    public void rotate(int[] nums, int k) {
        
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {      
            res[i] = nums[i]; 
        }
        int j;
        for (int i = 0; i < nums.length; i++) {
            j  = ((i+nums.length-k)%nums.length + nums.length)%nums.length;           
            nums[i] = res[j]; 

        }
    }
}