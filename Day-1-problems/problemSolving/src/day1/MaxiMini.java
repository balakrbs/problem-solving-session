package day1;

import java.util.*;

public class MaxiMini {
	
	public static void maxMin(int[] array,int size) {
        int max=0, min=array[0];
        for(int i=0;i<size;i++)
        {
              if(array[i] > max) {
                max = array[i]; 
              }
              if(array[i] < min) {
                min = array[i]; 
              }
        }
        System.out.println("The maximum number "+max);
        System.out.println("The minimum number "+min);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
        System.out.print("Give size: ");
        int size=in.nextInt();
        
        int[] array=new int[size];
        System.out.print("Enter the numbers: ");
        
        for(int i=0;i<size;i++){
            array[i]=in.nextInt();
        }
        maxMin(array,size);
        in.close();

	}

}
