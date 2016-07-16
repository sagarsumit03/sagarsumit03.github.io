package com.sumit.datastructure;

import com.sumit.careercup.Flattern;
import com.sumit.careercup.PointerNum;
import com.sumit.datastructure.LinkedList;;
public class LinkedListDAO {

	
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		
		list.insertAtEnd(10);
		list.insertAtEnd(100);
		list.insertAtEnd(1000);
		list.insertAtEnd(10000);
		/*list.printList();
		list.deleteFromEnd();
		list.printList();
		LinkedList list2 = new LinkedList();
		list2.printList();
		
		list2.insertAtHead(50);
		list2.insertAtEnd(150);
		list2.printList();
		System.out.println("the head for list 2 is "+list2.head.data);
		list2.head.next= list.head.next.next.next;
		System.out.println(list2.head.next.data);
		LinkedList.intersect(list, list2);
		list.nthNode(2);
		System.out.println("--------------");
		list.printList();
	
		list.reverseList();*/
		
		list.head.next.next.next =list.head;
		PointerNum poi = new PointerNum();
		poi.indexPointer(list.head);
		Flattern flat = new Flattern();
		LinkedList list2 = new LinkedList();
		list2.insertAtEnd(5);
		list2.insertAtEnd(10);
		list2.insertAtEnd(15);
		
		flat.insertDown(list2.head,6 );
		flat.insertDown(list2.head,7 );
		flat.insertDown(list2.head,8 );
		flat.insertDown(list2.head,9 );
		flat.insertDown(list2.head.next,11 );
		flat.insertDown(list2.head.next,12 );
		flat.insertDown(list2.head.next,13 );
		flat.insertDown(list2.head.next,14 );
		flat.flattern(list2.head);
		
		
	}
}
