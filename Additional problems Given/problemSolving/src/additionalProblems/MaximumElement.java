package additionalProblems;

import java.util.*;

public class MaximumElement {
	
	
	public static int maximum(int[] arr,int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr[n-1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n<=15) {
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}
			
			int max=maximum(arr,n);
			
			System.out.println(max+" is the maximum element in the array");			
		}else {
			System.out.println("The maximum size is 15 for the array");
		}
		
		in.close();
	}

}
