package com.sumit.leetcode;

import java.math.BigInteger;

/*
 * https://leetcode.com/problems/factorial-trailing-zeroes/
 */

public class TrailingZeros {

	public static void main(String[] args) {
		TrailingZeros tz = new TrailingZeros();
		System.out.println(tz.isTrailing(10));

	}
	
	public int isTrailing(int num){
		int i =1;
		int fact= 1;
		while(i<=num){
			fact =fact*i;
			i++;
		}
		System.out.println(fact);
		String s=Integer.toString(fact);
		System.out.println(s);
		int res=0;
		i=s.length()-1;
		while(i>0){
			if(s.charAt(i)=='0'){
				res+=1;
				i--;
			}else{
				i--;
			}
		}
		return res;
	}

}
