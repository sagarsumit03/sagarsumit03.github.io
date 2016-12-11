package com.sumit.programcreek;
/*
 * http://www.programcreek.com/2014/05/leetcode-reverse-words-in-a-string-ii-java/
 */

public class ReverseString {

	public static void main(String[] args) {
		String s = "the sky is blue is magical and mesmerizing";
		ReverseString rs = new ReverseString();
		System.out.println(rs.getReverse(s));
	}
	
	public String getReverse(String s){
		String s2 ="";
		int i =s.length()-1;
		int j =s.length();
		while(i>0){
			if(s.charAt(i)==' '){
				s2=s2.concat(s.substring(i+1, j));
				s2+=" ";
				j=i;				
			}
			i--;
		}
		return s2=s2.concat(s.substring(0,j));
	}

}
