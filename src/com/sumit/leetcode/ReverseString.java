package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/reverse-string/
 */

public class ReverseString {

	public static void main(String[] args) {
		String s ="hello";
		String n ="";
		int i=s.length()-1;
		while(i>=0){
			n+=s.charAt(i);
			i--;
		}
		System.out.println(n);

	}

}
