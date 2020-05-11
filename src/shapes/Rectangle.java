package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    //the constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
//        System.out.println("A rectangle is being created");
    }


    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public double getArea(){
        return length * width;
    }


    public static void main(String[] args){
        Rectangle r1 = new Rectangle(3, 4);
        //a rectangle is being created here
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());
    }






}
