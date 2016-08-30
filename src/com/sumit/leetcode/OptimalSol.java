package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/nim-game/
 */

public class OptimalSol {

	public static void main(String[] args) {
		int numOfHeap = 4;
		OptimalSol os = new OptimalSol();
		boolean n = os.canWinNim(numOfHeap);
		System.out.println(n);

	}

	public boolean canWinNim(int n) {
		return !(n % 4 == 0);
	}

}
