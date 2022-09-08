package com.bct.java8features.methodreferences;
@FunctionalInterface
interface ConstructorInterface{
	Hello display(String say);
}
class Hello{
	Hello(String say) {
		System.out.println("Good Morning guyss...!!"+say);
		
	}
}
public class Constructormethodreference {

	public static void main(String[] args) {
		ConstructorInterface ref=Hello::new;
		ref.display("How are you doing...!!");
		

	}

}
