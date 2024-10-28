package day8;

public class IntersectionLinkedList {
	
	public static class Node {
	    int data;
	    Node next;

	    Node(int new_data) {
	        data = new_data;
	        next = null;
	    }
	}
	
	private static Node intersection(Node head1, Node head2) {
		while (head2 != null) {
			Node temp = head1;
			while (temp != null) {
				if (temp == head2)
					return head2;
				temp = temp.next;
			}
			head2 = head2.next;
		}
		return null;
	}
	

	public static void main(String[] args) {
		
		Node head1 = new Node(10);
		head1.next = new Node(15);
		head1.next.next = new Node(30);

		// creation of second list
		Node head2 = new Node(3);
		head2.next = new Node(6);
		head2.next.next = new Node(9);
		head2.next.next.next = head1.next;

		Node intersectionPoint= intersection(head1, head2);

		if (intersectionPoint == null)
			System.out.print(" No Intersection Point \n");
		else
			System.out.print("Intersection Point: "
					+ intersectionPoint.data);
	}
}
