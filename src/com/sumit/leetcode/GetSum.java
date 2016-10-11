package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/path-sum/
 */

import com.sumit.datastructure.Node;

public class GetSum {

	public static void main(String[] args) {
		

	}
	
	public boolean isSum(Node root, int sum){
		if(root.getData()==sum){
			return false;
		}else if(root.getLeft()==null|| root.getRight()==null){
				return false;
		}else if(root==null){
			return false;
		}else{
			return isSum(root.getLeft(), sum-root.getData())||isSum(root.getRight(), sum-root.getData());
		}
	}

}
