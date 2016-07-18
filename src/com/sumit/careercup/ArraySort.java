package com.sumit.careercup;

import java.util.Arrays;

/*
 * https://www.careercup.com/question?id=5718829326925824
 */

public class ArraySort {

	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,8,9,45};
		int arr2[] = new int[]{0,1,3,5};
		int a =0;
		int newArr[] = new int[Math.abs(arr.length+arr2.length)];
		for(int i=0; i<arr.length;i++){
			newArr[i] = arr[i];
		}
		System.out.println(newArr.length);
		for(int i=arr.length; i<newArr.length;i++){
			
			newArr[i] = arr2[a];
			a++;
		}
		Arrays.sort(newArr);
		for(int s:newArr){
			System.out.println(s);
		}
	}

}
