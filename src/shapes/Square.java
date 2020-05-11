package shapes;

//Create a class named Square, also inside of shapes, that extends Rectangle.
// Square should define a constructor that accepts one argument, side,
// and calls the parent's constructor to set both the length and width
// to the value of side.

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
        // ^ calling the parents constructor
        //super take the place of "new Rectangle (length: x, width: x)"
    }



    public double getArea(){
        System.out.println("getArea from sq");
        // < override symbol- overriding the parent's "getArea" method
        return Math.pow(super.width, 2);
                //instead of putting "this.side",
                //just go to the parent and pick one of the properties
                //otherwise- have to declare side to be able to use it
    }

    public double getPerimeter(){
        System.out.println("getPerimeter from sq");
        //to show that your result is coming from the overriding method
        //in the square class not rectangle class
        return 4 * super.length;
    }

//perimeter = 4 x side
//area = side ^ 2


}


