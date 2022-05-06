package main;

import java.util.*;

public class Queues {
	public static void main(String args[]){  
		
		//since it is a interface so we needs a class which extends this in order to create objects
		Queue<String> queue=new LinkedList<String>();  
		
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		queue.add("Abhishek");  
		queue.add("Ravi");  
		queue.add("zaid");  
		queue.add("Raghav");  
		queue.add("Siddharth");  
		
		//will give you an null pointer exception if queue is empty
		System.out.println(queue.element());  
		
		//will give you an null if queue is empty
		System.out.println(queue.peek());  
		
		System.out.println("starting iteration");
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		
		//will give you an null pointer exception if queue is empty
		queue.remove();  
		
		//will give you an null if queue is empty
		queue.poll();  
		
		
		//on iterating all will be rearrange on their priority basis
		System.out.println("starting iteration");
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		
		}  
	
}
