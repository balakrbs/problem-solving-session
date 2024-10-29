package day9;

public class BSTtoDoublyLinkedList {
	
	public static class Node {
	    int data;
	    Node left, right;

	    Node(int data) {
	        this.data = data;
	        left = right = null;
	    }
	}
	
	private Node head = null;
    private Node prev = null;

    public Node convertToDoublyLinkedList(Node root) {
        if (root == null) {
            return null;
        }

        convertToDoublyLinkedList(root.left);

        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        
        prev = root;        
        convertToDoublyLinkedList(root.right);
        
        return head;
    }
    
    public void printDoublyLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		 	Node root = new Node(36);
	        root.left = new Node(26);
	        root.right = new Node(46);
	        root.left.left = new Node(11);
	        root.left.right = new Node(31);
	        root.left.left.right = new Node(24);
	        root.right.left = new Node(41);
	        root.right.right = new Node(56);
	        root.right.right.left = new Node(51);
	        root.right.right.right = new Node(66);

	        BSTtoDoublyLinkedList converter = new BSTtoDoublyLinkedList();
	        Node head = converter.convertToDoublyLinkedList(root);

	        System.out.println("Doubly Linked List in sorted order:");
	        converter.printDoublyLinkedList(head);
	}
}
