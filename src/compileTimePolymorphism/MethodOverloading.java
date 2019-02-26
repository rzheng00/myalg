package compileTimePolymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		Overload obj = new Overload();
		double result;
		obj.demo(1);
		obj.demo(2, 3);
		result = obj.demo(5.5);
		System.out.println("O/P : " + result);
	}

}
