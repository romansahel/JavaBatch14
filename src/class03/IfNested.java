package class03;

public class IfNested {

	public static void main(String[] args) {
		boolean allergy = true;
		String allergyType = "Peanut";
		if (allergy) {
			System.out.println("let's check with allergy you have");
			if (allergyType.equals("pollen")) {
				System.out.println("try to stay indoor");
			}
		} else {
			System.out.println("you are luck");
		}
	}

}
