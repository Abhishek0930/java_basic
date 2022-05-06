package main;
import java.util.*;

public class HashMap {

	public static void main(String[] args) {
		
		 java.util.HashMap<Integer,String> hm=new java.util.HashMap<Integer,String>();
	        hm.put(100,"Amit");
	        hm.put(104,"Amit"); 		//value can be same 
	        hm.put(101,"Vijay");
	        hm.put(102,"Rahul");
	        hm.remove(104);
	        hm.remove(10); //nothing will happen
	        System.out.println("This is hashmap : ");
	        
	        
	        for (Map.Entry<Integer,String> m:hm.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }
	        
	        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	        ht.put(101," ajay");
	        ht.put(101,"Vijay");			//key cannot be same
	        ht.put(102,"Ravi");
	        ht.put(103,"Rahul");
	        ht.remove(103);
	        ht.remove(10); //nothing will happen
	        System.out.println("\n\nThis is hashtable");
	        for (Map.Entry<Integer, String> m:ht.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }

	}

}
