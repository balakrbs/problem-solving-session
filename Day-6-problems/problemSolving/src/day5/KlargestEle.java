package day5;

import java.util.*;

public class KlargestEle {
	
	private static int klargestEle(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		return arr[n-k];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("size");
		int n=in.nextInt();
		System.out.println("array:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Target:");
		int k=in.nextInt();
		
		int result=klargestEle(arr,n,k);
		System.out.println("\nlargest "+result);
		in.close();
	}	

}
