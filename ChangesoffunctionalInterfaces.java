package com.bct.java8features.functional.interfaces;

interface DefaultAndAbstract{
	default void print() {
		System.out.println("Another Example of default method in interface");
		System.out.println("interface is mainly developed to obtain 100% abstraction");
	}
	public void myMethod(String message);
	
	
}
public class ChangesoffunctionalInterfaces implements DefaultAndAbstract {
	public void myMethod(String message) {
		System.out.println("Message is : "+ message);
	}

	public static void main(String[] args) {
		ChangesoffunctionalInterfaces instance=new ChangesoffunctionalInterfaces();
		instance.print();
		instance.myMethod("--------------------------------");

	}

}
