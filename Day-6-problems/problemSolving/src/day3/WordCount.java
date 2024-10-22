package day3;

import java.util.*;

public class WordCount {
	
	public static int wordCount(String line) {
		
		String[] words=line.split(" ");
		
		return words.length;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		String line=in.nextLine();
		
		int count=wordCount(line);
		
		System.out.println(count);
		
		in.close();		

	}

}
