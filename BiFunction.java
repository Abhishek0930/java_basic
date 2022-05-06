package main;

public class BiFunction {
	public static void main(String args[])
    {
        java.util.function.BiFunction<Integer, Integer, Integer> function = (a, b) -> a + b;
        function = function.andThen(a -> a * a);
        function = function.andThen(a -> a + a);
        System.out.println(function.apply(2, 3));
    }

}
