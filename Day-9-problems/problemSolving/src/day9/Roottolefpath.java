package day9;

import java.util.*;

class Node {
	int data;
	Node left, right;

	Node(int value) {
		data = value;
		left = right = null;
	}
}

class Leafnodelogic {
	Node root;

	Leafnodelogic() {
		root = null;
	}

	
	public Node insert(Node root, int data) {
		// tree is null
		if (root == null) {
			root = new Node(data);
			return root;
		}
		
		if (data < root.data) {
			
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}

		return root;
	}
	
	
	void printrootoleafpath(Node node) {
		
		List<Integer> pl=new ArrayList<>();
		findpaths(node,pl);
	}
	
	
	void findpaths(Node node, List<Integer> pl) {
		//base case->
		if(node==null) return;

		pl.add(node.data);
		
		if(node.left==null&&node.right==null) {
			System.out.println(pl);
		}else {
			findpaths(node.left, new ArrayList<>(pl));
			findpaths(node.right, new ArrayList<>(pl));

		}
		
	}

}

public class Roottolefpath {
	
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);

		Leafnodelogic tree = new Leafnodelogic();
		int noofnodes = sc.nextInt();

		for (int i = 0; i < noofnodes; i++) {
			int value = sc.nextInt();
			tree.root = tree.insert(tree.root, value);
		}

		
		tree.printrootoleafpath(tree.root);
		sc.close();
	}

}
