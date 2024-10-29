package day4;

import java.util.*;

public class TitleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		String text=in.nextLine();
		
		String newtext=titleCase(text);
		System.out.println(newtext);
		
		in.close();

	}

	private static String titleCase(String text) {
		// TODO Auto-generated method stub
		
		String[] words=text.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String temp=words[i];
			words[i]=Character.toUpperCase(temp.charAt(0))+temp.substring(1).toLowerCase();			
		}
		
		return String.join(" ", words);		
		
	}

}
