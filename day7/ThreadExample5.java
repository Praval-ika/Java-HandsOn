package com.celcom.day7;

class TwoTable extends Thread{
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.out.println(i+" * 2 = "+(i*2));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
                 
			}
		}
	}
}

class FiveTable implements Runnable{
	public synchronized void run() {
		for(int i = 1;i<=10;i++) {
			System.err.println(i+" * 5 = "+(i*5));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
                 
			}
		}
	}
	
}

public class ThreadExample5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TwoTable two = new TwoTable();
		
		Thread five = new Thread(new FiveTable());
		
		two.start();
		
		two.join();
		
		five.start();

	}

}
