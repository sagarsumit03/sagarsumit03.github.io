package com.sumit.datastructure;

import com.sumit.leetcode.FlipBinaryTree;

public class TreesDAO {

	public static void main(String[] args) {
		Trees tree = new Trees();
		Trees tree1 = new Trees();
		
		tree.insert(5);
		tree.insert(10);
		tree.insert(2);
		tree.insert(8);
		tree.insert(4);
		tree.insert(20);
		tree.insert(7);
		tree.insert(1);
		tree.insert(6);
		/*
		tree.preOrderTraversal(tree.root);
		System.out.println("-------------------------");
		tree.postOrderTraversal(tree.root);
		System.out.println("-------------------------");
		tree.inOrderTraversal(tree.root);
		tree.findMin();
		tree.findMax();
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		tree.search(8);
		*/
		tree1.insert(5);
		tree1.insert(10);
		tree1.insert(2);
		tree1.insert(8);
		tree1.insert(4);
		tree1.insert(20);
		tree1.insert(7);
		tree1.insert(1);
		tree1.insert(6);
		
		Trees.sameTree2(tree.root, tree1.root);
		FlipBinaryTree br = new FlipBinaryTree();
		//System.out.println("the trees are "+ab);
	}

}
