package com.sumit.algorithm;

import java.util.Arrays;

public class SortingAlogTest {

	public static void main(String[] args) {

		SortingAlgo sorted = new SortingAlgo();
		int[] unsortedArr = new int[] { 64, 25, 12, 22, 11 };
		int[] sortedArr = new int[] {12,25, 64, 11, 22 };
		// sorted.bubbleSort(unsortedArr);
		 //sorted.insertionSort(unsortedArr);
		//sorted.selectionSort(unsortedArr);
		//sorted.quickSort(unsortedArr);
		sorted.merge(sortedArr, 0, 2, 4);
		//sorted.mergeSort(unsortedArr, 0, unsortedArr.length-1);
	}

}
