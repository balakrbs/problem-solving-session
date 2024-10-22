package day1;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
        String text=in.nextLine();
        int size=text.length();
        in.close();
        for(int i=0;i<size;i++){
            System.out.print(text.charAt(text.length()-i-1));
        }

	}

}
