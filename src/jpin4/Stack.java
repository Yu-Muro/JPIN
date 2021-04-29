package jpin4;

public class Stack {
	private String[] array = new String[10];
	private int index = 0;

	public void push(String val) {
		array[index] = val;
		index++;
	}

	public String pop() {
		return array[--index];
	}
}
