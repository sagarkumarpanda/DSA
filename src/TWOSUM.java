import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numData = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
           int num = target - nums[i];
            if(numData.containsKey(num)){
                return new int[] {numData.get(num), i};
            }
            else{
                numData.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}


public class TWOSUM {
	public static void main(String args[]) {
		Solution obj = new Solution();
		int[] nums = {2,7,11,15};
		int target = 9;
		int solution[] = obj.twoSum(nums, target);
		System.out.println(Arrays.toString(solution));
	}
}
