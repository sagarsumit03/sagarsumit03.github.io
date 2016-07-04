package com.sumit.datastructure;

public class TreesDAO {

	public static void main(String[] args) {
		Trees tree = new Trees();
		tree.insert(5);
		tree.insert(10);
		tree.insert(2);
		tree.insert(8);
		tree.insert(4);
		tree.insert(20);
		tree.insert(7);
		tree.insert(1);
		tree.insert(6);
		tree.preOrderTraversal(tree.root);
		System.out.println("-------------------------");
		tree.postOrderTraversal(tree.root);
		System.out.println("-------------------------");
		tree.inOrderTraversal(tree.root);
		tree.findMin();
		tree.findMax();
	}

}
