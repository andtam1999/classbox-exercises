package day2;

public class LargestInArray {
	public static int findLargest(int nums[]) {
		int largest = nums[0];
		for (int i : nums) {
			if (i > largest) {
				largest = i;
			}
		}
		return largest;
	}
	
	public static void main(String args[]) {
		int[] nums = { 5, 3, 6, 8, 1, 51, 63, 12 };
		System.out.println(findLargest(nums));
	}
}
