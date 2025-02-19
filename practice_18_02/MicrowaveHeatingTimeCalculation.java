package com.celcom.practice_18_02;

import java.util.Scanner;

class TimeCalculation{
	float totalTime;
	int count;
	int time;
	String type;
	String model;
	
	TimeCalculation(int count,int time,String type,String model){
		this.count = count;
		this.time = time;
		this.type = type;
		this.model = model;
		totalTime = time;
	}
	
	public boolean countBasedTime() {
		if(count == 1) {
			totalTime+=time;
		}
		else if(count==2) {
			totalTime+=(time*0.5);
		}
		else if(count==3) {
			totalTime+=(time*2);
		}
		else {
			System.out.println("Items Exceeded/Invalid count..");
			return false;
		}
		return true;
	}
	
	public boolean foodTypeBasedHeat() {
		if(type.equalsIgnoreCase("pasta")) {
			totalTime+=(time*0.1);
		}
		else if(type.equalsIgnoreCase("frozen meal")) {
			totalTime+=(time*0.2);
		}
		else if(type.equalsIgnoreCase("vegetables")) {
			totalTime+=(time);
		}
		else {
			System.out.println("Invalid food type");
			return false;
		}
		return true;
	}
	
	public void modelBasedHeat() {
		if(model.equalsIgnoreCase("high")) {
			totalTime+=(time);
		}
		else if(model.equalsIgnoreCase("medium")) {
			totalTime-=(time/10);
		}
		else if(model.equalsIgnoreCase("low")) {
			totalTime+=(time*(3/20));
		}
	}
	
}

public class MicrowaveHeatingTimeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of items: ");
		int itemCount = sc.nextInt();
		
		System.out.println("Enter the heating time for one item (in seconds): ");
		int time = sc.nextInt();
		
		System.out.println("Enter the type of food (e.g., pasta, frozen meal, vegetables): ");
		String foodType = sc.next();
		
		System.out.println("Enter the microwave model (high, medium, low): ");
		String model = sc.next();
		
		if(time<=0) {
			System.out.println("Invalid time..");
			return ;
		}
		
		TimeCalculation obj = new TimeCalculation(itemCount,time,foodType,model);
		if(! obj.countBasedTime()) {
			return;
		}
		
		if(! obj.foodTypeBasedHeat()) {
			return;
		}
		
		obj.modelBasedHeat();
		System.out.println("The recommended heating time is: "+obj.totalTime);
	}

}
