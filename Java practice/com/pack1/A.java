package com.pack1;//first statement in java

public class A {

	private int i;
	int j;//default
	protected int k;
	public int l;
	
	private void test1()
	{
		System.out.println("private : from test1");
	}
	void test2()//default
	{
		System.out.println("default : from test2");
	}
	protected void test3()
	{
		System.out.println("proctected of A test3()");
	}
	public void test4()
	{
		System.out.println("public of A test4()");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main begin");
		A rv = new A();
		System.out.println(rv.i);
		System.out.println(rv.j);
		System.out.println(rv.k);
		System.out.println(rv.l);
		System.out.println("========");
		rv.test1();
		rv.test2();
		rv.test3();
		rv.test4();
		
	}

}

class D{//only one public class in java
	//public class with A only
	public static void main(String[] args) {
		System.out.println("main begin");
		A rv = new A();
		//System.out.println(rv.i);//private members u cannot access outside the class
		System.out.println(rv.j);
		System.out.println(rv.k);
		System.out.println(rv.l);
		System.out.println("========");
		//rv.test1();//private members u cannot access outside the class
		rv.test2();
		rv.test3();
		rv.test4();	
		
	}
	
	
}
