package twoSumII167;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
//		Time Exceed Error
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = i + 1; j < numbers.length; j++) {
//				if (numbers[i] + numbers[j] == target) {
//					return new int[] { i + 1, j + 1 };
//				}
//			}
//		}
//		return null;

		int i = 0, j = numbers.length - 1;
		while (i < j) {
			if (numbers[i] + numbers[j] == target) {
				return new int[] { i + 1, j + 1 };
			} else if (numbers[i] + numbers[j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return null;
	}
}
