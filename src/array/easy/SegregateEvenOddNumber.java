/*
Segregate even and odd numbers

Given an array arr[] of integers, segregate even and odd numbers in the array.
Such that all the even numbers should be present first, and then the odd numbers.

Input: arr[] = 1 9 5 3 2 6 7 11
Output: 2 6 5 3 1 9 7 11

Input: arr[] = 1 3 2 4 7 6 9 10
Output:  2 4 6 10 7 1 9 3


*/


package array.easy;

import java.util.Arrays;

public class SegregateEvenOddNumber {
	
	public static int[] segregateEvenOddNumber(int nums[]) {
		int[] result = new int[nums.length];
		int startIndex = 0;
		int lastIndex = nums.length - 1;
		for(int i = 0; i< nums.length; i++) {
			if(nums[i]%2 == 0) {
				result[startIndex++] = nums[i];
			}else {
				result[lastIndex--] = nums[i];
			}
		}
		return result;
	}

	public static void main(String args[]) {
		int nums[] = {1, 3, 2, 4, 7, 6, 9, 10};
		int result[] = segregateEvenOddNumber(nums);
		System.out.println(Arrays.toString(result));
	}
}
