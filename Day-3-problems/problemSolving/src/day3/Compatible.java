package day3;

import java.util.*;

public class Compatible {
	
	public static boolean compatible(int[] arr1,int[] arr2,int n) {
		for(int i=0;i<n;i++) {
			if(arr2[i]>arr1[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=in.nextInt();
		}
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=in.nextInt();
		}
		in.close();
		if(compatible(arr1,arr2,n)) {
			System.out.println("Compatible");
		}else {
			System.out.println("Incompatible");
		}
	}

}
