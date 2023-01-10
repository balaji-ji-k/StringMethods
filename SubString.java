package com.onesoft.day3_StringMethods;

public class SubString {
	public static void main(String[] args) {
		String name = "Balaji";
		String subString1 = name.substring(0, 4);
		String subString2 = name.substring(4);
		System.out.println(subString1 + " " + subString2);
		String name1 = "Hariharan";
		int length = name1.length();
		String subString3 = name1.substring(0, length / 2);
		String subString4 = name1.substring(length / 2);
		System.out.println(subString3 + " " + subString4);
	}
}
