package com.sumit.leetcode;
/*
 * https://leetcode.com/problems/isomorphic-strings/
 * 
 * Two strings are isomorphic if the characters in s can be replaced 
 * to get t.

All occurrences of a character must be replaced with another
 character while preserving the order of characters. 
 No two characters may map to the same character 
 but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
 */

import java.util.*;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "fon";
		String b = "egg";
		IsomorphicStrings is = new IsomorphicStrings();
		System.out.println(is.isIsomorphic(s, b));

	}

	public boolean isIsomorphic(String s, String t) {
		Map m = new HashMap();
		HashMap<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			if (map.containsKey(c1)) {
				if (map.get(c1) != c2)// if not consistant with previous ones
					return false;
			} else {
				if (map.containsValue(c2)) // if c2 is already being mapped
					return false;
				map.put(c1, c2);
			}
		}

		return true;
	}
}
