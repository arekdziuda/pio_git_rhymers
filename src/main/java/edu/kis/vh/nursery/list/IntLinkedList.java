package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private final int POP_RETURN_VALUE_IF_LIST_IS_EMPTY = -1;
	private final int TOP_RETURN_VALUE_IF_LIST_IS_EMPTY = -1;
	private Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}

	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return TOP_RETURN_VALUE_IF_LIST_IS_EMPTY;
		return last.VALUE;
	}

	public int pop() {
		if (isEmpty())
			return POP_RETURN_VALUE_IF_LIST_IS_EMPTY;
		int ret = last.VALUE;
		last = last.prev;
		return ret;
	}
}
