package com.pack3;

public class Day3Unaryoperator {
	public static void main(String[] args) {
		int i=32;
		System.out.println(i++);// prints 32
		System.out.println("After increment"+i);// prints 33 after incrments by1;
		/*Post increment/Decrement does 2 things
		1. use the uncahnged value
		2.Increase/Decrease value by 1
		*/
		System.out.println(i--);// prints 33 and decrements	by 1 after printing
		System.out.println("After decrement"+i);
		
	}

}
