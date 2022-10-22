package Class14;

import java.sql.SQLOutput;

public class MethodsDemo1 {
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello Java");
    }
    void printWord (String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodsDemo1 obj=new MethodsDemo1();
        obj.printHello();
        obj.printWord("Taivion Don't worry its Java");
    }
}
