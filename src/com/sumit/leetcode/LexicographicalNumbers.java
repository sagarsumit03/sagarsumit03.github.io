package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/lexicographical-numbers/
 */

import java.util.Arrays;

public class LexicographicalNumbers {

	public static void main(String[] args) {
		LexicographicalNumbers ln = new LexicographicalNumbers();
		int num = 256;
		ln.printLexicographical(num);
	}
	
	public void printLexicographical(int num){
		int arr[]= new int[10];
		int i=0;
		while(i<arr.length){
			arr[i]=num%10;
			num /=10;
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
