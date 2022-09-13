package sortColors75;

import java.util.Arrays;

public class Solution {
	public void sortColors(int[] nums) {
		int midIndex, temp;
		for (int i = 0; i < nums.length; i++) {
			midIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[midIndex]) {
					midIndex = j;
				}
			}
			temp = nums[midIndex];
			nums[midIndex] = nums[i];
			nums[i] = temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}
