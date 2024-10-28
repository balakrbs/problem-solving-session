package day8;

import java.util.HashSet;

public class DupicatesLinkedList {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	private Node head;
	


	private void add(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	}

	private void remove() {
		HashSet<Integer> seen=new HashSet<>();
		Node current=head;
		Node previous=null;
		while(current!=null) {
			if(seen.contains(current.data)) {
				previous.next=current.next;
			}else {
				seen.add(current.data);
				previous=current;
			}
			current=current.next;
		}
	}

	private void display() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current=current.next;
		}
		System.out.println("null");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DupicatesLinkedList list=new DupicatesLinkedList();
		list.add(9);
		list.add(4);
		list.add(6);
		list.add(4);
		list.add(9);
		list.display();
		list.remove();
		list.display();

	}

}
