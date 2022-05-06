package main;

import java.util.*;

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> a = new TreeSet<String>(
				new java.util.Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {
						return o2.compareTo(o1);
					}
					
				});
		
		a.add("Z");
		a.add("X");
		a.add("A");
		a.add("B");
		a.add("Y");
		
		System.out.println(a);
		

	}

}
