package day7;

public class CircularQueue {
	
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	

	public CircularQueue(int capacity) {
		this.queue = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
		this.capacity = capacity;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size==0);
		
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
			return (size == capacity);
	}

	private void enqueue(int value) {
		// TODO Auto-generated method stub
		
		if(isFull()) {
			System.out.println("Queue is Full");
			return ;
		}
		rear=(rear+1)%capacity;
		queue[rear]=value;
		size++;
		System.out.println(value+" is Enqueued");
		
	}
	
	private int dequeue() {
		// TODO Auto-generated method stub
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int value=queue[front];
		front=(front+1)%capacity;
		size--;
		return value;
		
	}
	
	private int peekFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return queue[front];
	}
	
	private int peekRear() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return queue[rear];
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueue queue=new CircularQueue(5);
		
		queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50); 
		System.out.println(queue.dequeue()+" is Dequeued");
		System.out.println(queue.dequeue()+" is Dequeued");
		queue.enqueue(60);
        queue.enqueue(70);
        
		System.out.println("Front : "+queue.peekFront());
		System.out.println("Rear : "+queue.peekRear());

	}

	
}
