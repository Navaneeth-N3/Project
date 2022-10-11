package com.pack2; //pojo classes


class G
{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	



	}
public class Tester1 {

	public static void main(String[] args) {
		G rv = new G();
		//rv.i =20; //outside the class not accessible private
		System.out.println(rv.getI());
		rv.setI(90);//through get method we can access
		System.out.println(rv.getI());
		
		Person rv1 = new Person();
		rv1.setfName("Nav");
		rv1.setGender("Male");
		System.out.println(rv1.getfName());
		System.out.println(rv1.getGender());

	}

}
