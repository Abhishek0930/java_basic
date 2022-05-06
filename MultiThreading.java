package main;

public class MultiThreading extends Thread{
	public void run(){  
		System.out.println("run method will run by default");  
		} 
	public void runs(){  
		System.out.println("this will not work by default");  
		} 
		public static void main(String args[]){  
		MultiThreading t1=new MultiThreading();  
		t1.start();  
		t1.runs();
		

		Thread t= new Thread("thread by creating object of thread class");
		t.start();  
		String str = t.getName();  
		System.out.println(str);
		}  

}
