package com.controller;

public class InterruptDemo implements Runnable{

	
	
	@Override
	public void run() {
		while(true){
			if(Thread.currentThread().isInterrupted()){
				System.out.println("我被打断过");
			}else{
				System.out.println("我没有被打断");
			}
		}
		
	}
	
	public void test(){
		notifyAll();
	}
	
	public void notifyA() throws InterruptedException{
		wait();
	}
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new InterruptDemo(),"threadName");
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
		System.out.println("main end");
		
	}

}
