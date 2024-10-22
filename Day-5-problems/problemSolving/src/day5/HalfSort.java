package day5;

import java.util.*;

public class HalfSort {
	
	private static void sortHalf(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int m=n/2;
		Arrays.sort(arr,0,m);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
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
		
		sortHalf(arr,n);
		in.close();

	}	

}
