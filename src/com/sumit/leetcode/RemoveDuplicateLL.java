package com.sumit.leetcode;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */

import com.sumit.datastructure.LinkedList;
import com.sumit.datastructure.Node;

public class RemoveDuplicateLL {

	public static void main(String[] args) {
		RemoveDuplicateLL rdl = new RemoveDuplicateLL();
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(6);
		ll.insertAtEnd(7);
		ll.insertAtEnd(9);
		ll.insertAtEnd(9);
		ll.insertAtEnd(15);
		ll.insertAtEnd(15);
		// ll.printList();
		// System.out.println("-----------------------------");
		rdl.withoutDuplicate(ll.head);
		ll.printList();
	}

	public void withoutDuplicate(Node node) {
		Node temp = null;
		if (node == null) {
			System.out.println("list Empty");
		} else {
			while (node != null) {
				if (node.getData() == node.next.getData()) {
					temp = node.next;
					node.next = node.next.next;
					temp.next = null;
				}
				node = node.next;
			}
		}
	}

}
