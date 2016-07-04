package com.sumit.datastructure;

/*
 * Doubly Linked List is used for Binary Tree
 * Binary tree have 0-1-2 children.
 * A binary Search tree has all the left element smaller than root and 
 * right element is greater than root.
 */

public class Trees {

	Node root = null;

	public void preOrderTraversal(Node node) {
		// Root - Left - Right
		if (node != null) {
			System.out.println(node.data);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

	public void postOrderTraversal(Node node) {
		// Left - Right - Root
		if (node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node.data);
			
		}
	}

	public void inOrderTraversal(Node node) {
		// Left - Root - Right
		//it is always in increasing sorted order.
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.println(node.data);
			inOrderTraversal(node.right);
		}
	}

	public void insert(int data) {
		Node newNode = new Node(null, null, data);
		if (root == null) {
			root = newNode;
			System.out.println("Data inserted in Root" + root.data);
		} else {
			Node current = root;
			Node temp = null;
			while (current != null) {
				temp = current;
				if (current.data <= data) {
					current = current.right;
				} else {
					current = current.left;
				}
			}
			if (temp.data <= data) {
				temp.right = newNode;
				System.out.println("Data inserted in Right" + temp.right.data);
			} else {
				temp.left = newNode;
				System.out.println("Data inserted in left" + temp.left.data);
			}
		}
	}
	
	public void findMin(){
		if(root== null){
			System.out.println("The list is Empty");
		}else{
			Node temp = root;
			while(temp.left!=null){
				temp=temp.left;				
			}System.out.println("The Minimum value is "+temp.data);
		}
	}
	
	public void findMax(){
		if(root== null){
			System.out.println("The list is Empty");
		}else{
			Node temp = root;
			while(temp.right!=null){
				temp=temp.right;				
			}System.out.println("The Maximum value is "+temp.data);
		}
	}
	
	public void delete(int data){
		if(root==null){
			System.out.println("the Tree is Empty");
		}else{
			//if its leaf node
		}
	}
}
