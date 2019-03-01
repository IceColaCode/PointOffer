package question;

public class Q4 {

	public static void main(String[] args) {
		int[][] nums= {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(find(nums,5));
		
	}
	
	public static boolean find(int[][] nums,int key) {
		int i=0;
		int j=nums[0].length-1;
		while(i<=nums.length&&j>=0) {
			if(nums[i][j]==key) {
				return true;
			}else if(nums[i][j]>key){
				j--;
			}else {
				i++;
			}
		}
		return false;
	}
}
