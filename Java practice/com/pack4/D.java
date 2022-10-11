package com.pack4;

import java.util.Arrays;//we need to import this no need to import string

public class D {
	
	// final array
		public static void main(String[] args) {
			 final int[] arr = new int[2];
			
			System.out.println(Arrays.toString(arr));
			arr[0] = 30;
			arr[1] = 40;
			System.out.println(Arrays.toString(arr));
			
			//arr = new int[2];
			
			System.out.println(Arrays.toString(arr));

		}

}
