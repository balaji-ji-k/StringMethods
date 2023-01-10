package com.onesoft.day3_StringMethods;

public class SplitString {
	public static void main(String[] args) {
		String name = "Raja Ram Mohan Roy";
		String names[] = name.split(" ");
		System.out.println("Raja" + "\nRam");
		System.out.println(names[0] + "\n" + names[1] + "\n" + names[2] + "\n" + names[3]);
		String name1 = "Raja|@Ram|#Mohan|Roy";
		String names1[] = name1.split("[|@#]");
		System.out.println(names1[0] + " " + names1[1] + " " + names1[2] + " " + names1[3]);
	}

}
