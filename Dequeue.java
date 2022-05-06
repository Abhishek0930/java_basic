package main;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Deque<Integer> deque = new LinkedList<Integer>();
		 deque.addFirst(10);
		 deque.addFirst(20);
		 deque.addLast(11);
		 deque.addLast(41);
		 deque.add(50);//addlast
		 deque.removeFirst(); //remove
		 System.out.println(deque);

	}

}
