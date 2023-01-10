package com.onesoft.day3_StringMethods;

public class IndexOfString {

	public static void main(String[] args) {
		String name = "Balaji";
		int index = name.indexOf("a");
		int index1 = name.indexOf("aj");

		int index2 = name.indexOf("Bala");

		System.out.println("The index of a is:" + index);
		System.out.println("The index of aj is:" + index1);
		System.out.println("The index of Bala is:" + index2);

		int length = name.length();
		char firstLetter = name.charAt(0);
		char lastLetter = name.charAt(length - 1);
		System.out.println("The firstletter of name:" + firstLetter);
		System.out.println("The lastletter of name:" + lastLetter);

		String name1 = "Hariharan";
		int length1 = name1.length();
		char first = name1.charAt(0);
		char last = name1.charAt(length1 - 1);
		System.out.println("The firstletter of name:" + first);
		System.out.println("The lastletter of name:" + last);

	}

}
