package main;

public class FlowControlException {
	
	public static String run() {
		try  
        {  
        int data=500/0;
        System.out.println(data);
        }        
		catch(Exception e)  
        {  
		return "aaa";  
        }
		finally {
			System.out.println("Finally Block");
		}
		return "xyz";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simple Try and catch block
		try  
        {  
        int data=500/0;
        System.out.println(data);
        }        
		catch(Exception e)  
        {  
		System.out.println(run());
        System.out.println(e);  
        return;
        }
		finally {
			System.out.println("Finally Block 02");
		}
	
//		
//		
//		//block if we remove the catch block
//		try  
//        {  
//        int data=500/0;
//        System.out.println(data);
//        }        
//		finally {
//			System.out.println("Finally Block");
//		}
//		//here finally block will run first but give exception and flow control error
//		
//		
//		//if we remove finally block
//		try  
//        {  
//        int data=500/0;
//        System.out.println(data);
//        }        
//		catch(Exception e)  
//        {  
//        System.out.println(e);  
//        }
//		//no error will be there that will be completely fine
//		
//		
//		//if we declare different exception in catch block
//		try  
//        {  
//			int arr[]= {1,3,5,7};  
//        System.out.println(arr[10]);
//        }        
//		catch(ArithmeticException e)  
//        {  
//        System.out.println(e);  
//        }
//		//error will come with that exception
//		
//	    // only catch will not work it will give an error
//		
		
		
	}

}
