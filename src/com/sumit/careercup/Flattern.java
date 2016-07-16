package com.sumit.careercup;

/*
 *https://www.careercup.com/question?id=5112453361827840 
 */


import com.sumit.datastructure.*;

public class Flattern {

	public void flattern(Node node) {
		Node temp = node;
		
		if (temp == null) {
			System.out.println("The list is Empty");
		} else {
			while (temp.getNext() != null) {
				Node temp1 = temp.getDown();
				System.out.println("Next Pointer" + temp.getData());
				while (temp1.getDown() != null) {
					System.out.println("Down Pointer" + temp1.getData());
					temp1 = temp1.getDown();
				}
				
				temp = temp.getNext();
			}
		}
	}

	public void insertDown(Node node, int val) {
		Node temp = node;
		Node temp1 = temp;
		Node newNode = new Node(val,null );
		while (temp1.getDown() != null) {
			temp1 = temp1.getDown();			
		}
		temp1.setDown(newNode);
	}

}
