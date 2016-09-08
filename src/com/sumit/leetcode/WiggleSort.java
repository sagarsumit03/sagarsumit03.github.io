package com.sumit.leetcode;

import java.util.Arrays;

public class WiggleSort {

	public static void main(String[] args) {
		int arr[] = new int[]{1, 5, 1, 1, 6, 4};
		WiggleSort ws = new WiggleSort();
		ws.sortWiggle(arr);

	}
	public void swap(int arr[], int index1, int index2){
		int temp=0;
		temp = arr[index1];
		arr[index1]= arr[index2];
		arr[index2]=temp;
	}
	
	public void sortWiggle(int arr[]){
		int i =1;
		while(i<arr.length-1){
			System.out.println(i);
			if(i%2==0 ||i==0){
				if(arr[i]>arr[i-1]){
				}else{
					swap(arr,arr[i], arr[i-1]);
				}
			}if(i%2!=0){
				if(arr[i]<arr[i-1]){
				}else{
					swap(arr,arr[i], arr[i-1]);
				}
			}
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
