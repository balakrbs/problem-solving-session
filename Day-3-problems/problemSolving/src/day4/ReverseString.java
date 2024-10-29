package day4;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		String text=in.nextLine();
		for(int i=0;i<text.length();i++) {
			System.out.print(text.charAt(text.length()-i-1));
		}
		in.close();
		
	}

}
