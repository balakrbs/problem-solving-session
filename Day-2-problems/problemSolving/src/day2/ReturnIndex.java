package day2;

import java.util.*;

public class ReturnIndex {
	public static int rotateFunction(int[] arr,int n,int k,int t) {
		Arrays.sort(arr);
		
		k=k%n;
		for(int i=0;i<k;i++) {
			rotate(arr,n);
		}
		
		for(int i=0;i<n;i++) {			
			if(arr[i]==t) {
				return i;
			}
		}
		return -1;
		
	}

	private static void rotate(int[] arr, int n) {
		// TODO Auto-generated method stub
		int last=arr[n-1];
		
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		
		int k=in.nextInt();
		int t=in.nextInt();
		
		int index=rotateFunction(arr,n,k,t);
		
		for(int i=0;i<n;i++) {			
			System.out.print(arr[i]+" ");
		}
		if(index==-1) {
			System.out.println("\nTarget not found");
		}else {
			System.out.println("\nIndex : "+index);
		}
		in.close();

	}

}
