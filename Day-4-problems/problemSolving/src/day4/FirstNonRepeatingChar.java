package day4;

import java.util.*;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		String text=in.nextLine();
		
		findChar(text);
		
		in.close();

	}

	public static void findChar(String text) {
		// TODO Auto-generated method stub
		int n=text.length();
		
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<n;i++) {
			map.put(text.charAt(i),map.getOrDefault(text.charAt(i), 0)+1);
		}
		
		for(int i=0;i<n;i++) {
			if(map.get(text.charAt(i))==1) {
				System.out.println(text.charAt(i));
				break;
			}
		}
		
		System.out.println(map);
	}

}
