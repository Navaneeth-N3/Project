package com.pack3;

public class B {
	int i;

	@Override
	public String toString() {

		return "i = " + i;
	}

	@Override
	public int hashCode() {

		return Integer.toString(i).hashCode();//hashCode from string class
	}

	@Override
	public boolean equals(Object obj) {
		
		return this.i == ((B)obj).i;//downcast
	}

	// override toString hashCode equals and see the difference

	public static void main(String[] args) {
		B rv = new B();
		System.out.println(rv);
		System.out.println(rv.hashCode());
		rv.i = 20;
		System.out.println(rv);
		System.out.println(rv.hashCode());

		System.out.println("=========");

		B rv1 = new B();
		System.out.println(rv1);
		System.out.println(rv1.hashCode());
		System.out.println(rv.equals(rv1));
		rv1.i = 20;
		System.out.println(rv1);
		System.out.println(rv1.hashCode());
		System.out.println(rv.equals(rv1));

	}

}
