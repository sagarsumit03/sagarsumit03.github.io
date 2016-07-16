package com.sumit.careercup;

/*
 * https://www.careercup.com/question?id=5761604919492608
 */

import com.sumit.datastructure.Node;

public class PointerNum {

	public int indexPointer(Node node){
		Node temp = node;
		Node a = temp.getNext().getNext();
		Node b = temp.getNext();
		int counter = 1;
		while(temp.getNext()!=null){
			a = a.getNext().getNext();
			b = b.getNext();
			counter++;
			if(a==b){
				System.out.println("The loop Exists at "+counter);
				break;
			}
			
		}
		return counter;
	}
	
	public static void main(String[] args) {
		

	}

}
