package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/number-of-1-bits/
 */

public class NoOf1Bits {

	public static void main(String[] args) {
		int a = 514;
	NoOf1Bits no = new NoOf1Bits();
	System.out.println(no.getBits(a));

	}
	public int getBits(int a){
		int num = 0;
		String s = "";
		//num = Integer.parseInt(toBinary(a));
		s = toBinary(a);
		int i =0;
		int count=0;
		while(i<s.length()){
			if(s.charAt(i)=='1'){
				count++;
				i++;
			}else{
				i++;
			}
		}
		return count;
	}
	
	public String toBinary(int a){
		
		String num = Integer.toBinaryString(a);
		System.out.println(num);
		return num;
		
	}

}
