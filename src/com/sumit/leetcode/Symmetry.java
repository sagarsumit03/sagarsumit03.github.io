package com.sumit.leetcode;

import com.sumit.datastructure.Node;

/*
 * https://leetcode.com/problems/symmetric-tree/
 */

import com.sumit.datastructure.Trees;

public class Symmetry {

	public static void main(String[] args) {
		Trees tree = new Trees();
		tree.insert(1);
		tree.insert(2);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(4);
		tree.insert(3);
		//we can't search for symmetry as binary tree can't be symmetric
		boolean result = isSymmetric(tree.root);
		System.out.println(result);
	}
	
	public static boolean isSymmetric(Node root){
		return isMirror(root, root);
	}
	
	private static boolean isMirror(Node n1, Node n2){
		if(n1==null||n2==null){
			return false;
		}else{
			return(n1.getData()==n2.getData()) && (n1.getLeft()==n2.getRight()) && (n1.getRight()==n2.getLeft());
			
		}
	}

}
