package com.sumit.programcreek;

import java.util.Arrays;

/*
 * http://www.programcreek.com/2014/05/leetcode-kth-largest-element-in-an-array-java/
 */

public class KElement {

	public static void main(String args[]) {
		int[] arr ={3,2,1,5,6,4};
		KElement kl = new KElement();
		System.out.println(kl.findKthLargest(arr, 2));
	}

	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
}
