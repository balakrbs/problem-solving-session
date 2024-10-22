package day2;

import java.util.*;

public class Arraycompatible {
	
public static int compatible(int n1, int[] arr1,int n2, int[] arr2) {
        
        if(n1!=n2)
        {
            return -1;
        }
        
        for(int i=0;i<n1;i++){
            if(arr1[i]!=arr2[i]){
                return -1;
            }
        }
        return 0;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=in.nextInt();
        }
        
        int n2=in.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr2[i]=in.nextInt();
        }
        int result=compatible(n1, arr1, n2, arr2);

        if(result==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        in.close();
	}

}
