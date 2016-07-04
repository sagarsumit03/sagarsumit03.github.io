package com.sumit.datastructure;

public class DoublyLinkedListDAO {

	public static void main(String[] args) {
		DoublyLinkedList dList = new DoublyLinkedList();
		dList.InsertAtFirst(6);
		dList.InsertAtFirst(7);
		dList.InsertAtFirst(9);
		dList.InsertAtFirst(10);
		dList.InsertAtFirst(12);
		dList.InsertAtFirst(16);
		System.out.println();
		
		dList.insertInBetween(45, 2);
		System.out.println("The Head is"+dList.head.data);
		dList.insertIntoEnd(186);
		dList.printList();
		System.out.println("The size is "+dList.size());
		
		
		System.out.println("----------------------------------");
		//dList.deleteFromEnd();
		//dList.deleteFromFirst();
		dList.deleteAtPosition(6);
		dList.printList();
		System.out.println("-----------------");
		System.out.println();
		dList.printList();
		System.out.println("-----------------");
		dList.reverseList();
	
	}

}
