package Leetcode.Blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	static int[] nums = { 2, 4, 5, 6, 7 }; // 2, 3, 5, 6, 7 (8)
	static int target = 13;
	int[] result = new int[2];
	int[] resultmap = new int[2];
	int[] resultPointer;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum ts = new TwoSum();
		System.out.println(Arrays.toString(ts.twoSum(nums, target)));
		System.out.println(Arrays.toString(ts.twoSumMap(nums, target)));
		System.out.println(Arrays.toString(ts.twoPointerSum(nums, target)));
	}
	//Two Pointer Approach
	int[] twoPointerSum(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			if (nums[start] + nums[end] == target) {
				return resultPointer = new int[] { start, end };
			} else if (nums[start] + nums[end] > target)
				end--;

			else
				start++;

		}
		return resultPointer;
	}

	int[] twoSumMap(int[] nums, int target) {
		int diffvalue;
		for (int i = 0; i < nums.length; i++) {
			diffvalue = target - nums[i];
			if (map.containsKey(diffvalue)) {

				return new int[] { map.get(diffvalue), i };

			}
			map.put(nums[i], i);

		}
		return resultmap;
		// TODO Auto-generated method stub

	}

	// Linear Approach
	int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result = new int[] { i, j };

				}
			}
		}
		return result;
		// TODO Auto-generated method stub

	}
	// Map Approach

}
