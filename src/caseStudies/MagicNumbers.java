package caseStudies;

import java.util.Scanner;

public class MagicNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice, number = 0;
		
		final String SET_1 = 
				" 1  3  5  7\n" + 
				" 9 11 13 15\n" +
				"17 19 21 23\n" +
				"25 27 29 31";
		final String SET_2 =
				" 2  3  6  7\n" +
				"10 11 14 15\n" +
				"18 19 22 23\n" +
				"26 27 30 31";
		final String SET_3 =
				" 4  5  6  7\n" +
				"12 13 14 15\n" +
				"20 21 22 23\n" +
				"28 29 30 31";
		final String SET_4 =
				" 8  9 10 11\n" +
				"12 13 14 15\n" +
				"24 25 26 27\n" +
				"28 29 30 31";
		final String SET_5 =
				"16 17 18 19\n" +
				"20 21 22 23\n" +
				"24 25 26 27\n" +
				"28 29 30 31";
		
		System.out.println(SET_1);
		System.out.print("Is your Number in this set? (1 for Yes. 2 for No) ");
		choice = input.nextInt();
		if(choice == 1){
			number += 1;
		}
		System.out.println();
		
		System.out.println(SET_2);
		System.out.print("Is your Number in this set? (1 for Yes. 2 for No) ");
		choice = input.nextInt();
		if(choice == 1){
			number += 2;
		}
		System.out.println();
		
		System.out.println(SET_3);
		System.out.print("Is your Number in this set? (1 for Yes. 2 for No) ");
		choice = input.nextInt();
		if(choice == 1){
			number += 4;
		}
		System.out.println();
		
		System.out.println(SET_4);
		System.out.print("Is your Number in this set? (1 for Yes. 2 for No) ");
		choice = input.nextInt();
		if(choice == 1){
			number += 8;
		}
		System.out.println();
		
		System.out.println(SET_5);
		System.out.print("Is your Number in this set? (1 for Yes. 2 for No) ");
		choice = input.nextInt();
		if(choice == 1){
			number += 16;
		}
		System.out.println();
		
		System.out.println("Your Number is " + number);
	}
}
