import java.util.Scanner;

public class MethodsExercises {

//    public static int add(int a, int b) {
//       return a + b;
//    }
//
//    public static int subtract(int a, int b){
//        return a-b;
//    }
//
//    public static void multiply(int a, int b){
//        System.out.println(a*b);
//    }
//
//    public static double divide(double a, double b){
//      if (b == 0){
//            return 0;
//                    }
//      //division by zero equals infinity
//        return a/b;
//    }
//    //if you say int instead of double it's going to round it
//
//    public static int modulus(int a, int b){
//        return a%b;
//    }
//
    public static void main(String[] args) {
//        System.out.println(add(5, 10));
//        System.out.println(subtract(4,2));
//        multiply(4,7);
//        System.out.println(divide(3,2));
//        System.out.println(modulus(5,2));
            getInteger(1, 10);
    }






    public static int getInteger(int min, int max) {
        Scanner aNumber = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
        int userInput = Integer.parseInt(aNumber.nextLine());

        //how to proceed
        if (userInput < min || userInput > max) {
            System.out.println("Not a valid number");
            return getInteger(min, max);
        } else {
            //how to stop
            System.out.println("Number is within range");
            return userInput;
        }


    }

}







