package com.bridgelabz.linkedlist;

public class CustomLinkedList {

	Node head;
	
	// class for operations of Linked List
	class Node {
		int data;
		Node next;
		
		//Constructor for class Node
		public Node(int data) {
			super();
			this.data = data;
			next = null;
		}	
	}
	
	//method for adding the data to linked list
	public void add(int data) {
		
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = toAdd;
		}
	}
	
	//method for printing the linked list data
	public void print(){
		
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return;
		}
		else {
			Node temp = head;
			
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	
	// method for checking head is null
	boolean isEmpty() {
		
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//method for inserting at specific position
	public void insert(int pos, int data) {
		
		Node toInsert = new Node(data);
	
		if(isEmpty()) {
			head = toInsert;
		}
		else {
			Node temp = head;
		
			for(int i=0; i<pos-1; i++) {
				temp = temp.next; 
			}
			toInsert.next = temp.next;
			temp.next = toInsert;
		}
	}
	
	//method for deleting 1st element
	public void deleteFirst() {
		
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return;
		}
		else {
			Node temp = head;
			temp = temp.next;
			head = temp;
		}
	}
	
	//method for deleting last element
	public void deleteLast() {
			
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return;
		}
		else {
			Node temp = head;
			Node last = temp.next;
			
			while(last.next != null) {
				temp = last;
				last = last.next;
			}
			temp.next = null;
		}
	}
	
	@Override
	public String toString() {
		return "CustomLinkedList [head=" + head + "]";
	}
	
	
}