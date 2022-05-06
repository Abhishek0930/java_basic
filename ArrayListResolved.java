package main;

import java.util.*;
public class ArrayListResolved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  java.util.ArrayList<Integer> num = new java.util.ArrayList<Integer>();

		  num.add(1);
		  num.add(2);
		  num.add(10);
		  num.add(25);
		  num.add(85);
		  num.add(114);
		  num.add(52);
		  num.add(51);
		  num.add(2);
		  
		  
		  System.out.println(num);
		  
		  num.remove(2);
		  System.out.println(num);
		  
		  num.remove((Integer)2);
		  System.out.println(num);
		  
		  //num.remove("2");
		  //System.out.println(num);
		  
		  Collections.sort(num);
	      System.out.println(num);
		  
	      
	}

}
