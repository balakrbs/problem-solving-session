package additionalProblems;

import java.util.*;

public class StringFrequency {
	
	public static void stringFrequency(String text) {
		char[] text1=new char[text.length()];
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<text.length();i++) {
			text1[i]=text.charAt(i);
		}
		Arrays.sort(text1);
		
		for(char c:text1) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}

		map.forEach((i,j)->{
			System.out.println(i+" "+j);
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		String text=in.nextLine();
		
		stringFrequency(text);
		
		in.close();

	}

}
