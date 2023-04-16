/*
Rearrange an array in maximum minimum form using Two Pointer Technique

input: arr[] = {1, 2, 3, 4, 5, 6, 7} 
Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

Input: arr[] = {1, 2, 3, 4, 5, 6} 
Output: arr[] = {6, 1, 5, 2, 4, 3} 

*/


package array.easy;

import java.util.Arrays;

public class ReArrangeArray {
	public static int[] reArrangeArray(int[] nums) {
		int result[] = new int[nums.length];
		Arrays.sort(nums);
		int counter = 0;
		for (int i = 0 , j = nums.length; i< nums.length/2; i++, j--) {
			if(i != j && j > i) {
				result[counter++] = nums[j - 1];
				result[counter++] = nums[i];
			}
		}
		if(nums.length%2 != 0) {
			result[nums.length - 1] =  nums[nums.length/2];
		}
		return result;
	}
	
	// better Logic
	public static int[] reArrangeArray2(int[] nums) {
		int result[] = new int[nums.length];
		Arrays.sort(nums);
		
		boolean flag = true;
		int startIndex = 0;
		int lastIndex = nums.length - 1;
		
		for(int i=0; i<nums.length; i++) {
			if(flag) {
				result[i] = nums[lastIndex--];
			}else {
				result[i] = nums[startIndex++];
			}
			flag = !flag;
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int[] result = reArrangeArray2(nums);
		System.out.println(Arrays.toString(result));
	}
}
