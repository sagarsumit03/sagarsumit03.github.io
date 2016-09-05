package com.sumit.leetcode;
/*
 * https://leetcode.com/problems/majority-element/
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityNumber {

	public static void main(String[] args) {
		int a[] = new int[]{1,2,2,4,2,6,3,2,8,2,2,9,2};
		MajorityNumber mn = new MajorityNumber();
		//System.out.println(mn.findMajorityNum(a));
		System.out.println(mn.findWithMap(a));

	}
	
	public int findMajorityNum(int arr[]){
		Arrays.sort(arr);
	      return arr[arr.length/2];
	}
	
	public int findWithMap(int arr[]){
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		int i =0;
		int k = 0;
		while(i<arr.length){
			if(count.containsKey(arr[i])){
				count.put(arr[i], count.get(arr[i])+1);
			}else{
				count.put(arr[i], 1);
			}
			i++;
		}
		
		Iterator iterate = count.entrySet().iterator();
		while(iterate.hasNext()){
			Map.Entry<Integer, Integer> pair = (Entry<Integer, Integer>) iterate.next();
			if(pair.getValue()>arr.length/2){
				k = pair.getKey();
				System.out.println("The most frequent char is "+pair.getKey());
			}
		}
		return k ;
	}

}
