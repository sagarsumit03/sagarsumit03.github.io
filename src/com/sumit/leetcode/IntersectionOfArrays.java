package com.sumit.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */

public class IntersectionOfArrays {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 2, 1 };
		int[] b = new int[] { 3, 5 };
		int i = 0;
		List<Integer> list = new ArrayList<Integer>();
		while (i < a.length) {
			list.add(a[i]);
			i++;
		}
		i = 0;
		while (i < b.length) {
			if (list.contains(b[i])) {
				System.out.println(b[i]);
				break;
			} else {
				i++;
			}
			System.out.println("Lists are not intersecting");
			break;
		}
	}

}
