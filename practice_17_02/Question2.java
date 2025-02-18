package com.celcom.practice_17_02;

import java.util.Scanner;

class Buffer{
	private String bufferArray[] = new String[10];
	static int index;
	
	public void setBuffer(String value) {
		bufferArray[index++] = value;
		System.out.println("The value added is "+value);
	}
	
	public void removeBuffer() {
		while(index!=0) {
			bufferArray[--index] = null;
		}
		System.out.println("The values are removed.");
	}
	public String getBuffer() {
		return bufferArray[index-1];
	}
	
	public void display() {
		for(String i:bufferArray) {
			System.out.println(i);
		}
	
}
}

class Consumer extends Thread{
	Buffer buffer;
	
	Consumer(Buffer buffer){
		this.buffer = buffer;
	}
	
	public void run() {
		synchronized(buffer) {
			try {
				System.out.println("Consumer is ready to process the buffer...");
				buffer.wait();
			}
			catch(InterruptedException e) {
			}
			System.out.println("Consumer starting it's process.");
			System.out.println("The last buffer string value: "+buffer.getBuffer());
			buffer.display();
			buffer.removeBuffer();
		}
	}
}

class Producer extends Thread{
	Buffer buffer;
	
	Producer(Buffer buffer){
		this.buffer = buffer;
	}
	
	public void run() {
		synchronized(buffer) {
				System.out.println("The producer is raedy to produce...");
				Scanner sc = new Scanner(System.in);
				
				while(true){
					System.out.println("1. To produce:");
					System.out.println("2. To consume.");
					int ch = sc.nextInt();
					switch(ch) {
					case 1:
						if(Buffer.index<=10) {
						System.out.println("Enter the string value: ");
						String s = sc.next();
					    buffer.setBuffer(s);
						}
						else
						{
							System.out.println("Buffer is full");
							buffer.notify();
	                    }
						break;
					case 2:
						buffer.notify();
						return;
						//break;
					}
				}
		}
	}
}

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Buffer buffer = new Buffer();
		
		Consumer consumer = new Consumer(buffer);
		consumer.start();
		
		Thread.sleep(1000);
		
		Producer producer = new Producer(buffer);
		producer.start();
	}
}

