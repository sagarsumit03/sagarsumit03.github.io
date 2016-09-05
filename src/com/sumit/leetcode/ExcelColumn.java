package com.sumit.leetcode;
/*
 * (1st place=1-26(add) )+ 2nd place(1-26*26)+3rd(1-26*26)
 */


public class ExcelColumn {

	public static void main(String[] args) {
		ExcelColumn ex = new ExcelColumn();
		String s = "AAC";
		ex.returnColumn(s);

	}
	
	public void returnColumn(String s){
		char[] c = s.toCharArray();
		int n = s.length()-1;
		int i =0;
		int count =0;
		while(i<=n){
			count=(s.toLowerCase().charAt(i)-'a'+1)*(i^26);
			System.out.println("for i ="+i+"  "+(s.toLowerCase().charAt(i)-'a'+1));
			System.out.println(i^26);
			System.out.println("the count is "+count);
			System.out.println("------------------------------");
			i++;
			
		}
		System.out.println(count);
	}

}
