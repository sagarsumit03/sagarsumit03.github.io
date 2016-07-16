package com.sumit.datastructure;

import java.util.HashSet;
import com.sumit.datastructure.Node;

public class LinkedList {
	public Node head;

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

	public int size() {
		Node temp = head;
		int i = 0;
		while (temp != null) {
			i++;
			temp = temp.next;

		}
		return i;

	}

	public void insertAtEnd(int data) {
		Node temp = head;
		Node newNode = new Node(null, data);
		if (head == null) {
			System.out.println("The list is empty");
			head = newNode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			System.out.println(temp.data);
			temp.next = newNode;
			System.out.println("The node has been inserted At End");
		}
	}

	public void insertAtHead(int data) {
		Node newNode = new Node(null, data);
		if (head == null) {
			System.out.println("The list is empty");
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
			System.out.println("The node has been inserted At First");
		}
	}

	public void insertInBetween(int data, int position) {
		Node temp = head;
		Node newNode = new Node(null, data);
		if (head == null) {
			System.out.println("The list is empty");
		} else {
			int i = 1;
			if (position > 0 && position <= size()) {
				while (i < position - 1 && temp.next != null) {
					temp = temp.next;
					i++;
				}
				if (i == 1) {
					insertAtHead(data);
				}
				System.out.println(i);
				System.out.println(temp.data);
				newNode.next = temp.next;
				temp.next = newNode;
				System.out.println("The node has been inserted In Between");
			} else {
				if (position <= 0) {
					System.out.println("the number is 0 or less than it");
				} else if (position > size()) {
					System.out.println("the position is greater than the linked list size");
				}

			}
		}

	}

	public void deleteFromEnd() {
		Node temp = head;
		if (head == null) {
			System.out.println("The list is empty");
			temp = head;
		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	public void deleteFromStart() {
		if (head == null) {
			System.out.println("The list is empty");
		} else {
			head = head.next;
		}
	}

	public void deleteAtPosition(int position) {
		Node temp = head;
		Node temp1 = null;
		int i = 1;
		if (head == null) {
			System.out.println("the list is Empty");
		} else if (position > size() && position <= 0) {
			System.out.println("The position is out of range");
		} else {
			for (i = 1; i < position - 1; i++) {
				temp = temp.next;
			}
			if (i == 1) {
				deleteFromStart();
			}
			System.out.println(temp.data);
			temp1 = temp.next;
			temp.next = temp.next.next;

		}
	}

	public void inLoop() {
		Node temp = head;
		HashSet<Node> set = new HashSet<Node>();
		if (temp.next == null) {
			System.out.println("the list is Empty");
		} else {
			while (temp.next != null) {
				if (set.contains(temp.next)) {
					System.out.println("The list is looped");
					break;
				} else {
					set.add(temp.next);
					temp = temp.next;
					if (temp.next == null) {
						System.out.println("the list is not looped");
						throw new NullPointerException("out of scope");
					}
				}

			}
		}

	}

	public static void intersect(LinkedList list1, LinkedList list2) {
		Node temp1 = list1.head;
		Node temp2 = list2.head;
		HashSet<Node> set1 = new HashSet<Node>();
		while (temp1.next != null) {
			set1.add(temp1.next);
			temp1 = temp1.next;
		}
		while (temp2.next != null) {
			if (set1.contains(temp2.next)) {
				System.out.println("The list Intersects");
				break;
			} else {
				temp2 = temp2.next;
			}
			System.out.println("The list Doesn't Intersects");
		}
	}

	public static void sort() {

	}

	public void reverseList() {
		Node temp = head;
		Node temp1 = null;

		while (temp != null) {
			Node temp2 = temp.next;
			temp.next = temp1;
			temp1 = temp;
			temp = temp2;
			System.out.println(temp2.data);
		}
		head = temp1;
	}

	public void nthNode(int nthNode) {
		if (nthNode > size() && nthNode <= 0) {
			System.out.println("The Nth node is greater or less than The List Size");
		} else {
			int n = size() - nthNode;
			Node temp1 = head;
			Node temp2 = head;
			for (int i = 0; i < n - 1; i++) {
				temp1 = temp1.next;
			}
			while (temp1.next != null) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			System.out.println("The " + nthNode + " from last is " + temp2.data);
		}
	}

}
