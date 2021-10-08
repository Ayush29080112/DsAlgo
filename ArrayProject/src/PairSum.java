import java.util.Arrays;

public class PairSum {
	
	 public int[] twoSum(int[] nums, int target) {
	      
	        
	        for(int i =0; i<nums.length;i++){
	            for(int j=i+1;j< nums.length ; j++){
	                if(nums[i]+nums[j]==target) {
	                	return new int[] {i,j};
	                }
	            }
	        }
	        return null;
	    }
	 
	 public static void main(String[] args) {
		PairSum p = new PairSum();
		System.out.println(Arrays.toString(p.twoSum(new int[] {3,2,4}, 6)));
	}
	 
	 

}
