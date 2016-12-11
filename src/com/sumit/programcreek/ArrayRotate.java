package com.sumit.programcreek;
/*
 * http://www.programcreek.com/2015/03/rotate-array-in-java/
 */

import java.util.Arrays;

public class ArrayRotate {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayRotate ar = new ArrayRotate();
		ar.rotateBy(3, arr);

	}

	public void rotateBy(int k, int[] nums) {
		int i = nums.length - k;
		int[] num = new int[nums.length];
		int j = 0;
		while (j < nums.length) {
			num[j] = nums[i];
			i++;
			j++;
			if (i == nums.length) {
				i = 0;
			}
		}
		System.out.println(Arrays.toString(num));
	}

}
