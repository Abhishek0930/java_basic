package main;

import java.util.Iterator;


public class PriorityQueue {

	public static void main(String[] args) {
java.util.PriorityQueue<String> queue = new java.util.PriorityQueue<String>();  
		
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
		
		System.out.println(queue);
//		System.out.println("starting iteration");
//		Iterator<String> itr=queue.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}
		
		
		//will give you an null pointer exception if queue is empty
		queue.remove();  
		
		//will give you an null if queue is empty
		queue.poll();  

		System.out.println(queue);
//		
//		//on iterating all will be rearrange on their priority basis
//		System.out.println("starting iteration");
//		Iterator<String> itr2=queue.iterator();  
//		while(itr2.hasNext()){  
//		System.out.println(itr2.next());  
//		}  
//		
		
java.util.PriorityQueue<Integer> queue01=new java.util.PriorityQueue<Integer>();  
		
		queue01.add(7);  
		queue01.add(40);  
		queue01.add(123);  
		queue01.add(4577);  
		queue01.add(16);  
		queue01.add(11);  
		queue01.add(112);  
		queue01.add(210);  
		queue01.add(148);  
		queue01.add(145);  
		
		//will give you an null pointer exception if queue is empty
		System.out.println(queue01.element());  
		
		//will give you an null if queue is empty
		System.out.println(queue01.peek());  
		System.out.println(queue01);
		
		
		
//		System.out.println("starting iteration");
//		Iterator<Integer> itr3=queue01.iterator();  
//		while(itr3.hasNext()){  
//		System.out.println(itr3.next());  
//		}
		
		
		//will give you an null pointer exception if queue is empty
		queue01.remove();  
		
		//will give you an null if queue is empty
		queue01.poll();  

		System.out.println(queue01);
		
//		//on iterating all will be rearrange on their priority basis
//		System.out.println("starting iteration");
//		Iterator<Integer> itr4=queue01.iterator();  
//		while(itr4.hasNext()){  
//		System.out.println(itr4.next());  
//		}  
		
		
	}

}
