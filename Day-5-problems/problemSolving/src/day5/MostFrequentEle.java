package day5;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MostFrequentEle {
	
	private static int mostFrequentElement(int[] arr, int n) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		AtomicInteger count = new AtomicInteger(0);
		Map<Integer,Integer> map=new LinkedHashMap<>();
		
		for(int i:arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		map.forEach((i,j)->{
			if(j>1) {
				count.incrementAndGet();
			}
		});
		
		return count.get();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=in.nextInt();
		}
		
		int count=mostFrequentElement(arr,n);
		System.out.println("FrequentElement : "+count);
		
		in.close();

	}	

}
