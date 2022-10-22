package class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade = input.next();
		String expl;
		switch (grade) {
		case "A":
			expl = "Excelent";
			break;
		case "B":
			expl = "Good";
			break;
		case "C":
			expl = "Average";
			break;
		case "D":
			expl = "Bad";
			break;
		default:
			expl = "Not Acceptable";
			break;

		}
		System.out.println("your grade is " + grade + " and it's " + expl);

	}

}
