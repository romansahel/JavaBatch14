package GroupExercise;

//We have to calculate the average of marks obtained in three subjects by student A and by student B.
//Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
//Provide implementation of abstract method in classes 'A' and 'B'.
//The constructor of student A takes the marks in three subjects as its parameters
//and the marks in four subjects as its parameters for student B. Test your code
abstract public class Marks {
    Marks(){
    }
    abstract void getPercentage();{}
}
class studentA extends Marks{
    int subjcet1;
    int subject2;
    int subjcet3;
    studentA (int subject1, int subject2, int subject3){
        super();
        this.subjcet1=subject1;
        this.subject2=subject2;
        this.subjcet3=subject3;
    }
    @Override
    void getPercentage() {

        System.out.println("The average of 3 subjects =" +(subjcet1+subject2+subjcet3)/3);
    }
}
class studentB extends Marks{
    int subjcet1;
    int subject2;
    int subjcet3;
    int subject4;
    studentB(int subject1, int subject2, int subject3, int subject4){
        super();
        this.subjcet1=subject1;
        this.subject2=subject2;
        this.subjcet3=subject3;
        this.subject4=subject4;
    }
    @Override
    void getPercentage() {

        System.out.println("The average of 4 subjects =" +(subjcet1+subject2+subjcet3+subject4)/4);
    }
}