
/*
Find the largest three distinct elements in an array

Example 1:
----------
Input: arr[] = {10, 4, 3, 50, 23, 90}
Output: 90, 50, 23

*/
package array.easy;

import java.util.*;

class Solution1 {
	public void printLargest(int nums[]) {
		int first = 0;
		int second = 0;
		int third = 0;
		
		if(nums.length < 3) {
			System.out.println("Number does not have sufficient input");
		}
		
		else {
			for (int i=0;i <nums.length; i++) {
				if(nums[i] > first) {
					third = second;
					second = first;
					first = nums[i];
				}
				else if (nums[i] > second) {
					third  = second;
					second = nums[i];
				}
				else if (nums[i] > third) {
					third = nums[i];
				}
			}
			System.out.println("first : " + first + ", " + "second : " + second + ", " + "third : " + third);	
		}
	}
}

public class PrintLargest {
	public static void main(String args[]) {
		Solution1 obj = new Solution1();
		int nums[] = {10, 4, 3, 50, 23, 90};
		obj.printLargest(nums);
	}
}
