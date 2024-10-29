package additionalProblems;

import java.util.*;

public class Billing {
	
	public static void billing(String price,String discount) {
		
		String[] prices=price.split(",");
		int[] Aprices=new int[prices.length];
		for(int i=0;i<prices.length;i++) {
			Aprices[i]=Integer.parseInt(prices[i]);
		}
		
		String[] discounts=discount.split(",");
		int[] Adiscounts=new int[discounts.length];
		for(int i=0;i<prices.length;i++) {
			Adiscounts[i]=Integer.parseInt(discounts[i]);
		}	
		
		if(Aprices.length!=Adiscounts.length) {
			System.out.println("end");
		}
		float total=0;
		for(int i=0;i<Aprices.length;i++) {
			float temp=(Aprices[i]*Adiscounts[i])/100;
			total=total+(Aprices[i]-temp);
		}
		System.out.println("Total: "+total);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the prices (comma): ");
		String price=in.nextLine();
		System.out.println("Enter the discounts (comma): ");
		String discount=in.nextLine();
		
		billing(price,discount);
		in.close();
		
	}

}
