package day7;

import java.util.*;

public class ArrayStack {
	
	private static void findGreater(int[] arr, int n) {
		// TODO Auto-generated method stub
		Stack<Integer> stk=new Stack<>();
		int[] newArr=new int[n];
		
		for(int i=n-1;i>=0;i--) {
			
			while(!stk.isEmpty() && stk.peek() <= arr[i]) {
				stk.pop();
			}
			
			if(stk.isEmpty()) {
				newArr[i]=-1;
			}else {
				newArr[i]=stk.peek();
			}
			
			stk.push(arr[i]);
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.print(newArr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		
		findGreater(arr,n);
		
		in.close();

	}	

}
