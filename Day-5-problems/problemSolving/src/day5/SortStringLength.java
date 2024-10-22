package day5;

import java.util.*;

public class SortStringLength {
	
	public static void sortStringLength(String str) {
		// TODO Auto-generated method stub
		
		String[] strArr=str.split(",");

		Integer[] size=new Integer[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			size[i]=strArr[i].length();
		}
		
		for(int i=0;i<size.length;i++) {
			for(int j=i+1;j<size.length;j++) {
			if(size[i]>size[j]) {
				String temp=strArr[i];
				strArr[i]=strArr[j];
				strArr[j]=temp;
				
				int temp1=size[i];
				size[i]=size[j];
				size[j]=temp1;
			}
			}
		}
		
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+" ");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Strings(comma) : ");
		String str=in.nextLine();
		
		sortStringLength(str);		
		
		in.close();

	}	

}
