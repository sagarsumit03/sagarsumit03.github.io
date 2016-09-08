package com.sumit.leetcode;
/*
 * https://leetcode.com/problems/strobogrammatic-number
 */

public class StrobogrammaticNumber {

	public static void main(String[] args) {
		int a=97;
		StrobogrammaticNumber sgn = new StrobogrammaticNumber();
		System.out.println(sgn.isStrobogrammatic(a));

	}

	public boolean isStrobogrammatic(int a) {
		int i = 0;
		String s = Integer.toString(a);
		while (i < s.length()) {
			if (s.charAt(i) == '1' || s.charAt(i) == '9' || s.charAt(i) == '6' || s.charAt(i) == '8') {
				i++;
			} else {
				return false;
			}

		}
		return true;
	}

}
