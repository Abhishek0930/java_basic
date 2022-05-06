package main;

public class MultiThreadingByClassCall implements Runnable{
	public void run(){  
		System.out.println("thread");  
		}  
		  
		public static void main(String args[]){  
			MultiThreadingByClassCall m1=new MultiThreadingByClassCall();  
		Thread t1 =new Thread(m1); 
		t1.start();  
		 }  
	
	

}
