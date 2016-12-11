package com.sumit.programcreek;

public class ForvsWhile {

	public static void main(String[] args) {
		long start =System.currentTimeMillis();
		int arr[]=new int[100000000];
		int i=0;
		/*for(;i<100000;i++){
			arr[i]=i;
		}
		i=0;
		while(i<arr.length){
			arr[i]=i;
			i++;
		}*/
		
		for(int a:arr){
			arr[a]=a;
		}
		long finish =System.currentTimeMillis();
		long time =finish-start;
		System.out.println(time);
	}

}
