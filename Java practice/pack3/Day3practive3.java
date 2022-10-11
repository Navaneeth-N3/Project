package com.pack3;

public class Day3practive3 {
	public static void main(String[] args) {
		int i= 45;
		int j = ( ++i + i++ );// 
						//  46  + 46
		System.out.println(j);
		System.out.println(i);// i value will still remain 45
	}
	

}
