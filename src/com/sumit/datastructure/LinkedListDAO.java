package com.sumit.datastructure;

import com.sumit.datastructure.LinkedList;;
public class LinkedListDAO {

	
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		
		list.insertAtEnd(10);
		list.insertAtEnd(100);
		list.insertAtEnd(1000);
		list.insertAtEnd(10000);
		list.printList();
		LinkedList list2 = new LinkedList();
		//list2.printList();
		//
		list2.insertAtHead(50);
		list2.insertAtEnd(150);
		//list2.printList();
		//System.out.println("the head for list 2 is "+list2.head.data);
		//list2.head.next= list.head.next.next.next;
		//System.out.println(list2.head.next.data);
		//LinkedList.intersect(list, list2);
		list.nthNode(2);
		
	}
}
