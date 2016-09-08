package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/ugly-number/
 */

public class UglyNums {

	public static void main(String[] args) {
		int a = 10;
		UglyNums un =new UglyNums();
		System.out.println(un.isUgly(a));

	}

	public boolean isUgly(int a) {
		if (a < 1 || a == 1) {
			return false;
		}
		while (a != 1) {
			if (a % 5 == 0) {
				a /= 5;
			} else if (a % 3 == 0) {
				a /= 3;
			} else if (a % 2 == 0) {
				a /= 2;
			} else {
				return false;
			}

		}
		return true;

	}

}
