package day5;

import java.util.*;

public class CheckSort {
	
	private static boolean checkSort(int[] arr, int n) {
		// TODO Auto-generated method stub
		int[] newArr=Arrays.copyOf(arr, n);
		
		Arrays.sort(newArr);
		
		if(Arrays.equals(arr,newArr)) {
			return true;
		}else {
			return false;
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
		
		if(checkSort(arr,n)) {
			System.out.println("\nGiven array is sorted array");
		}else {
			System.out.println("\nGiven array isn't sorted array");
		}
		
		in.close();

	}

}
