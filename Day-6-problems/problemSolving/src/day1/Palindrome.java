package day1;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
        String text=in.nextLine();
        String reverseText="";
        int size=text.length();
        
        for(int i=size-1;i>=0;i--){
            reverseText=reverseText+text.charAt(i);
        }
        in.close();
        if(text.equals(reverseText)){
            System.out.println("its palindrome");
        }else{
            System.out.println("its not palindrome");
        }

	}

}
