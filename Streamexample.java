package com.bct.java8features.streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class Streamexample {

	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		
		names.add("Alkesh");
		names.add("Pandey");
		names.add("best");
		names.add("hai");
		
		int count=0;
		for (String ele : names) {
			if(ele.length()< 6)
				count++;
		}
			System.out.println("There are : "+ count + " Strings with length less than 6");
		int number=(int) names.stream().filter(ele -> ele.length()<6).count();
		System.out.println("There are : "+ number +"String with less than 6");
		}
		

	}


