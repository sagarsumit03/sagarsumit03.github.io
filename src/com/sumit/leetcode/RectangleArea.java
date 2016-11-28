package com.sumit.leetcode;

public class RectangleArea {

	public static void main(String[] args) {
		int A=-3; int B=0; int C=3; int D=4; int E=0; int F=-1; int G=9; int H=2;
		System.out.println(areaIs(A,B,C,D,E,F,G,H));

	}
	
	public static int areaIs(int A, int B, int C, int D, int E, int F, int G, int H){
		//get the pointers:
		int x1=Math.abs(A-C);
		int y1=Math.abs(B-D);
		int x2=Math.abs(E-G);
		int y2=Math.abs(F-H);
		int ox1=Math.abs(E-C);
		int oy1=Math.abs(B-H);
		int area1=x1*y1;
		int area2=x2*y2;
		int oarea =ox1*oy1;
		int totalarea =area1+area2-oarea;
		return totalarea;
	}

}
