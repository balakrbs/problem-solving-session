package day6;

import java.util.*;

public class MaxiCircularSort {

	private static int sortAndMaxi(int[] arr, int n) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);//sorting
		
		int k=n/2;
		for(int i=0;i<k;i++) { //rotating
			rotate(arr,n);
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");//Optional
		}
		return arr[k-1];
				
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
		
		int max=sortAndMaxi(arr,n);
		System.out.println("\n Maximum : "+max);
		in.close();

	}
}
