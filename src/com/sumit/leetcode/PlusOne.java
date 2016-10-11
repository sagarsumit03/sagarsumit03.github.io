package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/plus-one/
 */

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int num[] = new int[] { 9, 0, 9 };
		int num1[] = new int[] { 1, 9, 3 };
		
		System.out.println(Arrays.toString(PlusOne.addOne(num)));
	}

	public static int[] addOne(int arr[]) {
		int n = arr.length;
	    for(int i=n-1; i>=0; i--) {
	        if(arr[i] < 9) {
	            arr[i]++;
	            return arr;
	        }	        
	        arr[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    System.out.println(Arrays.toString(newNumber));
	    newNumber[0] = 1;
	    
	    return newNumber;
	}
}
