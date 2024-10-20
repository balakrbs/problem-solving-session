package day4;

import java.util.*;

public class StringPermutations {
	
	public static void permutations(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			String res=str.substring(0,i)+str.substring(i+1);
			
			permutations(res, ch+ans);			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		
		permutations(str,"");
		in.close();

	}

}
