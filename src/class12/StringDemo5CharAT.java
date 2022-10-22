package class12;

public class StringDemo5CharAT {

	public static void main(String[] args) {
		String str="I love Java programming";
		System.out.println(str.charAt(3));
		System.out.println("******************");
		for(int i=0; i<str.length();i++) {
			//if(!(str.charAt(i)==' ')) {               // with No Spaces 
			System.out.println(str.charAt(i)); //with Spaces 
			
		}
	}

}

