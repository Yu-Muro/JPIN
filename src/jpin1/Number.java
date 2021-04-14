package jpin1;

public class Number {

	public static void main(String[] args) {
		int a, b;
		a = 10;
		b = a++ + ++ a;
		System.out.println(a); //12
		System.out.println(b); //22
	}
}
