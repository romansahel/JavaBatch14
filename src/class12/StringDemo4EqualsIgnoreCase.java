package class12;

public class StringDemo4EqualsIgnoreCase {

	public static void main(String[] args) {
		String str="Shah";
		if (str.equals("Shah")) {
			System.out.println("I found it");
			
		}
		if (str.equalsIgnoreCase("sHah")) {
			System.out.println("I found it with equals Ignoor Case");
		}
	}

}
