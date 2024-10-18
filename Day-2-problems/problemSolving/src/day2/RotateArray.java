package day2;

import java.util.*;

public class RotateArray {
	
	public static void rotateFunction(int[] arr, int n, int k) {
		
		k=k%n;
		
		for(int i=0;i<k;i++){
			rotateOne(arr,n);
		}
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void rotateOne(int[] arr, int n) {
		
		int last=arr[n-1];
		
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		int k=in.nextInt();
		
		rotateFunction(arr,n,k);
		in.close();
		
	}

}
