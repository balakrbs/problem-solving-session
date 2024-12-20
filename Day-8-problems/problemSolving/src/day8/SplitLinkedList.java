package day8;

public class SplitLinkedList {
	 static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	 
	 public static Node[] splitList(Node head) {
	        if (head == null || head.next == null) {
	            return new Node[]{head, null};
	        }

	        Node slow = head;
	        Node fast = head;
	        Node prev = null;
	        while (fast != null && fast.next != null) {
	            prev = slow;
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        prev.next = null;
	        return new Node[]{head, slow};
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

        Node[] halves = splitList(head);
        Node firstHalf = halves[0];
        Node secondHalf = halves[1];

        printList(firstHalf);

        printList(secondHalf);

	}

}
