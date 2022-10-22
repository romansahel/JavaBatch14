package class04;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		/*
		 * Windows: ctrl+Shift+o Mac: cmd+Shift+o
		 */
		int i = 10;
		String str = "Hello";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Nice to meet you " + name);
		System.out.println("how onld are you " + name);
		int age = input.nextInt();
		System.out.println(name + " is " + age + " years old");
		System.out.println("How much money you have " + name);
		double money = input.nextDouble();
		System.out.println(name + " has $" + money);
		System.out.println(name + " what is your grade");
		char grade = input.next().charAt(0);
		System.out.println(name + " has grade " + grade);

	}

}
