package main;

public class abstraction extends employee{

	public static void main(String[] args) {
		abstraction a = new abstraction();
		a.run();
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		
		System.out.print("Running ...");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lastName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		
	}
}
