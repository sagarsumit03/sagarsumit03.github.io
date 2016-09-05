package com.sumit.leetcode;

public class NoOf1Bits {

	public static void main(String[] args) {
		int a = 11;
	NoOf1Bits no = new NoOf1Bits();
	System.out.println(no.getBits(a));

	}
	public int getBits(int a){
		int num = 0;
		num = Integer.parseInt(toBinary(a));
		return num;
	}
	
	public String toBinary(int a){
		String num = Integer.toBinaryString(a);
		return num;
		
	}

}
