package com.bridgelabz.linkedlist;

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		}
	
}

public class MyLinkedList {
	
	public static void main(String[] args) {
		Node head = new Node(56);
		Node secondData = new Node(30);
		Node thirdData = new Node(70);
		
		head.next = secondData;
		secondData.next = thirdData;
		
		printLinkedList(head);
	}
	public static void printLinkedList(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
