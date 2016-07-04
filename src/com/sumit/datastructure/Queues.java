package com.sumit.datastructure;

public class Queues {
	LinkedList list = new LinkedList();
	Node front = list.head;
	Node back = null;

	public void enQueue(int data) {
		Node newNode = new Node(null, data);
		if (front == null) {
			front = newNode;
			back = front;
		} else {
			back.next = newNode;
			back = newNode;
		}
	}

	public void deQueue() {
		if(front==null){
			System.out.println("UnderFlow");
		}
		else{
			Node temp = front;
			front = front.next;
			temp.next = null;
		}
	}

	public void printList() {
		Node temp = front;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
