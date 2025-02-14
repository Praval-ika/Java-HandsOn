package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	private int esalary;
	transient public int eid;
	private String ename;
	public Employee(int esalary, int eid, String ename) {
		super();
		this.esalary = esalary;
		this.eid = eid;
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [esalary=" + esalary + ", eid=" + eid + ", ename=" + ename + "]";
	}
	
}

public class Serialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee pravalika = new Employee(15000,001,"pravalika");
		
		//serialization
		FileOutputStream fout = new FileOutputStream("D://ObjectFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(pravalika);
		objout.close();
		fout.close();
		System.out.println("Object saved");
		
		//Deserialization
		FileInputStream fin = new FileInputStream("D://ObjectFile.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp = (Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println(emp);
		
	}

}
