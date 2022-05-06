package main;

public class MultiDirectcallRun extends Thread{
	
	 public void run(){  
		 
		 
		// this is the sleep method that will make the program to sleep
		
		 for(int i=1;i<5;i++){  
		    try{
		    	Thread.sleep(1500);	
		    }
		    
		    catch(InterruptedException e){
		    	System.out.println(e);
		    }  
		    
		    
		   //sleep will always be + or exception will come
		    
		    
		    System.out.println(i);  
		  }  
		 
		 
		 }  
		 public static void main(String args[]){  
			 MultiDirectcallRun t1=new MultiDirectcallRun();  
			 MultiDirectcallRun t2=new MultiDirectcallRun();  
		   
		  t1.start();  
		  t2.start();  
		  //if we write start then other thread will start on sleep of one thread
//		  
		  t1.run();
		  t2.run();
//		 
		 
		  //run will call here with a single call stack no matter how many threads are there..
		 
		  
		  //this is for get and set name
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName()); 
		  
		  t1.setName("abhishek khullar");  
		  System.out.println("After changing name of t1:"+t1.getName());
		 }  


}
