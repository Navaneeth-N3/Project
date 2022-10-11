package com.pack4;

public class E {
	//array we can create for primitive and non primitive classsess
	// Derived array
		public static void main(String[] args) {
			String[] days = {"sunday", "monday", "tuesday"};
			System.out.println(days[0]);//toString is getting called
			System.out.println(days[1].toString());
			System.out.println("==========");
			for(String s : days)
			{
				System.out.println(s.toString());
			}

		}

}
