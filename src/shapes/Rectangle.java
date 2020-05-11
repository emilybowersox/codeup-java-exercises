package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    //the constructor
    public Rectangle(int aLength, int aWidth){
        length = aLength;
        width = aWidth;
        System.out.println("A rectangle is being created");
    }


    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public int getArea(){
        return length * width;
    }


    public static void main(String[] args){
        Rectangle r1 = new Rectangle(3, 4);
        //a rectangle is being created here
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());
    }






}
