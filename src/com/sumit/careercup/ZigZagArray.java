package com.sumit.careercup;

/*
 * https://www.careercup.com/question?id=5654187787419648
 */

public class ZigZagArray {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 3; j++) {
					System.out.println(a[i][j]);
				}
			} else {
				for (int j = 2; j >= 0; j--) {
					System.out.println(a[i][j]);
				}
			}

		}

	}

}
