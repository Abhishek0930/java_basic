package main;

import java.util.*;

public class LambdaFunctions {
	 public static void main(String[] args) {  
		OwnTypeCastingClass a  = new  OwnTypeCastingClass(1,"abhbishek",9557,"muzaffarnagar");
		OwnTypeCastingClass b  = new  OwnTypeCastingClass(2,"raghav",92546,"roorkee");
		OwnTypeCastingClass c  = new  OwnTypeCastingClass(3,"ravi",78555,"roorkee");
		OwnTypeCastingClass d  = new  OwnTypeCastingClass(4,"suman",95473,"muzaffarnagar");
		OwnTypeCastingClass e  = new  OwnTypeCastingClass(5,"himani",2458,"muzaffarnagar");
		OwnTypeCastingClass f  = new  OwnTypeCastingClass(6,"sagar",8542,"muzaffarnagar");
		
		List<OwnTypeCastingClass> list=new LinkedList<OwnTypeCastingClass>();
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		
		
		Collections.sort(list,(p1,p2)->{  //lambda function
	        return p1.name.compareTo(p2.name);  
	        });  
		
		for(OwnTypeCastingClass p:list){  
	            System.out.println(p.id + " " + p.name + " " + p.phNo + " " + p.address);  
	        } 
	 }
}
