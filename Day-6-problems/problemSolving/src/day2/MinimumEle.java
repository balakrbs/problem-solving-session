package day2;

import java.util.*;

public class MinimumEle {
	
	public static int rotateFunction(int[] arr,int n,int k) {
		Arrays.sort(arr);
		
		k=k%n;
		
		for(int i=0;i<k;i++) {
			rotate(arr,n);
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		return Arrays.stream(arr).min().getAsInt();
		
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
		
		int min=rotateFunction(arr, n,k);
		
		System.out.println("\nMinimum : "+min);
		in.close();
	}

}
