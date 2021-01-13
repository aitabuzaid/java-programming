package leetcode;


class RotateArray {
	public void rotate(int[] nums, int k) {
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
}