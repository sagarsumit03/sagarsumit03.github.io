package com.sumit.datastructure;

public class QueueDAO {

	public static void main(String[] args) {
		Queues queue = new Queues();
		queue.enQueue(5);
		queue.enQueue(12);
		queue.enQueue(17);
		queue.enQueue(21);
		queue.enQueue(26);
		queue.printList();
		
		queue.deQueue();
		queue.deQueue();
		System.out.println();
		queue.printList();
		
		System.out.println("the back is "+queue.back.data+"\n The top is "+queue.front.data);
		
	}

}
