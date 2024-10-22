package day6;

import java.util.*;

public class InterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("size : ");
		int n=in.nextInt();
		int[] arr1=new int[n];
		System.out.println("Array 1 : ");
		for(int i=0;i<n;i++) {
			arr1[i]=in.nextInt();
		}
		
		System.out.println("size : ");
		int m=in.nextInt();
		int[] arr2=new int[m];
		System.out.println("Array 1 : ");
		for(int i=0;i<m;i++) {
			arr2[i]=in.nextInt();
		}
		
		intersection(arr1, n, arr2, m);
		
		in.close();
	}

	private static void intersection(int[] arr1, int n, int[] arr2, int m) {
		// TODO Auto-generated method stub
		Set<Integer> list=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j]) {
					list.add(arr1[i]);
				}
			}
			
		}
		
		System.out.println(list);
	}

}
