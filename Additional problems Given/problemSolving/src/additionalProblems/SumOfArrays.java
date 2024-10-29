package additionalProblems;

import java.util.*;

public class SumOfArrays {
	
	public static void sumOfArrays(int[] arr1,int[] arr2,int n) {
		int[] newArr=new int[n];
		
		for(int i=0;i<n;i++) {
			newArr[i]=arr1[i]+arr2[i];
		 }
		
		for(int i=0;i<n;i++) {
			System.out.print(newArr[i]+" ");
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 int[] arr1=new int[n];
		 int[] arr2=new int[n];
		 
		 for(int i=0;i<n;i++) {
				 arr1[i]=in.nextInt();
		 }
		 
		 for(int i=0;i<n;i++) {
			 arr2[i]=in.nextInt();
		 }
		 
		 sumOfArrays(arr1, arr2,n);
		 
		 in.close();	 
		 
	}

}
