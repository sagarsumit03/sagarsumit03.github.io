package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/single-number/
 */

public class TwicebutOnce {

	public static void main(String[] args) {
		int[] a = new int[]{1,3,5,1,8,5,3};
		int[] b = new int[]{1,1,3,3,5,5};
		TwicebutOnce to = new TwicebutOnce();
		System.out.println(to.singleNumber(b));

	}
	
	int singleNumber(int A[]) {
	    int result = 0;
	    int n = A.length;
	    for (int i = 0; i<n; i++)
	    {
	    	System.out.println(result);
			result ^=A[i];
	    }
		return result;
	}

}
