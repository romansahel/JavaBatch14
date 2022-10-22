package class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers
		 *  and operator(+,-,*,/). Based on operator provide the result to user.
		 *  Please complete this assignment in 2 ways: using if statement 
		 *  and switch case.
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Pleas enter 2 Number for math operator");
		double x=input.nextDouble();
		double y=input.nextDouble();
		System.out.println("Pleas Enter your math operator");
		char math=input .next().charAt(0);
		double opration = 0;
		
		switch (math){
		case '+':
			opration=(x+y);
			break;
		case '-':
			opration=(x-y);
			break;
		case '*':
			opration=(x*y);
			break;
		case '/':
			opration=(x/y);
			break;
			default :
				System.out.println("unknow");
				break;
				
			
			
			
			
			
			
		}
		System.out.println(opration);
		
		

	}

}
