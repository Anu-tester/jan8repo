package com.e2eproject.collection;

import org.testng.annotations.Test;

public class largestnumber {

	
	@Test
	public void largestnumber() {
		
		int number[]= {1,2,3,4,5,6,-1,-45,64647};
		int largest=number[0];
		int small=number[0];
		for(int i=1;i<number.length;i++) {
			if (number[i]>largest) {
				largest=number[i];
			}
			else if(number[i]<small){
				small=number[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(small);
	}
}
