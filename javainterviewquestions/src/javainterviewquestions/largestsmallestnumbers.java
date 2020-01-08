package javainterviewquestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class largestsmallestnumbers {

	
	public static void main(String[] args) {
		int numbers[]= {1,3,6,775,343,-1,0,23434,-10};
		
		int largest=numbers[0];
		int smallest =numbers[0];
		
		for(int k=1;k<numbers.length;k++) {
			
			if(numbers[k]>largest) {
				largest=numbers[k];
			}else if(numbers[k]<smallest) {
				smallest=numbers[k];
			}
			
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println("Largest number in array"+largest);
		System.out.println("smallest number in array"+ smallest);
	}
}
