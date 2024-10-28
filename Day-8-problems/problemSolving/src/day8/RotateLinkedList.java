package day8;

public class RotateLinkedList {
	
	static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
	
	 public static Node rotate(Node head, int k) {
	        if (head == null || k == 0) return head;

	        Node current = head;
	        int length = 1;
	        while (current.next != null) {
	            current = current.next;
	            length++;
	        }

	        current.next = head;

	        k = k % length;
	        int stepsToNewHead = length - k;
	        current = head;

	        for (int i = 1; i < stepsToNewHead; i++) {
	            current = current.next;
	        }

	        Node newHead = current.next;
	        current.next = null;

	        return newHead;
	    }

	    public static void printList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	public static void main(String[] args) {
		 Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);
	        head.next.next.next = new Node(4);
	        head.next.next.next.next = new Node(5);

	        printList(head);

	        int k = 2;
	        head = rotate(head, k);

	        printList(head);

	}

}
