package designLinkedlist707;

public class MyLinkedList {

	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	Node head;
	int lenght;

	public MyLinkedList() {
		this.head = null;
		this.lenght = 0;
	}

	public int get(int index) {
		if (index < lenght && index >= 0) {
			Node current = head;
			while (index > 0) {
				current = current.next;
				index--;
			}
			return current.val;
		} else {
			return -1;
		}
	}

	public void addAtHead(int val) {
		Node nodeAddHead = new Node(val);
		nodeAddHead.next = head;
		head = nodeAddHead;
		lenght++;
	}

	public void addAtTail(int val) {
		Node nodeAddTail = new Node(val);
		lenght++;
		if (head == null) {
			head = nodeAddTail;
			head.next = null;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = nodeAddTail;
		}
	}

	public void addAtIndex(int index, int val) {
		if (index > lenght) {
			return;
		}
		if (index < 0) {
			addAtHead(val);
			lenght++;
		} else {
			Node dummyNode = new Node(-1);
			dummyNode.next = head;
			Node current = dummyNode;
			while (index > 0) {
				current = current.next;
				index--;
			}
			Node nodeAddIndex = new Node(val);
			Node temp = current.next;
			current.next = nodeAddIndex;
			nodeAddIndex.next = temp;
			head = dummyNode.next;
			lenght++;
		}
	}

	public void deleteAtIndex(int index) {
		if (index < lenght && index >= 0) {
			lenght--;
			Node dummyNode = new Node(0);
			dummyNode.next = head;
			Node current = dummyNode;
			while (index > 0) {
				current = current.next;
				index--;
			}
			current.next = current.next.next;
			head = dummyNode.next;
		} else {
			return;
		}
	}
}
