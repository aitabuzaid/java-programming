package leetcode;


class RotateArray {
	public static void rotate(int[] nums, int k) {
		k = k%nums.length;
		int temp, i, j;
		int gcd = GCD(nums.length, k);
		for (int l = 0; l < gcd; l++) {
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

	public static int GCD(int n1, int n2) {
		if (n2 == 0)
			return n1;

		return GCD(n2, n1%n2);
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