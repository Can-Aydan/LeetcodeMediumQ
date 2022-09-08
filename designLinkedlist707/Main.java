package designLinkedlist707;

public class Main {

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		//	[[], [1], [3], [1, 2], [1], [1], [1]]
		myLinkedList.addAtHead(1);
		myLinkedList.addAtTail(3);
		myLinkedList.addAtIndex(1, 2);
		myLinkedList.get(1);
		System.out.println(myLinkedList.get(1));
		myLinkedList.deleteAtIndex(1);
		myLinkedList.get(1);
		System.out.println(myLinkedList.get(1));
		
	}

}
