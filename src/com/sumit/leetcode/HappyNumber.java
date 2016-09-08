package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/happy-number/
 */

public class HappyNumber {

	public static void main(String[] args) {
		int a = 590;
		HappyNumber hn = new HappyNumber();
		System.out.println(hn.isHappy(a));

	}

	/*public boolean isHappy(int n) {
		int temp = 0;
		while (true) {
			temp += Math.pow(n % 10, 2);
			System.out.println("Temp ="+Math.pow(n % 10, 2));
			if (n >= 10)
				n = n / 10;
			else if (n < 10) {
				if (temp == 1)
					return true;
				else if (temp == 2 || temp == 3 || temp == 4)
					return false;
				else if (temp > 4 && temp < 10)
					n = (int) Math.pow(temp, 2);
				else
					n = temp;
				temp = 0;
			}
		}
	}*/
	
	
	public boolean isHappy(int a){
	return false;
	}
}
