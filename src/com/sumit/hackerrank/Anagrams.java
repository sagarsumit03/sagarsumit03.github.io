package com.sumit.hackerrank;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String a = "bacdc";
		String b = "dcban";
		System.out.println(isAnagrams(a, b));

	}

	public static boolean isAnagrams(String a, String b) {
		StringBuilder s = new StringBuilder();
		StringBuilder d = new StringBuilder();
		char[] c = a.toCharArray();
		Arrays.sort(c);
		s.append(String.valueOf(c));// or new String(charArrays);
		c = b.toCharArray();
		Arrays.sort(c);
		d.append(String.valueOf(c));
		System.out.println(s);
		System.out.println(d);
		if (s.toString().equals(d.toString())) {
			return true;
		} else {
			return false;
		}
	}

}
