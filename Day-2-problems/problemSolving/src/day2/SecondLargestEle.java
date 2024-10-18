package day2;

import java.util.*;

public class SecondLargestEle {
	
	public static int secondLargest(int[] arr, int size) {
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");			
		}
		
		return arr[size-2];
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}

		System.out.println("\n"+secondLargest(arr,size));
		in.close();
		
	}
}
