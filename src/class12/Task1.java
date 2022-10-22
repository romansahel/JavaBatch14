package class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		String userName;
		String password;
		String confirmPassword;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter UserName");
		userName=scanner.next();
		System.out.println("Enter Your Password");
		password=scanner.next();
		System.out.println("Enter your Password agin");
		confirmPassword=scanner.next();
		
		if(userName.isEmpty()|| password.isEmpty()) {
			System.out.println("Username and Password connot be empty");
		
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}else if(password.contains(userName)) {
			System.out.println("password cannot contain username");
		}else if (!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
			
		}
				
	}

}
