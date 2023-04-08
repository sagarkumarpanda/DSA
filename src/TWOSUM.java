/* 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
----------
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
----------
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
----------
Input: nums = [3,3], target = 6
Output: [0,1]

*/

// https://leetcode.com/problems/two-sum/


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
