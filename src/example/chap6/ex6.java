package example.chap6;

public class ex6 {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; // auto boxing
		System.out.println("intObject = " + intObject);
		int m = intObject + 10; // auto unboxing
		System.out.println("m = " + m);
	}
}