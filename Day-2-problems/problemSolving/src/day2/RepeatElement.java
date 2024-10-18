package day2;

import java.util.*;

public class RepeatElement {
	
	public static int repeatelements(int[] array, int size) {
		if(size==0||size==1) {
			return size;
		}
		
		int j=0;		
		for(int i=0;i<size-1;i++) 
		{
			if(array[i]==array[i+1])
			{
				array[j++]=array[i];
			}
		}		
//		array[j++]=array[size-1];
		
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		
		int[] array=new int[size];
		
		for(int i=0;i<size;i++) {
			array[i]=in.nextInt();
		}
		Arrays.sort(array);
		int newlength=repeatelements(array,size);
		
		for(int i=0;i<newlength;i++) {
			System.out.print(array[i]+" ");
		}
		in.close();

	}

}
