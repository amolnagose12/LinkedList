package com.bridgelabz.linkedlist;

public class CustomLinkedList {

	public Node head = null;
	public Node tail = null;
		
	// class for operations of Linked List
	class Node {
		int data;
		Node next;
			
		//Constructor for class Node
		public Node(int data) {
			super();
			this.data = data;
			this.next = next;
		}	
	}
		
	//method for adding the data to linked list
	public void add(int data) {
		Node mynode = new Node(data);
		mynode.next = head;
		head = mynode;
	}
		
	//method for printing the linked list data
	public void print(Node head){
		
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

//	@Override
//	public String toString() {
//		return "CustomLinkedList [head=" + head + ", tail=" + tail + "]";
//	}
}

