/*

Rearrange array such that even positioned are greater than odd

Input : A[] = {1, 2, 2, 1}
Output :  1 2 1 2
Explanation : 
For 1st element, 1  1, i = 2 is even.
3rd element, 1  1, i = 4 is even.

Input : A[] = {1, 3, 2}
Output : 1 3 2
Explanation : 
Here, the array is also sorted as per the conditions. 
1  1 and 2 < 3.

*/


package array.easy;

import java.util.Arrays;

class EvenGreaterThanOddSol {
	public int[] evenGreaterThanOdd(int[] nums) {
		int result[] = new int[nums.length];
		int oddValue = 0;
		for(int i = 1; i <= nums.length; i++) {
			if(i % 2 != 0) {
				oddValue = nums[i-1];
				if(i == nums.length) {
					result[i - 1] = oddValue;
				}
			}
			else {
				if(nums[i-1] > oddValue) {
					result[i-2] = oddValue;
					result[i-1] = nums[i-1];
				}else {
					result[i-1] = oddValue;
					result[i-2] = nums[i-1];
				}
			}
		}
		return result;
	}
}

public class EvenGreaterThanOdd {
	public static void main (String args[]) {
		EvenGreaterThanOddSol obj = new EvenGreaterThanOddSol();
		int[] nums = {1, 3, 2, 1};
		int[] result = obj.evenGreaterThanOdd(nums);
		System.out.println(Arrays.toString(result));
	}
}
