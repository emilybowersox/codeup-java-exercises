import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
//        //why do we need explicitly add a newline to the end of this output?
//
//        double pi = 3.14159;
//        System.out.format("%.2f%n", pi);
//        System.out.printf("The value of pi is approximately %.2f%n", pi);


        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//        //using just next just prints 1 token (individual entry- entries are
//        //separated by whitespace), using nextLine will make the scanner
//        //advance along the line
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


        System.out.print("Enter an integer pls: ");
        int userNumber = scanner.nextInt();
        System.out.println("You entered the following number: " + userNumber);


    }
}
