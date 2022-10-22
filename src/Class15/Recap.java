package Class15;

import java.util.Scanner;

public class Recap {
    void printLarger (int num1, int num2){
        if(num1>num2){
            System.out.println("number 1 is larger "+num1);
        }else if(num2>num1){
            System.out.println("number 2 is larger "+num2);
        }else {
            System.out.println("numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the frist Number");
        int num1 =scanner.nextInt();
        System.out.println("Please Enter the Second Number");
        int num2 =scanner.nextInt();
        Recap recap=new Recap();
        recap.printLarger(num1,num2);
    }
}
