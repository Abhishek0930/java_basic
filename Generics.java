package main;

public class Generics {
	static <T> void genericClassDisplay(T a)		//automatically takes dataType
    {
        System.out.println(a.getClass() + " = " + a);
    }
	
	//remember don't use primitive data types
	
    public static void main(String[] args)
    {
        genericClassDisplay(1154);
        genericClassDisplay("Abhishek");
        genericClassDisplay(1.0);
    }

}
