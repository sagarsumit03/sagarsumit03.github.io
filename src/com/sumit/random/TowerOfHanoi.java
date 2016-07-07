package com.sumit.random;

import java.util.Stack;

public class TowerOfHanoi {
	
	Stack<Object> stack1 = new Stack<Object>();
	Stack<Object> stack2 = new Stack<Object>();
	Stack<Object> stack3 = new Stack<Object>();
	Object obj1 = new Object();
	Object obj2 = new Object();
	Object obj3 = new Object();
	
	public Object initTower(){
		stack1.add(obj1);
		stack1.add(obj2);
		stack1.add(obj3);
		return stack1;
	}
	
}
