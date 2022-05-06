package main;

public class CallingClass {
	public static void main(String[] args) {  
	    EncapClass acc=new EncapClass();   
	    acc.setAcc_no(123456789);  
	    acc.setName("Abhishek Khullar");  
	    acc.setEmail("abhishekkhullar@gmail.com");  
	    acc.setAmount(5000);  
	    System.out.println(acc.getAcc_no());
	    System.out.println(acc.getAmount());
	    System.out.println(acc.getEmail());
	    System.out.println(acc.getName());
	}  

}
