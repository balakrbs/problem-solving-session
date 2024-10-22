package day1;

import java.util.*;

public class EvenNumbers {

		 public static void evenNumbers(int range){
		        
		        for(int i=1;i<range;i++)
		        {
		            if(i%2==0){
		                System.out.print(i+" ");
		            }
		        }
		    }
		    
			public static void main(String[] args) {
				// TODO Auto-generated method stub	
		        Scanner in=new Scanner(System.in);
		        System.out.print("Give Range to number: ");
		        int range=in.nextInt();
		        
		        evenNumbers(range);
		        in.close();
		    }
		}