package question;

import java.util.HashSet;
import java.util.Set;

public class Q3_2 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,3,5,9,7,6};
		System.out.println(duplicate(nums));
	}
	
	public static boolean duplicate(int[] nums) {
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) {
				return true;
			}else {
				set.add(nums[i]);
			}
		}
		return false;
		
		
	}
}
