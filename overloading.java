package main;

public class overloading {
	
	 static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) { //static is requires or we need to make an object
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1, b = 20, c = 30;
		
		System.out.println(add(a,b));//will use first method
		
		System.out.println(add(a,b,c));//will use second method
		

	}

}
