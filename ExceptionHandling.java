package main;

import java.io.IOException;

public class ExceptionHandling{
	static void validate(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
 }

	
	void m()throws IOException{  
	    throw new IOException("device error"); 
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }
	   catch(Exception e){System.out.println("exception handled");}  
	  } 
	  
	  
	  
	
	 public static void main(String[] args) { 
		 
		 //example of exception
	        try  
	        {  
	        int data=500/0;
	        System.out.println(data);
	        }        
	        catch(Exception e)  
	        {  
	        System.out.println(e);  
	        }
	        
	        
	        //example of null pointer exception
	        
	        try  
	        {  
	        String data = null;
	        System.out.println(data);
	        }        
	        catch(Exception e)  
	        {  
	        System.out.println(e);  
	        }
	        
	        //we can put as many exception as we want in a single class
	        //we can also use nested try blocks
	        
	        try {  
	            try {  
	                try {  
	                    int arr[] = { 1, 2, 3, 4 };   
	                    System.out.println(arr[10]);  
	                }  
	                catch (ArithmeticException e) {  
	                    System.out.println("Arithmetic exception");  
	                    System.out.println(" inner try block 2");  
	                }  
	            }    
	            catch (ArithmeticException e) {  
	                System.out.println("Arithmetic exception");  
	                System.out.println("inner try block 1");  
	            }  
	        }   
	        catch (ArrayIndexOutOfBoundsException e4) {  
	           // System.out.print(e4);  
	            System.out.println(" outermain try block");  
	        }    
	        
	        finally {  
	        	System.out.println("this block is always executed no matter exception is resolved or not");  
	        	}  
	        
	        // bcz outer try failed so only outer catch will run
	        //we can also use methods in it 
	        
	        
	        try  
	        {  
	        validate(15);
	        System.out.println("try block is validating");
	        }        
	        catch(Exception e)  
	        {  
	        System.out.println(e);  
	        }
	        
	        //this is the throw keyword that throws exception explicitly
	        
	        
	        ExceptionHandling obj=new ExceptionHandling();  
	        obj.p();
	        
	        try
	        {
	            int a[]= {1, 2, 3, 4};
	            for (int i = 1; i <= 4; i++)
	            {
	                System.out.println ("a[" + i + "]=" + a[i] + "\n");
	            }
	        }
	          
	        catch (Exception e)
	        {
	            System.out.println ("error = " + e);
	        }
//	          
//	        catch (ArrayIndexOutOfBoundsException e)
//	        {
//	            System.out.println ("ArrayIndexOutOfBoundsException");
//	        }
	        
	        
	        //this will give us an error bcz first catch will throw an exception so no need to put another catch block
	        
	        
	        System.out.println("Abhishek");
	        System.out.println("this will be printed even after exception");
	    }  
}
