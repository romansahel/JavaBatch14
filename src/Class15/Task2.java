package Class15;

public class Task2 {
    void printEvenOdd(int number){
        if(number%2==0){
            System.out.println(number+" is Even");
        }else {
            System.out.println(number+ " is Odd");
        }
    }

    public static void main(String[] args) {
        Task2 task=new Task2();
        task.printEvenOdd(44);
        task.printEvenOdd(31);
    }
}
