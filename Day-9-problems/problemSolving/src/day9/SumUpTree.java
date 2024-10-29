package day9;

import java.util.*;

public class SumUpTree {
	
	public class Node{
		int data;
		Node left,right;
		
		public Node(int value) {
			this.data = value;
			this.left = null;
			this.right = null;
		}
	}
	
	Node root;
	
	SumUpTree() {
		root = null;
	}
	
	

	private Node insert(Node root, int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		
		if(data<root.data) {
			root.left=insert(root.left, data);
		}else if(data>root.data) {
			root.right=insert(root.right, data);
		}		
		return root;
	}

	int sum(Node node) {
		if(node==null) {
			return 0;
		}
		
		return node.data+sum(node.left)+sum(node.right);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumUpTree bt=new SumUpTree();
		Scanner in=new Scanner(System.in);
		int noofNodes=in.nextInt();
		
		for(int i=0;i<noofNodes;i++) {
			int value=in.nextInt();
			bt.root=bt.insert(bt.root,value);
		}
		
		int sum=bt.sum(bt.root);
		System.out.println("\nSum of All elements : "+sum);
		in.close();
	}
}