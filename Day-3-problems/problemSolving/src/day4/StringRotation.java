package day4;

import java.util.*;

public class StringRotation {
	
	public static boolean checkRotation(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		String concatenated=str1+str2;
		
		return concatenated.contains(str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		String str1=in.nextLine();
		String str2=in.nextLine();
		
		if(checkRotation(str1,str2)) {
			System.out.println(str2+" is rotation of "+str1);
		}else {
			System.out.println(str2+" is not rotation of "+str1);
		}
		
		in.close();

	}

}
