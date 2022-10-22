package class12;

import java.util.Arrays;

public class StringDemo6CharArray {

	public static void main(String[] args) {
		String str="I Love Java Programming";
		char[] charArray=str.toCharArray();
		System.out.println(charArray[5]);
		System.out.println(Arrays.toString(charArray));
		int counter=0;
		for(char c:charArray) {
			if(c=='m') {
				counter++;
				
			}
		}
		System.out.println("letter a hast appread "+counter+ " times");
	}

}
