package com.sumit.algorithm;

import java.util.Arrays;

public class SortingAlgo {

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void swap(int arr[], int index1, int index2) {
		int temp = 0;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public boolean isSorted(int[] arr) {
		int i = 1;
		boolean isSorted = false;
		while (i < arr.length) {
			if (arr[i] > arr[i - 1]) {
				i++;
				isSorted = true;
			} else {
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}

	public void bubbleSort(int[] arr) {
		int i = 1;
		int n = 0;
		if (isSorted(arr) == true) {
			System.out.println("the list is already sorted");
		} else {
			while (n < arr.length) {
				while (i < arr.length) {
					if (arr[i] < arr[i - 1]) {
						swap(arr, i, i - 1);
						i++;
						continue;
					} else {
						i++;
					}
				}
				i = 1;
				n++;
			}
		}
		for (int k : arr) {
			System.out.println(k);
		}

	}

	public void insertionSort(int[] arr) {
		int i = 1;
		int j = i - 1;
		int k =0;
		while (i < arr.length) {
			k=i;
			System.out.println("the init value of i is"+i);
			while (j >= 0) {
				System.out.println("the init value of j is"+j);
				if (arr[j] > arr[i]) {
					swap(arr, j, i);
					System.out.println("after swap value at "+i+" is "+arr[i]);
					System.out.println("after swap value of "+j+" is "+arr[j]);
				}
				j--;
				i--;
			}
			i=k+1;
			j = i - 1;
		}
		System.out.println(Arrays.toString(arr));

	}
}
