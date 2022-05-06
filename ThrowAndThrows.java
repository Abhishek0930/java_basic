package main;

public class ThrowAndThrows {
	
	 public void checkNum(int num) {  
	        if (num < 1) {  
	            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
	        }  
	        else {  
	            System.out.println("Square of " + num + " is " + (num*num));  
	        }  
	    } 
	 
	 public int divideNum(int m, int n) throws ArithmeticException {  
	        int div = m / n;  
	        return div;  
	    }

	public static void main(String[] args) {
		//  Auto-generated method stub
		 ThrowAndThrows obj = new ThrowAndThrows();  
        // obj.checkNum(-3);  
		 
		 
		 
         try {  
             System.out.println(obj.divideNum(45, 0));  
         }  
         catch (ArithmeticException e){  
             System.out.println(e);  
             }
         
         
         System.out.println("Rest of the code..");  
         
         //throw for unchecked and throws for propagation of checked
     }   
	}
