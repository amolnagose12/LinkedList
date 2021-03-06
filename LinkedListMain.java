package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
	
		System.out.println("Welcome to custom LinkedList program");
		
		CustomLinkedList mylist = new CustomLinkedList();
		
		mylist.add(70);
		mylist.add(56);
		mylist.print();
		
		//inserting 30 at position 1 as 70, 56
		System.out.println("\nAfter adding the 30");
		mylist.insert(1, 30);
		mylist.print();
		
		//after deleting 1st element
		System.out.println("\nAfter deleting 1st element");
		mylist.deleteFirst();
		mylist.print();
		
		//after deleting last element
		System.out.println("\nAfter deleting last element");
		mylist.deleteLast();
		mylist.print();
	}
}