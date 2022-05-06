package main;

import java.util.*;

public class HashSet {

	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		java.util.HashSet<String> set=new java.util.HashSet<String>();  
		System.out.println("Hashset is created");
		
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");	//duplicate will not occour
		  set.add("Ajay"); 
		  set.add(null);
		  
		  
		  set.remove("Ravi");
		  set.remove("aaa");  	//will not affect the set
		  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  
		  //this is linked hashSet
		  
		  LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		  
      linkedset.add("A");
      linkedset.add("B");
      linkedset.add("C");
      linkedset.add("D");

      linkedset.add("A");	//will not affect the code
      linkedset.add("E");
      
      System.out.println("Size of LinkedHashSet = "+ linkedset.size());

      System.out.println("Original LinkedHashSet:" + linkedset);

      System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));	//gives boolean value

      System.out.println("Trying to Remove Z which is not present: " + linkedset.remove("Z"));

      System.out.println("Checking if A is present=" + linkedset.contains("A"));

      System.out.println(linkedset + " \n\n");
      
      
      
     //test of speed of all three hashSet, linked hashSet and tree set
      
      java.util.HashSet<Integer> HS = new java.util.HashSet<>();
      long startingTime = System.nanoTime();
      for (int i = 0; i < 1000; i++) {
          HS.add(i);
      }
      long endedTime = System.nanoTime();
      System.out.println("add time taken by hashset  " + Math.abs(startingTime - endedTime));
      

      startingTime = System.nanoTime();
      for (int i = 0; i < 1000; i++) {
          HS.remove(i);
      }
      endedTime = System.nanoTime();
      System.out.println("delete time taken by hashset  " + Math.abs(startingTime - endedTime) + "\n\n");
      
      
      
      
      
      LinkedHashSet<Integer> LHS = new LinkedHashSet<>();
      startingTime = System.nanoTime();
      for (int i = 0; i < 1000; i++) {
          LHS.add(i);
      }
      endedTime = System.nanoTime();
      System.out.println("add time taken by Linkedhashset  " + Math.abs(startingTime - endedTime));

       startingTime = System.nanoTime();
      for (int i = 0; i < 1000; i++) {
          LHS.remove(i);
      }
       endedTime = System.nanoTime();
      System.out.println("delete time taken by LinkedHashSet  " + Math.abs(startingTime - endedTime) + "\n\n");
      
      
      
      
      
      TreeSet<Integer> TS = new TreeSet<>();
      startingTime = System.nanoTime();
      for (int i = 0; i < 1000; i++) {
          TS.add(i);
      }
      endedTime = System.nanoTime();
      System.out.println("add time taken by treeset  " + Math.abs(startingTime - endedTime));

       startingTime = System.nanoTime();
      for (int i = 0; i < 1000; i++) {
          TS.remove(i);
      }
       endedTime = System.nanoTime();
      System.out.println("delete time taken by treeset  " + Math.abs(startingTime - endedTime));
  }
}  
