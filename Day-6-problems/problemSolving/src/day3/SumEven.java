package day3;

import java.util.*;

public class SumEven {
	
	public static int sumEven(int[] arr,int n){
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		if(n<=15) {
			int[] arr=new int[n];
			for(int i=0;i<n;i++) 
			{
				arr[i]=in.nextInt();
			}
			
			int sum=sumEven(arr,n);
			
			System.out.println("The sum of the even numbers in the array is "+sum);
		}
		
		in.close();
	}

}
