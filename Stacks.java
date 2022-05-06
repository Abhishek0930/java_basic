package main;

import java.util.Stack;

public class Stacks {
	public static void main(String args[]){ 
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(10);
		stack.add(40);  
		stack.add(123);  
		stack.add(4577);  
		stack.add(16);  
		stack.push(11);  
		stack.push(112);  
		stack.push(210);  
		stack.push(148);  
		stack.push(145);
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		stack.pop();
		stack.pop();
		
		System.out.println(stack);
		System.out.println(stack.empty());		
		
		System.out.println(stack.search(10));
		
		System.out.println(stack.capacity());
	
		System.out.println(stack.contains(10));
		
		System.out.println(stack.get(2));
		
		
		Stack<OwnTypeCastingClass> stackemployee = new Stack<OwnTypeCastingClass>();
		
		OwnTypeCastingClass a = new OwnTypeCastingClass(1,"abhi",95555,"delhi");
		OwnTypeCastingClass b = new OwnTypeCastingClass(1,"rohan",958657,"delhi");
		OwnTypeCastingClass c = new OwnTypeCastingClass(1,"abhinav",92457,"gurgaon");
		OwnTypeCastingClass d = new OwnTypeCastingClass(1,"siddharth",8957,"noida");
		
		stackemployee.push(a);
		stackemployee.push(b);
		stackemployee.push(c);
		stackemployee.push(d);
		
		
		for(OwnTypeCastingClass i: stackemployee) {
	    	  System.out.println(i.id + " " + i.name + " " + i.address + " " + i.phNo);
	      }
	}
}
