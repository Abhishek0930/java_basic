package main;

abstract class employee implements Interface{
	
	int experiance;
	
	public int salary(int experiance) {
		return(experiance * 1000);
	}
	
	public void name() {
		System.out.println("Abhishek");
	}
	
	abstract void run();
}
