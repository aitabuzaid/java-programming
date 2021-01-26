package leetcode;
import java.util.*;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				return new int[] {map.get(nums[i]), i};
			else
				map.put(target-nums[i], i);
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9)));

	}

}

