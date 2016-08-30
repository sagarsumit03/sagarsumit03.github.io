package com.sumit.leetcode;

/*
 * digital root topic in Wikipedia
 * https://leetcode.com/problems/add-digits/
 */

public class AddDigits {

	public static void main(String[] args) {
		int num = 256;
		AddDigits ad = new AddDigits();
		System.out.println(ad.digitalRoot(num));
	}

	int n = 0;

	public int digitalRoot(int num) {
		if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        else {
            return num % 9;
        }

	}

}
