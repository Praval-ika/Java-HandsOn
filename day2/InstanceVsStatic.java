package com.celcom.day2;

public class InstanceVsStatic {

			int a = 10;
			static int b = 20;
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				InstanceVsStatic obj1 = new InstanceVsStatic();
				InstanceVsStatic obj2 = new InstanceVsStatic();
				
				System.out.println(obj1.a);
				System.out.println(obj2.a);
				
				obj1.a = 20;
				System.out.println(obj1.a);
				System.out.println(obj2.a);
				
				//InstanceVsStatic s1 = new InstanceVsStatic();
				//InstanceVsStatic s2 = new InstanceVsStatic();
				
				System.out.println(InstanceVsStatic.b);
				System.out.println(InstanceVsStatic.b);
				
				InstanceVsStatic.b = 50;
				
				System.out.println(InstanceVsStatic.b);
				System.out.println(InstanceVsStatic.b);
				

			}

		}
