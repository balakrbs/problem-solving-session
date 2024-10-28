package day8;

public class StackUsingLinkedList {
	
	static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
	private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }


    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode; 
        System.out.println(data +" Pushed");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next; 
        System.out.println(poppedData+" Popped");
        return poppedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data; 
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());
    }
}