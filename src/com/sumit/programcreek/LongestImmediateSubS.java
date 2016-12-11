package com.sumit.programcreek;

import java.util.Arrays;

public class LongestImmediateSubS {

	public static void main(String[] args) {
		int[] arr = {100, 4, 200, 1, 3, 2};
		int[] resArr= new int[arr.length];
		Arrays.sort(arr);
		int i=1;
		while(i<arr.length){
			if(arr[i]-arr[i-1]==1){
				resArr[i]=arr[i-1];
				i++;
			}else{
				i++;
			}
		}
		System.out.println(Arrays.toString(resArr));

	}

}
