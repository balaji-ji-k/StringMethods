package com.onesoft.day3_StringMethods;

public class StringEquals {

	public static void main(String[] args) {
		String name = "Raguvaran";
		String s = new String("raguvaran");
		boolean value = name.equals(s);
		System.out.println(value);
		boolean value1 = name.equalsIgnoreCase(s);
		System.out.println(value1);

		boolean value2 = name.contains("var");
		boolean value3 = s.contains("rag");
		System.out.println(value2 + " " + value3);
		boolean value4 = name.startsWith("R");
		boolean value5 = s.endsWith("n");

		System.out.println(value4);
		System.out.println(value5);

	}

}
