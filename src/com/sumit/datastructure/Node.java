package com.sumit.datastructure;

public class Node {
	public Node next;
	

	Node previous;
	int data;
	Node left;
	Node right;
	Node down; // added for question of com.sumit.careercup.Flattern class

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getDown() {
		return down;
	}

	public void setDown(Node down) {
		this.down = down;
	}
	
	public Node() {
		super();
	}

	public Node(Node next, Node previous, int data) {
		super();
		this.next = next;
		this.previous = previous;
		this.data = data;
	}

	public Node(Node next, int data) {
		this.next = next;
		this.data = data;
	}

	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node(int data, Node down) {
		super();
		this.data = data;
		this.down = down;
	}

}
