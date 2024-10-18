package day2;

import java.util.*;

public class MergeArrays {
	
	public static void mergeArray(int[] arr1,int[] arr2, int size1, int size2) {

		int[] array=new int[size1+size2];
		
		for(int i=0;i<size1;i++) {
			array[i]=arr1[i];
		}
		for(int i=0;i<size2;i++) {
			array[i+size2]=arr2[i];
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		int size1=in.nextInt();		
		int[] arr1=new int[size1];		
		for(int i=0;i<size1;i++) {
			arr1[i]=in.nextInt();
		}
		
		
		int size2=in.nextInt();
		int[] arr2=new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i]=in.nextInt();
		}
		
		in.close();
		mergeArray(arr1,arr2,size1,size2);	
		System.out.println();
	}

}
