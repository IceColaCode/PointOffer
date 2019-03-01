package question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q3_1 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,22,5,9,7,6};
		System.out.println(duplicate(nums));
	}
	
	public static boolean duplicate(int[] nums) {
		if(nums==null || nums.length<2) {
			return false;
		}
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
				return true;
			}
		}
		return false;
	}
}
