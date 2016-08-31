package com.sumit.leetcode;

import java.util.ArrayList;

/*
 * https://leetcode.com/problems/find-the-difference/
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringCompare {

	public static void main(String[] args) {
		String s ="sumit";
		String t = "mitus";
		int i =0;
		String n ="";
		char[] ar = s.toCharArray();
		char[] ar1 = t.toCharArray();
		List set = new ArrayList(Arrays.asList(ar));
		while(i<ar1.length){
			if(set.contains(t.charAt(i))){
				i++;
				continue;
			}else{
				n+=ar[i];
				System.out.println(n);
				i++;
			}
		}
		System.out.println(n);
	}

}
