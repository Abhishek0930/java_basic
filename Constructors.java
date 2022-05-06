package main;

public class Constructors {
	int id;
	String name;
	public Constructors(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public Constructors() {
		System.out.println("this is void constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors a = new Constructors();
		Constructors b = new Constructors(10, "abhi");
		System.out.println(a.id +  " " + a.name);
		System.out.println(b.id +  " " + b.name);
	}

}
