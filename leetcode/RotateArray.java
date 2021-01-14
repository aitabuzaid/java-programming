package leetcode;


class RotateArray {
	public static void rotate(int[] nums, int k) {
		k = k%nums.length;
		int i = 0;
		int temp = nums[i];
		int j = (i-k+nums.length) % nums.length;
		while (j != 0) {
			//System.out.println(j);
			nums[i] = nums[j];
			i = j;
			j = (i-k+nums.length) % nums.length;
		}
		nums[i] = temp;
		if (nums.length % 2 == 0 & k % 2 == 0){
			for (int l = 1; l < 2; l++) {
				i = l;
				temp = nums[i];
				j = (i-k+nums.length) % nums.length;
				while (j != l) {
					nums[i] = nums[j];
					i = j;
					j = (i-k+nums.length) % nums.length;
				}
				nums[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int k = 3;
		rotate(arr, k);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		
	}
}