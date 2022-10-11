package com.pack3;

public class Day3Datatype17 {
	public static void main(String[] args) {
		int i=32;
		int j=++i +i;
		//     33+33
		
		System.out.println("After assignment j="+j);//prints 66
		System.out.println("After increment	Value of i="+i);// prints 33
		
		int k=--i +i;
		//      32+32
		System.out.println("After assignment k="+k);//prints 64
		System.out.println("After decrement value of i="+i);// prints 32
	}

}
