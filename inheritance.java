package main;

public class inheritance extends employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		inheritance emp = new inheritance();
		emp.experiance = 20;
		System.out.println(emp.salary(emp.experiance));
		emp.run();
		emp.lastName();
	//	emp.firstName(); // will give you an error
		emp.salary();
	}

	@Override
	public void lastName() {
		// TODO Auto-generated method stub
		System.out.println("khullar");
		
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println(10000);
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("running...");
	}

}
