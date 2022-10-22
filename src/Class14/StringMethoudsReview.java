package Class14;

public class StringMethoudsReview {
    public static void main(String[] args) {
        String str = "hello";

        //to Upper Case or to Lower Case
        str = str.toUpperCase();
        System.out.println(str);
        //length() -> give size
        int size = str.length();
        System.out.println(size);
        //charAt() -> returns the char value at the spacified index
        char letter = str.charAt(3);
        System.out.println(letter);
        // how to get last Character
        char lastCharacter = str.charAt(str.length() - 1);
        System.out.println(lastCharacter);
        //indexOf -> returns the index within this string of the first character
        int index = str.indexOf(lastCharacter);
        System.out.println(index);
        //is Empty()-> returns true if length is more than Zero
        boolean emptry = str.isEmpty();
        System.out.println(emptry);
        String part1 = str.substring(0, 5);
        System.out.println(part1);
        // concat
        String newString = part1.concat(" ");
        System.out.println(part1);
        //replace
        String myString = "Today is September";
        myString = myString.replace("September", "October");
        System.out.println(myString);
        myString = myString.replace('c', 'C');
        System.out.println(myString);
        // split
        String myStr = "Today is a review Class";
        String[] array = myStr.split(" ");
        System.out.println(array.length);
        System.out.println(array[3]);

        int i;
        for (i = 0; i > array.length; i++)

        System.out.println(array[i]);

    }
}
