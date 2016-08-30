package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/find-the-difference/
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringCompare {

	public static void main(String[] args) {
		String s ="sumit";
		String t = "mitus";
		int i =0;
		String n ="";
		char[] ar = s.toCharArray();
		char[] ar1 = t.toCharArray();
		Set set = new HashSet(Arrays.asList(ar));
		while(i<ar1.length){
			if(set.contains(ar1[i])){
				i++;
				continue;
			}else{
				n+=ar[i];
				i++;
			}
		}
		System.out.println(n);
	}

}
