package com.sumit.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 3, 5, 6, 6, 7 };
		System.out.println((findDuplicate(arr)));

	}

	public static int findDuplicate(int nums[]) {
		if(nums.length==0) return 0;
		   int index =0;
		   for(int i=1; i<nums.length; i++){
		        if(nums[i]!=nums[index]){
		            nums[++index] = nums[i];
		        }
		  }
		   System.out.println(Arrays.toString(nums));
		return index+1;
	}
	
	
	
	public static void findDuplicates(int arr[]){
		
	}

}
