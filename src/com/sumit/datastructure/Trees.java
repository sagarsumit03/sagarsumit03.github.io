package com.sumit.datastructure;

/*
 * Doubly Linked List is used for Binary Tree
 * Binary tree have 0-1-2 children.
 * A binary Search tree has all the left element smaller than root and 
 * right element is greater than root.
 */

public class Trees {

	Node root = null;
	int i = 1;

	public static Node preOrderTraversal(Node node) {
		// Root - Left - Right
		if (node != null) {
			System.out.println(node.data);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
		return node;
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
		// it is always in increasing sorted order.
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

	public void findMin() {
		if (root == null) {
			System.out.println("The list is Empty");
		} else {
			Node temp = root;
			while (temp.left != null) {
				temp = temp.left;
			}
			System.out.println("The Minimum value is " + temp.data);
		}
	}

	public void findMax() {
		if (root == null) {
			System.out.println("The list is Empty");
		} else {
			Node temp = root;
			while (temp.right != null) {
				temp = temp.right;
			}
			System.out.println("The Maximum value is " + temp.data);
		}
	}

	public void delete(int data) {
		if (root == null) {
			System.out.println("the Tree is Empty");
		} else {
			// if its leaf node
		}
	}

	public void search(int data) {

		if (data == root.data) {

			System.out.println("The element is found in " + i + " attempt");
		} else if (data > root.data) {
			root = root.right;
			i++;
			search(data);
		} else {
			root = root.left;
			i++;
			search(data);
		}
	}

	public static boolean sameTree(Node temp1, Node temp2) {
		if (temp1 == null && temp2 == null) {
			System.out.println("the tree are same");
			return true;
		} else if (temp1 == null || temp2 == null) {
			System.out.println("the tree are not same");
			return false;
		}
		return temp1.data == temp2.data && sameTree(temp1.right, temp2.right) && sameTree(temp1.left, temp2.left);

	}

	public static void sameTree2(Node temp1, Node temp2) {
		if (temp1 == null && temp2 == null) {
			System.out.println("the tree are same");
		} else if (temp1 == null || temp2 == null) {
			System.out.println("the tree are not same");
		} else {
			if (temp1.data == temp2.data
					&& ((preOrderTraversal(temp1.left)).data == (preOrderTraversal(temp2.left)).data)
					&& ((preOrderTraversal(temp1.right)).data == (preOrderTraversal(temp2.right)).data)) {
				System.out.println("The list are same");
			} else {
				System.out.println("The list are not same");
			}
		}
	}

	public int size(Node node) {
		if (node == null) {
			System.out.println("The tree is Empty");
			return 0;
		} else {
			return (size(node.left) + 1 + size(node.right));
		}
	}

	public void findSum(int data) {
		int sum = 0;
		if (root.data == data) {
			System.out.println("The sum is " + root.data);
		} else {
			Node temp = root;
			while(temp.left!=null|| temp.right!=null){
				temp.data+=sum;
				if(sum==data){
					System.out.println("the sum is found");
				}else{
					temp = temp.left;
					if(temp.left==null){
						temp = temp.right;
						if(temp.right==null){
							break;
						}
					}
				}
			}
		}
	}
}
