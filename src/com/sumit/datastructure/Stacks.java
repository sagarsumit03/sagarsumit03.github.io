package com.sumit.datastructure;

public class Stacks {

	LinkedList list = new LinkedList();
	Node top = null;
	int size = 0;

	// operation:

	public boolean isEmpty(Stacks stack) {
		if (top == null) {
			System.out.println("The list is Empty");
			return true;
		}
		return false;
	}

	public void push(int data) {
		list.insertAtEnd(data);
		size++;
	}

	public void pop() {
		if (top == null) {
			System.out.println("The Stack is Empty");
		} else {
			list.deleteFromEnd();
			size--;
		}
	}

	public void printStack() {
		if (top == null) {
			System.out.println("The Stack is Empty");
		} else {
			Node temp = list.head;
			while (temp != null) {
				System.out.println(temp.data);
			}
		}

	}
	

}
