package com.sumit.datastructure;

public class QueuesUsingArrays {

	int[] array;
	int top = 0;
	int rear = 0;
	int maxSize = 0;

	public int size() {
		return array.length;
	}

	public boolean isEmpty() {
		if (top == rear) {
			return true;
		}
		return false;
	}

	public int deQueue() {
		top -= top;
		return array[top];
	}

	public void enQueue(int value) {
		if (array == null) {
			array[0] = value;
			top += top;
		} else if (array != null) {
			array[top++] = value;
		}
	}

	public void listItems(QueuesUsingArrays list) {
		list.toString();
	}

	public QueuesUsingArrays(int s) {
		maxSize = s;
		array = new int[s];
		top = 0;
	}

	public static void main(String[] args) {

		QueuesUsingArrays queue = new QueuesUsingArrays(12);
		System.out.println(queue.isEmpty());
		queue.enQueue(5);
		queue.enQueue(23);
		queue.enQueue(562);
		queue.enQueue(265);
		queue.enQueue(341);
		queue.enQueue(741);
		queue.enQueue(958);
		queue.enQueue(189);
		queue.enQueue(788);
		queue.enQueue(223);
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		queue.listItems(queue);
		

	}
}
