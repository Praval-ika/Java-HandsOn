package com.celcom.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		//list.add("Java");
		list.add(10);
		
		System.out.println(list);
		System.out.println(list.get(0));
		list.add(1,15);
		System.out.println(list);
		list.set(1,150);
		System.out.println(list);
		list.remove(new Integer(10));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(10));
		System.out.println(list.isEmpty());
		
		//way-1
		for(int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		//way - 2
		for(Integer i : list)
		{
			System.out.println(i);
		}
		System.out.println();
		//way - 3
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
