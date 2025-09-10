package day2;

public class SecondLargest {
	public static int findSecondLargest(int nums[]) {
		if (nums.length < 2) {
			return nums[0];
		}
		int largest = nums[0];
		int secondLargest = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > largest) {
				secondLargest = largest;
				largest = nums[i];
			}
		}
		return secondLargest;
	}
	
	public static void main(String args[]) {
		int[] nums = { 5, 3, 6, 8, 1, 51, 63, 12 };
		System.out.println(findSecondLargest(nums));
	}
}
