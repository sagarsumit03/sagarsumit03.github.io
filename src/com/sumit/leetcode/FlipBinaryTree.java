package com.sumit.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.parsers.DocumentBuilderFactory;

import com.sumit.datastructure.Node;

public class FlipBinaryTree {

	public void flipIt(Node node) {
		Node temp = null;
		Node lefty = node.getLeft();
		Node righty = node.getRight();
		temp = node.getLeft();
		lefty = node.getRight();
		righty = temp;
		Queue<Node> queue = new LinkedList<Node>();

		queue.offer(node);
		while (!queue.isEmpty()) {
			node = queue.poll();
			System.out.println("THe node is " + node.getData());
			if (lefty != null) {
				queue.add(righty);
			}
			if (righty != null) {
				queue.add(lefty);
			}

		}
	}
}
