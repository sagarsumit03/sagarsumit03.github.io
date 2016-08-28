package com.sumit.leetcode;

/*
 * Prime Numbers - Sieve of Eratosthenes
 */
import java.util.Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		int arr[] = new int[100];
		int i = 0;
		int j = 0;
		while (j < 100) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				if (i == 2 || i == 3 || i == 5 || i == 7) {
					arr[j] = i;
					j++;
				}
				i++;
			} else {
				arr[j] = i;
				i++;
				j++;
			}
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
