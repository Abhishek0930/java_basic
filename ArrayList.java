package main;


import java.util.LinkedList;
import java.util.*;

import java.util.Collections;

public class ArrayList {

	 public static void main(String args[]){  
		  LinkedList<String> list=new LinkedList<String>();
				  
		  
		  	  list.add("Mango");    
		      list.add("Apple");    
		      list.add("Banana");    
		      list.add("Grapes");    
		      list.add("Mango");    
		      list.add("Apple");    
		      list.add("Banana");    
		      list.add("Grapes");    
		      
		      System.out.println(list);
		      
		      
		      //removing elements from list
		      
		      list.remove(0);
		      list.remove("Banana");
		      
		      System.out.println(list);
		      
		      list.removeFirst();
		      System.out.println(list);
		      
		      list.set(0, "hello");
		      System.out.println(list);
		      
		      
		      //normal iterator
		      Iterator<String> itr = list.iterator();
		      
		      while(itr.hasNext()) {
		    	  System.out.println(itr.next());
		      }
		      
		      //reversing manner iterator
		      Iterator<String> itrdec = list.descendingIterator();
		      
		      while(itrdec.hasNext()) {
		    	  System.out.println(itrdec.next());
		      }
		      
		      Collections.sort(list);
		      System.out.println(list);
		      
		      //creating list with own type
		      
		      LinkedList<OwnTypeCastingClass> employee = new LinkedList<OwnTypeCastingClass>();
		      
		      OwnTypeCastingClass toadd = new OwnTypeCastingClass(1,"abhishek",12345, "muzaffarnagar");
		      
		      employee.add(toadd);
		      
//		      Iterator<OwnTypeCastingClass> itremployee = employee.iterator();
//		      
//		      while(itremployee.hasNext()) {
//		    	  System.out.println(itremployee.next());
//		      }
		      
//		      this will not work as this will give class address
		      
		      for(OwnTypeCastingClass i: employee) {
		    	  System.out.println(i.id + " " + i.name + " " + i.address + " " + i.phNo);
		      }
		      
		 }
}
