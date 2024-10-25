package day7;

import java.util.*;

public class StackPostfix {

	private static void postFix(Stack<Integer> stk,String str) {
		String[] tokens=str.split(" ");
		
		for(String token:tokens) {
			
			if(Character.isDigit(token.charAt(0))) 
			{
				stk.push(Integer.parseInt(token));				
			}else{
				int num2=stk.pop();
				int num1=stk.pop();
				int result=0;
				switch (token.charAt(0)) 
				{
				case '+': result=num1+num2;
				break;
				case '-': result=num1-num2;
				break;
				case '*': result=num1*num2;
				break;
				case '/': result=num1/num2;
				break;
				}
				stk.push(result);
			}
		}
		System.out.println("The Result : "+stk.pop());
	}
	

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);		
		Stack<Integer> stk=new Stack<>();
		System.out.println("Enter the Expression : ");
		String str=in.nextLine();		
		postFix(stk,str);
		in.close();

	}

}
