package com.sumit.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str= new String[]{"abc","ab", "a","abcd"};
		
		System.out.println(longestPref(str));

	}
	
	public static String longestPref(String strs[]){
		 if (strs == null || strs.length == 0)    return "";
	        
	        String result = strs[0];
	        System.out.println("result"+result);
	        for (int i=1; i<strs.length; i++) {
	        	System.out.println(strs[i].indexOf(result));
	            while(strs[i].indexOf(result) != 0) {
	                result = result.substring(0, result.length()-1);
	                System.out.println(result.substring(0, result.length()-1));
	            }
	        }
	        
	        return result;
	}

}
