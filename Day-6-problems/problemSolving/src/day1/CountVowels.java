package day1;

import java.util.*;

public class CountVowels {
	
	public static void countChar(String text){
        int vowel=0,consonants=0;
        int size=text.length();
        for(int i=0;i<size;i++){
            if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u'){
                vowel++;
            }else{
                consonants++;
            }
        }
        
        System.out.println("Vowel : "+vowel);
        System.out.println("consonants : "+consonants);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
        String text=in.nextLine();
        
        countChar(text);
        in.close();

	}

}
