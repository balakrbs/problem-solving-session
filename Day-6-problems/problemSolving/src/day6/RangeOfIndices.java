package day6;

import java.util.*;

public class RangeOfIndices {
	
	private static void findindics(int[] arr, int n,int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		
		int start=0,last=0;
		int mid=n/2;
		
		for(int i=0;i<mid;i++) {
			if(arr[i]==k) {
				start=i;
			}
		}
		for(int i=mid;i<n;i++) {
			if(arr[i]==k) {
				last=i;
			}
		}
		System.out.println("\nThe range indices : ["+start+","+last+"]");
		
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
		
		findindics(arr,n,k);	
		
		in.close();

	}

}
