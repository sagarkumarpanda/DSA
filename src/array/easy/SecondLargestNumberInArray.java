package array.easy;
import java.util.*;

class Solution2{
	int secondLargestNumber = 0;
	public void secondLargestNumber(int nums[]) {
		Arrays.sort(nums);
		System.out.println(nums[nums.length - 2]);
	}
}

public class SecondLargestNumberInArray {
	public static void main(String args[]) {
		Solution2 obj = new Solution2();
		int[] nums = {1,2,3,4,4,9}; 
		obj.secondLargestNumber(nums);
	}
}
