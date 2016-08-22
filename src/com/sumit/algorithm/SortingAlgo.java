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
		int k = 0;
		while (i < arr.length) {
			k = i;
			while (j >= 0) {
				if (arr[j] > arr[i]) {
					swap(arr, j, i);
				}
				j--;
				i--;
			}
			i = k + 1;
			j = i - 1;
		}
		System.out.println(Arrays.toString(arr));

	}

	public int searchMin(int index1, int index2, int arr[]) {
		int min = arr[index1];
		int i = 0;
		int counter = index1;
		while (index1 <= index2) {
			if (arr[index1] < min) {
				counter = index1;
				min = arr[index1];
				index1++;
			} else {
				index1++;
			}
		}

		// System.out.println(i);
		System.out.println(counter);
		return counter;
	}

	public void selectionSort(int arr[]) {
		System.out.println("abc" + Arrays.toString(arr));
		int i = 0;
		int index = 0;
		while (i < arr.length) {
			index = searchMin(i, arr.length - 1, arr);
			System.out.println("in" + arr[index]);
			swap(arr, i, index);
			i++;
		}
		System.out.println("abc" + Arrays.toString(arr));
	}

	public void quickSort(int arr[]) {
		int currentElement = 0;
		int i = 0;
		int pivot = 0;
		int pivotIndex = arr.length - 1;
		int sortedIndex = 0;
		while (i < arr.length) {
			System.out.println("i " + i);
			pivot = arr[pivotIndex];
			System.out.println(" pivot " + pivot);
			if (arr[currentElement] < pivot) {
				swap(arr, currentElement, sortedIndex);
				sortedIndex++;
				System.out.println("sortedIndex " + sortedIndex);
			}
			if (currentElement == pivotIndex) {
				swap(arr, pivotIndex, sortedIndex);
				sortedIndex++;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length + arr2.length];
		int i = 0;
		int k = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		System.out.println(Arrays.toString(arr));
		
		while (i < arr1.length)
	    {
	        arr[k] = arr1[i];
	        i++;
	        k++;
	    }

	    while (j < arr2.length)
	    {
	        arr[k] = arr2[j];
	        j++;
	        k++;
	    }
		
		return arr;

	}
	
	
	
	public int[] merge(int[] arr, int i, int j, int k){
		//where i is the init index, j is the last index for sorted array, and j+1 to k is
		//the last index.
		int l =i;
		int n =j+1;
		int m=0;
		int newArr[] = new int[arr.length];
		while(l<=j && n<=k){
			if(arr[i]<arr[n]){
				newArr[m]=arr[i];
				i++;
			}else if(arr[i]>arr[n]){
				newArr[m]=arr[n];
				n++;
			}
			m++;
		}
		m=m-1;
		System.out.println(" val of i"+i);
		System.out.println("val of j "+j);
		System.out.println(" val of m "+m);
		while (l <= j)
	    {
	        arr[m] = arr[l];
	        l++;
	        m++;
	    }

	    while (n <= k)
	    {
	        arr[m] = arr[n];
	        n++;
	        m++;
	    }
		System.out.println(Arrays.toString(newArr));
		return newArr;
	}

	public void mergeSort(int arr[], int lowIndex, int highIndex) {
		int mid=0;
		if(lowIndex<highIndex){
			mid=(lowIndex+highIndex)/2;
			mergeSort(arr, lowIndex, mid);
			mergeSort(arr, mid+1, highIndex);
			merge(arr, lowIndex, mid, highIndex);
		}
		System.out.println(" The list is "+Arrays.toString(arr));
	}

}
