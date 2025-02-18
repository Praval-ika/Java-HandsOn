package com.celcom.practice_17_02;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Task{
	
	private String task;
	private String status;
	
	Task(String task){
		this.task = task;
		this.status = "Incomplete";
	}
	
	static List<Task> taskList = new ArrayList<>();
	
	public static void display() {
		for(Task t : taskList) {
			System.out.println("The task is: "+t.task+" and status is: "+t.status);
		}
	}
	
	public static void completion(String s) {
		for(Task t:taskList) {
			if(t.task.equals(s)) {
				t.status = "Completed";
			}
		}
	}
	
	public static void delete(String s) {
		int index = -1;
		for(Task t:taskList) {
			if(t.task.contentEquals(s)) {
				index = taskList.indexOf(t);
				
			}
		}
		taskList.remove(taskList.get(index));
	}
	
	public static boolean search(String s) {
		for(Task t : taskList) {
			if(t.task.contentEquals(s)) {
				return true;
			}
		}
		return false;
	}
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
		System.out.println("1. Add a new task. ");
		System.out.println("2. View all tasks");
		System.out.println("3. Mark a task as completed");
		System.out.println("4. Delete a task");
		System.out.println("5. Search for tasks");
		System.out.println("6. Quit");
		
		System.out.println("Enter the choice: ");
		ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the task name: ");
	        Task t1 = new Task(sc.next());
	        Task.taskList.add(t1);
			System.out.println("Added Successfully..");
			System.out.println();
			break;
		case 2:
			Task.display();
			break;
		case 3:
			System.out.println("Enter the task to be marked as completed: ");
			String s3 = sc.next();
			Task.completion(s3);
			
			break;
		case 4:
			System.out.println("Enter the task to be deleted: ");
			String s4 = sc.next();
			Task.delete(s4);
			
			break;
		case 5:
			System.out.println("Enter the task to be searched: ");
			String s5 = sc.next();
			if(Task.search(s5))
				System.out.println("Task found");
			else
				System.out.println("Task not found");
			break;
		}
		
		}while(ch!=6);
		sc.close();

	}

}
