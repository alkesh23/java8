package com.bct.java8features.methodreferences;

import java.util.function.BiFunction;

interface MyInterface{
	public void display();
	
}


class Addition{
	static int add(int a, int b) {
		return a+b;
	}
}
public class Student {
	/*
	 * Method reference is the short hand notation of lambda expression to call a method.
	 * 
	 * str ->System.out.println(str);
	 * 
	 */
	public void myMethod() {
		System.out.println("Instance method");
		System.out.println("-------------I have been referred by the abstract------------");
	}
	public static void main(String[] args) {
		//create an object
		Student object=new Student();
		
		//
		MyInterface ref=object::myMethod;
		ref.display();
		
		BiFunction<Integer, Integer, Integer> addition=Addition::add;
		int sum=addition.apply(11565,76897);
		System.out.println("Addition of number is : "+ sum);
		
	}

}
