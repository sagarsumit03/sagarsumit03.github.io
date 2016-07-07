package com.sumit.datastructure;

public class DoublyLinkedList {

	Node head = null;

	public void insertIntoEnd(int data) {
		Node newNode = new Node(null, null, data);
		if (head == null) {
			head = newNode;
			System.out.println("The Node has been inserted At First");
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			// System.out.println(temp.data);
			temp.next = newNode;
			newNode.previous = temp;
			System.out.println("The Node has been inserted At End");
		}
	}

	public void InsertAtFirst(int data) {
		Node newNode = new Node(null, null, data);
		if (head == null) {
			head = newNode;
			System.out.println("The Node has been inserted At first");
		} else {
			newNode.next = head;
			head = newNode;
			System.out.println("The Node has been inserted");
		}
	}

	public void insertInBetween(int data, int position) {
		Node newNode = new Node(null, null, data);
		if (head == null || (position < 0 && position > size())) {
			head = newNode;
			System.out.println("The Node has been inserted");
		} else {
			Node temp = head;
			int i = 1;
			for (; i < position - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			newNode.previous = temp;
			System.out.println("The Node has been inserted");
		}
	}

	public int size() {
		int i = 1;
		if (head == null) {
			System.out.println("The list is empty");
		} else {
			Node temp = head;

			while (temp != null) {
				temp = temp.next;
				i++;
			}
		}
		return i++;
	}

	public void deleteFromEnd() {
		if (head == null) {
			System.out.println("The list is Empty: ERROR!!");
		} else {
			Node temp = head;
			int i = 1;
			for (; i < size() - 2; i++) {
				temp = temp.next;
			}
			temp.next.previous = null;
			temp.next = null;
			System.out.println("The link has been deleted from End");
		}
	}

	public void deleteFromFirst() {
		if (head == null) {
			System.out.println("The list is Empty: ERROR!!");
		} else {
			Node temp = head;
			head.next.previous = null;
			temp.next = head;
			temp.next = null;
			System.out.println("The link has been deleted from Front");
		}
	}

	public void deleteAtPosition(int position) {

		System.out.println("The position is " + position + " The size is " + size());
		if (head == null) {
			System.out.println("The list is Empty");
		}

		else if (position <= 0 || position > size()) {
			System.out.println("The Value Entered is Wrong");
		} else {
			Node temp = head;
			int i = 1;
			for (; i < position - 1; i++) {
				temp = temp.next;
			}
			Node temp1 = null;
			temp1 = temp.next.next;
			temp.next.next = null;
			temp.next.previous = null;
			temp.next = temp1;
			temp1.previous = temp;
			System.out.println("Node deleted at Position");
		}
	}

	public void printList() {
		if (head == null) {
			System.out.println("the list is empty");
		} else {
			Node temp = head;
			while (temp.next != null) {
				System.out.println(" The list is " + temp.data);
				temp = temp.next;
			}
			System.out.println(" The list is " + temp.data);
		}

	}

	public void reverseList() {
		{
			Node temp = head;
			Node newHead = head;
			System.out.println("The reverse list is");
			while (temp != null) {
				Node prev = temp.previous;
				temp.previous = temp.next;
				temp.next = prev;
				newHead = temp;
				temp = temp.previous;
				System.out.println(newHead.data);
			}
		}

	}
}
