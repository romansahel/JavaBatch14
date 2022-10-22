package class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// String is just 1 example of non primitive data type
		
		//anything you put inside "" is become String 

		String name= "Cyrus";
		
		String address="125 near Ct";
		
		String phone= "(415)305-3579";
		
		int age= 3;
		//shortcut (syso + Ctlr + Space = System.out.println
		System.out.println();
		
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(phone);
		
		
		//"text" + variables
		
		System.out.println("My name is "+name);
		System.out.println("I live in "+ address);
		System.out.println(name +" is "+     age );
		
		
		
		//Example of of text + variables
		
		String fruit ="apple";
		double price = 2.99;
		
		System.out.println("The price of of the " + fruit + " is " +price);
		
		
		// how to change the apple to other fruit???
		
		fruit="Mango";
				price=1.33;
		System.out.println("The price of of the " + fruit + " is " +price);

		
		
		
	}

}
