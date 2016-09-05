package com.sumit.leetcode;
/*
 * https://leetcode.com/problems/power-of-two/
 */

public class PowerOfTwo {

	public static void main(String[] args) {
		int a=9;
		PowerOfTwo pt = new PowerOfTwo();
		System.out.println(pt.powerTwo(a));
	}
	
	public boolean powerTwo(int a){
		return a>0 && ((a^31)+1) %a==0;
	}

}
