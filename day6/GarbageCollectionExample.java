package com.celcom.day6;

public class GarbageCollectionExample {

	static int count;
	
	GarbageCollectionExample(){
		count++;
		System.out.println(count);
	}
	
	@Override
	protected void finalize(){
		count--;
		System.out.println(count);
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionExample obj1 = new GarbageCollectionExample();
		GarbageCollectionExample obj2 = new GarbageCollectionExample();
		
		obj1 = null;
		System.gc();
		obj2 = null;
		Runtime.getRuntime().gc();

	}

}
