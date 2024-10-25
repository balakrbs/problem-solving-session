package day7;


public class PriorityQueue {
	
	private int[] heap;
	private int size;
	private int capacity;
	

	public PriorityQueue(int capacity) {
		this.heap =new int[capacity];
		this.size = 0;
		this.capacity = capacity;
	}
	
	private void insert(int value) {
		// TODO Auto-generated method stub
		if(size==capacity) {
			throw new IllegalStateException("----Queue is Full----");
		}
		heap[size]=value;
		size++;
		heapifyUp(size-1);	
	}
	

	private int remove() {
		// TODO Auto-generated method stub
		if(size==0) {
			throw new IllegalStateException("----Queue is Empty----");
		}
		int min=heap[0];
		heap[0]=heap[size-1];
		size--;
		heapifyDown(0);
		return min;
		
	}
	

	private int peek() {
		// TODO Auto-generated method stub
		if(size==0) {
			throw new IllegalStateException("----Queue is Empty----");
		}
		return heap[0];
		
	}
	
	private void heapifyUp(int index) {
		// TODO Auto-generated method stub
		while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[index] < heap[parentIndex]) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
	}
	

	private void heapifyDown(int index) {
		// TODO Auto-generated method stub
		 int smallest = index;
	        int leftChild = 2 * index + 1;
	        int rightChild = 2 * index + 2;

	        if (leftChild < size && heap[leftChild] < heap[smallest]) {
	            smallest = leftChild;
	        }
	        if (rightChild < size && heap[rightChild] < heap[smallest]) {
	            smallest = rightChild;
	        }
	        if (smallest != index) {
	            swap(index, smallest);
	            heapifyDown(smallest);
	        }
		
	}

	private void swap(int index, int parentIndex) {
		// TODO Auto-generated method stub
		int temp=heap[index];
		heap[index]=heap[parentIndex];
		heap[parentIndex]=temp;
	}
	
	private void display() {
		if(size==0) {
			throw new IllegalStateException("----Queue is Empty----");
		}
		for(int i=0;i<size;i++) {
			System.out.print(heap[i]+" ");
		}
		System.out.println();
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq=new PriorityQueue(5);
		pq.insert(3);
		pq.insert(1);
		pq.insert(4);
		pq.insert(7);
		pq.insert(9);		
		System.out.println("peek : "+pq.peek());
		pq.display();
		pq.remove();
		pq.remove();
		System.out.println("peek : "+pq.peek());
		pq.display();

	}
}