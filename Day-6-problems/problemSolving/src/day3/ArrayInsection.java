package day3;

import java.util.*;

public class ArrayInsection {
	
	public static void arrayInsection(int[] arr,int n,int  position,int k) {
		
		int[] newArr=new int[n+1];
		
		for(int i=0;i<n+1;i++) {
			if(position==i) {
				break;
			}else {
				newArr[i]=arr[i];
			}
		}
		newArr[position]=k;
		
		for(int i=position;i<n;i++) {
			newArr[i+1]=arr[i];
		}
		
		for(int i=0;i<n+1;i++) {			
			System.out.print(newArr[i]+" ");
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
		int position=in.nextInt();
		int k=in.nextInt();
		
		arrayInsection(arr,n, (position-1),k);
		
		in.close();

	}

}
