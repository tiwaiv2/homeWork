package jdk;

import java.util.Arrays;
import java.util.BitSet;

public class FindNumberBetween1to100 {
	
	public static void main(String[] args) {
		int count =100;
		
		int formula= count*((count+1)/2);
		int sum=0;
		while(count!=0){
			sum=sum+count;
			count--;
		}
		
		int dif= formula-sum;
		System.out.println(dif);
		
		BitSet bitSet = new BitSet(count);
		
		while(count!=0){
			bitSet.set(count-1);
			count--;
		}
 
        System.out.printf("Missing numbers in integer array"+ bitSet);
        
	}

}
