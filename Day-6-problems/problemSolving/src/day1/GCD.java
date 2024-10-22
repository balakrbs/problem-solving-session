package day1;

import java.util.*;

public class GCD {

	public static int findGCD(int numOne,int numTwo){
        int GCD=1;
        for(int i=1;i<numOne && i<numTwo;i++){
            if(numOne%i==0 && numTwo%i==0){
                GCD=i;
            }
        }
        return GCD;
    }
    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        System.out.print("Give the First Number: ");
        int numOne=in.nextInt();
        System.out.print("Give the Two Number: ");
        int numTwo=in.nextInt();
        in.close();
        System.out.print("The GCD of the given numbers : "+findGCD(numOne,numTwo));
    }
}
