package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/climbing-stairs/
 */

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 15;
		ClimbingStairs cs = new ClimbingStairs();
		System.out.println(cs.noOfWays(n));

	}

	public int isNeeded(int n) {
		if(n<=1){
			return n;
		}else{
			return isNeeded(n-1)+isNeeded(n-2);
		}
	}
	
	public int noOfWays(int n){
		return isNeeded(n+1);
	}
}
