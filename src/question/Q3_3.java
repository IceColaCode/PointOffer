package question;

public class Q3_3 {

	public static void main(String[] args) {
		int[] nums = {2,1,3,5,7,6,0,4};
		System.out.println(duplicate(nums));
	}

	public static boolean duplicate(int[] nums) {
		if (nums == null || nums.length < 1) {
			return false;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0 || nums[i] > nums.length - 1) {
				return false;
			}
		}

		for (int i = 0; i < nums.length; i++) {

			while (nums[i] != i) {
				if (nums[i] == nums[nums[i]]) {
					return true;
				}
				swap(nums, i, nums[i]);
			}
		}
		return false;
	}
	
	public static void swap(int[] nums,int low,int high) {
		int temp = 0;
		temp = nums[low];
		nums[low]=nums[high];
		nums[high]=temp;
	}
}
