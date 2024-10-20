package day2;

import java.util.*;

public class Permutations {
	public static boolean permutations(int[] arr1, int n1, int[] arr2, int n2) {
		// TODO Auto-generated method stub
		
		if(n1!=n2) {
			return false;
		}
		
		Map<Integer,Integer> map1=new HashMap<>();
		Map<Integer,Integer> map2=new HashMap<>();
		for(int i=0,j=0;i<n1 && j<n2;i++,j++) {
			map1.put(arr1[i], map1.getOrDefault(arr1[i], 0)+1);
			map2.put(arr2[j], map2.getOrDefault(arr2[j], 0)+1);
		}
		
		boolean r=map1.equals(map2);
		return r;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("array1 : ");
		int n1=in.nextInt();
		int[] arr1=new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i]=in.nextInt();
		}
		
		System.out.println("array2 : ");
		int n2=in.nextInt();
		int[] arr2=new int[n2];
		for(int i=0;i<n2;i++) {
			arr2[i]=in.nextInt();
		}
		
		boolean result=permutations(arr1,n1,arr2,n2);
		if(result) {
			System.out.println("The Arrays are permutations");
		}else {
			System.out.println("The Arrays not are permutations");
		}
		in.close();

	}

}
