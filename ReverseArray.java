package day2;

public class ReverseArray {
	public static int[] reverse(int nums[]) {
		int[] returnArr = new int[nums.length];
		int head = 0;
		int tail = nums.length - 1;
		while (head < tail) {
			returnArr[head] = nums[tail];
			returnArr[tail] = nums[head];
			head++;
			tail--;
		}
		return returnArr;
	}
	
	public static void main(String args[]) {
		int[] nums = { 5, 3, 6, 8, 1, 51, 63, 12 };
		int[] nums2 = reverse(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums2[i]);
		}
	}
}