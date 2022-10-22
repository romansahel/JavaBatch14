package class04;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	        boolean creditCard = true;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Do you have a credit card or not? ");
	        String answer = scanner.nextLine();

	        if (answer.equals("No") || answer.equals("no"))
	        {
	            System.out.print("We can help you get on, are you interested? ");
	        }

	        else

	        System.out.print("What is balance on the card? ");
	        int balance = scanner.nextInt();

	        if(balance > 1000) 
	        {
	            System.out.print("You need to pay off immediately");
	        }

	        else
	            System.out.println("You can spend more");
	    }
	

	}


