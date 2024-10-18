package day3;

import java.util.*;

public class SortingHalf {
	
	public static void sortingHalf(int[] arr,int n) {
		
		int mid=n/2;
		
		Arrays.sort(arr,0,mid);
		
		Integer[] arr1=new Integer[n-mid];
		for(int i=mid;i<n;i++) {
			arr1[i-mid]=arr[i];
		}
		Arrays.sort(arr1,Collections.reverseOrder());
		
		for(int i=mid;i<n;i++) {
			arr[i]=arr1[i-mid];
		}
		
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		
		sortingHalf(arr,n);
		in.close();
	}

}
