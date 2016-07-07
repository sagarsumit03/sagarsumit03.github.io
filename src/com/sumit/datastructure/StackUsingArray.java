package com.sumit.datastructure;


public class StackUsingArray {

	static int array[];
	static int size=0;
	static int top =-1;
	static int maxSize = 0;
	static boolean isEmpty = false;
	boolean isFull = false;
	
	public static void main(String[] args) {
		
		StackUsingArray stack = new StackUsingArray(12);
		
		System.out.println(stack.isEmpty());
		stack.push(145);
		stack.push(245);
		stack.push(4322);
		stack.push(8932);
		stack.push(656);
		stack.push(4590);
		stack.push(23435);
		stack.push(24);
		stack.push(6564);
		stack.push(675);
		stack.push(789);
		stack.push(14514);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		

	}
	
	public int size(){
		
		return size = array.length;
	}
	
	public boolean isEmpty(){
		if(top==-1){
			return isEmpty = true;
		}
		else{
			return false;
		}
	}
	
	public int push(int value){
			return array[++top] = value;
	}
	
	public int pop(){
	return array[top--];
		
	}
	
	public StackUsingArray(int s) {
	      maxSize = s;
	      array = new int[maxSize];
	      top = -1;
	   }

	
	
	

}
