package additionalProblems;

import java.util.*;

public class RepeatElement {
	
	public static void repeatElement(int[] arr,int n) {
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i:arr) {
			map.put(i,map.getOrDefault(i, 0)+1);
		}
		System.out.println();
		
		map.forEach((k,j)->{
			if(j!=1) {
				System.out.print(k+" ");
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		
		repeatElement(arr, n);
		in.close();
	}

}
