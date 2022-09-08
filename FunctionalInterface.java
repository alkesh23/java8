package com.bct.java8features.functional.interfaces;

import java.util.function.IntBinaryOperator;

interface MyInterface{
	default void newMethod() {
		System.out.println("Newly added default method.");
	}
}

class Example implements MyInterface{
	public void existingMethod(String str) {
		System.out.println("String is : "+ str);
	}
}
interface MyFunctionalInterface{
	
	public int addMethod(int a, int b);
	
}
public class FunctionalInterface {

	public static void main(String[] args) {
		MyFunctionalInterface sum=(a,b)-> a+b;
		System.out.println("Result= "+ sum.addMethod(12,100));
		
		System.out.println("---Printed----");
		IntBinaryOperator add=(a,b)-> a+b;
		System.out.println("Result = "+ add.applyAsInt(12,100));
		
		Example instance= new Example();
		instance.newMethod();
		instance.existingMethod("Java 8 is easy to learn");
	}

}
