package com.e2eproject.collection;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class duplicateelement {

	
	@Test
	public void duplicateleemnts() {
		String names[]= {"java","Oracle","VB","Maven","java","Maven"};
		Set<String> store=new HashSet<String>();
		
		for(String name:names) {
			
			if(store.add(name)==false) {
				System.out.println(name);
			}
		}
		
		
	}
}
