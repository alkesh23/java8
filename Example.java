package com.bct.java8features.methodreferences;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray= {
				"Alkesh","Pandey","Java","Programming","Java8","Method","Reference"
		};
		
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for(String data:stringArray) {
			System.out.println(data);
		}
	}

}
