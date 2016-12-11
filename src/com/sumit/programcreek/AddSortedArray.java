package com.sumit.programcreek;

import java.util.Arrays;

public class AddSortedArray {

	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 7, 10, 15,19 };
		int[] b = { 2, 4, 8, 9, 13 };
		int[] c = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
				k++;
			}
			if (a[i] > b[j]) {
				c[k] = b[j];
				k++;
				j++;
			}

		}
		int len = 0;
		if (i >= a.length) {
			System.arraycopy(b, j, c, i+j-1, b.length-a.length);
		} else {
			System.arraycopy(a, i, c, i+j, a.length-b.length);
		/*arraycopy takes 1.source array
						  2. position in source array to be copied
						  3. destination array
						  4.position in the dest array to be copied
						  5. the lenth of the source array to be copied
		*/
		}
		System.out.println(Arrays.toString(c));
	}

}
