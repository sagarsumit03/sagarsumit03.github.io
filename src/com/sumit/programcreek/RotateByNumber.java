package com.sumit.programcreek;

import java.util.Arrays;

public class RotateByNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		RotateByNumber rn = new RotateByNumber();
		rn.rotateByNum(3, arr);

	}

	public void rotateByNum(int k, int[] arr) {
		int[] n = new int[arr.length];
		int i = 0;
		int j = k - 1;
		int b = 0;
		int res = arr.length / k;
		while (b < res) {
			while (i < k) {
				n[i] = arr[j];
				j--;
				i++;
			}
			k+=k;
			j=k-1;
			b++;			
		}
		while(i<arr.length){
			n[i]=arr[i];
			i++;
		}
		System.out.println(Arrays.toString(n));
	}

}