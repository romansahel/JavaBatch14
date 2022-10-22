package GroupExercise;

//Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
// Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.

public interface Shape {

    void calculateArea(double radius);
    void calculatePerimiter(double length);

}
class Circle implements Shape{

    @Override
    public void calculateArea(double radius) {
        double area=3.1415;

        System.out.println("The area of a cicle with the radius of "+ radius+ " is = "+radius*radius*area);
    }

    @Override
    public void calculatePerimiter(double length){

    }
}
class Square implements Shape{
    @Override
    public void calculatePerimiter(double length) {


        System.out.println("The Perimiter of a square with the length of "+length+" is = "+4*length);
    }
    @Override
    public void calculateArea(double radius) {

    }

}