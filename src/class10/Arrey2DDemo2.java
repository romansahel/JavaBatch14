package class10;

import java.util.Arrays;

public class Arrey2DDemo2 {

	public static void main(String[] args) {
	
	        int[][] arr= new int[][] {
	            {10,20,30},
	            {45,3,98,98}
	        };
	        int smallest = arr[0][0];
	        System.out.println(Arrays.toString(arr[1]));
	        System.out.println(arr[1][2]);

	        for(int r=0; r<arr.length; r++) {
	            for(int c=0; c<arr[r].length;c++) {
	                if(arr[r][c]<smallest) {
	                    smallest = arr[r][c];
	                }
	                System.out.print(arr[r][c]+" ");
	            }
	            System.out.println( );

	        }
	        System.out.println(smallest);

	    }

	}


