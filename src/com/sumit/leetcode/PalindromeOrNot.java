package com.sumit.leetcode;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int a = 100;
		PalindromeOrNot pl = new PalindromeOrNot();
		System.out.println(pl.isPalindrome(a));

	}

	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		if (x < 10)
			return true;
		if (x < 100)
			return (!(x % 10 == x / 10)) ? false : isPalindrome((x - x % 10 - (x / 10) * (10)) / 10);
		if (x < 1000)
			return (!(x % 10 == x / 100)) ? false : isPalindrome((x - x % 10 - (x / 100) * (100)) / 10);
		if (x < 10000) {
			if ((x % 10 != x / 1000) || ((x / 10) % 10 != (x / 100) % 10))
				return false;
			else if ((x / 10) % 10 == 0)
				x += 110;
			return isPalindrome((x - x % 10 - (x / 1000) * (1000)) / 10);
		}
		if (x < 100000) {
			if ((x % 10 != x / 10000) || ((x / 10) % 10 != (x / 1000) % 10))
				return false;
			else if ((x / 10) % 10 == 0)
				x += 1010;
			return isPalindrome((x - x % 10 - (x / 10000) * (10000)) / 10);
		}
		if (x < 1000000) {
			if ((x % 10 != x / 100000) || ((x / 10) % 10 != (x / 10000) % 10))
				return false;
			else if ((x / 10) % 10 == 0)
				x += 10010;
			return isPalindrome((x - x % 10 - (x / 100000) * (100000)) / 10);
		}
		if (x < 10000000) {
			if ((x % 10 != x / 1000000) || ((x / 10) % 10 != (x / 100000) % 10))
				return false;
			else if ((x / 10) % 10 == 0)
				x += 100010;
			return isPalindrome((x - x % 10 - (x / 1000000) * (1000000)) / 10);
		}
		if (x < 100000000) {
			if ((x % 10 != x / 10000000) || ((x / 10) % 10 != (x / 1000000) % 10))
				return false;
			else if ((x / 10) % 10 == 0)
				x += 1000010;
			return isPalindrome((x - x % 10 - (x / 10000000) * (10000000)) / 10);
		}
		if (x < 1000000000) {
			if ((x % 10 != x / 100000000) || ((x / 10) % 10 != (x / 10000000) % 10))
				return false;
			else if ((x / 10) % 10 == 0)
				x += 10000010;
			return isPalindrome((x - x % 10 - (x / 100000000) * (100000000)) / 10);
		}
		if (x < 2147483647) {
			if ((x % 10 != x / 1000000000) || ((x / 10) % 10 != (x / 100000000) % 10))
				return false;
			else if ((x / 10) % 10 == 0) {
				x = (x - x % 10 - (x / 1000000000) * (1000000000)) / 10;
				x += 10000001;
				return isPalindrome(x);
			}
			return isPalindrome((x - x % 10 - (x / 1000000000) * (1000000000)) / 10);
		} else
			return false;

	}

}
