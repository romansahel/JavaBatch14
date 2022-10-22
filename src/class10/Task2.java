package class10;

public class Task2 {

	public static void main(String[] args) {
		String[][] countries= {
                {"USA","Canada"},// 1 array index 0
                {"Peru","Brazil","Columbia","Ecuador"},// 2 array index 1
                {"Ethiopia","Egypt","Kenya"},
                {"Germany","Turkiye","Moldova","Ukraine"},
                {"Kazhakhstan","Afghanistan","Korea"},
        };
        System.out.println(countries.length);// 5 total of array or rows
        int elementsOf1arr=countries[0].length;
        System.out.println(elementsOf1arr);
        int elementsOf2arr=countries[1].length;
        System.out.println(elementsOf1arr);

        System.out.println("=========all values from 2d array============");
        for(int r =0; r<countries.length; r++) { // loops over rows
            for(int c=0; c<countries[r].length; c++) {
                System.out.print(countries[r][c]+" ");
            }
            System.out.println();
        }
	}
}
