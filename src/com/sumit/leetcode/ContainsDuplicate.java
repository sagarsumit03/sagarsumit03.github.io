package com.sumit.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * https://leetcode.com/problems/contains-duplicate/
 */

public class ContainsDuplicate {

	public static void main(String[] args) {
		int arr[] = new int[]{1,2,4,5,6,8,9,0};
		ContainsDuplicate cd = new ContainsDuplicate();
		System.out.println(cd.isDuplicate(arr));
	}
	
	public boolean isDuplicate(int arr[]){
		Set<Integer> counter = new HashSet<Integer>();
		int i=0;
		while(i<arr.length){
			if(counter.contains(arr[i])){
				System.out.println("The repeat number is "+arr[i]);
				return true;
			}else{
				counter.add(arr[i]);
				i++;
			}
		}
		return false;
	}

}
