package array.easy;

import java.util.Arrays;

class Solution3{
	public int[] moveAllZerosToEnd(int nums[]) {
		int lastindexCheck = nums.length - 1;
		int startIndexCheck = 0;
		int[] result = new int[nums.length];
		for(int i=0; i< nums.length; i++) {
			if(nums[i] == 0) {
				result[lastindexCheck] = 0;
				lastindexCheck--;
			}else {
				result[startIndexCheck] = nums[i];
				startIndexCheck ++;
			}
		}
		return result;
	}
}

public class AllZerosToEnd {
	public static void main(String args[]) {
		Solution3 obj = new Solution3();
		int[] nums = {1,5,9,0,67,34,0,89,77,0,0,2};
		int result[] = obj.moveAllZerosToEnd(nums);
		System.out.println(Arrays.toString(result));
	}
}
