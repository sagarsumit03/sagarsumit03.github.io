package com.sumit.leetcode;
/*
 * System.out.println(Integer.MAX_VALUE);
MaxInt = \frac{ 2^{32} }{2} - 1 since we use 32 bits to represent the number,
half of the range is used for negative numbers and 0 is part of the positive numbers
Knowing the limitation of n, 
we can now deduce that the maximum value of n that is also a power of three is 1162261467.
 We calculate this as:

3^19​​ =1162261467


VVI-https://en.wikipedia.org/wiki/Fast_inverse_square_root
 */

public class PowerOfThree {

	public static void main(String[] args) {
		int a = 7;
		PowerOfThree pt = new PowerOfThree();
		System.out.println(pt.powerofThree(a));

	}

	public boolean powerofThree(int a) {
		return a > 0 && 1162261467 % a == 0;
	}

}
