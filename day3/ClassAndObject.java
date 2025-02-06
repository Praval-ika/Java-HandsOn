package com.celcom.day3;

class Mobile{
	String Mname;
	String Mmodel;
	double Mprice;
	
	Mobile(String Mname, String Mmodel,double Mprice)
	{
		this.Mname = Mname;
		this.Mmodel = Mmodel;
		this.Mprice = Mprice;
	}
	
	void setPrice(double price)
	{
		Mprice = price;
	}
	
	void display()
	{
		System.out.println("The mobile name: "+Mname);
		System.out.println("The mobile model: "+Mmodel);
		System.out.println("The mobile price: "+Mprice);
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile("Samsung","S25 Ultra",130000.0);
		m.display();
		m.setPrice(110000.0);
        m.display();
	}

}
