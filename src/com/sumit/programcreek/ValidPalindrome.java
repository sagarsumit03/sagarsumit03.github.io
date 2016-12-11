package com.sumit.programcreek;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "Red rum, sir, is murder";
		ValidPalindrome vp = new ValidPalindrome();
		System.out.println(vp.isPalindrome(s));

	}

	public boolean isPalindrome(String s){
		s=s.replaceAll("[,!.:\\s]", "");
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		if(s.equalsIgnoreCase(sb.toString())){
			return true;
		}return false;
	}
}
