import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
//        //why do we need explicitly add a newline to the end of this output?
        // Answer: since you're not using printline here (using printf here) if
        //you were to put out multiple lines you would need to use \n or %n to
        //put in those lines/spaces between
//
//        double pi = 3.14159;
//        System.out.format("%.2f%n", pi);
            //"f" represents taking in a double or a float
//        System.out.printf("The value of pi is approximately %.2f%n", pi);


//        Scanner scanner = new Scanner(System.in);
        //intializing a Scanner variable with the name "scanner"

//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//        //using just next just prints 1 token (individual entry- entries are
//        //separated by whitespace), using nextLine will make the scanner
//        //advance along the line
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


//        System.out.print("Enter an integer pls: ");
//        int userNumber = scanner.nextInt();
//        System.out.println("You entered the following number: " + userNumber);

//        Scanner words = new Scanner(System.in);
//        //initializing a Scanner variable  the name "words"
//
//        String wordOne;
//        String wordTwo;
//        String wordThree;
//        //initializing variables
//
//        System.out.println("Enter three words. Separate each with a blank or return.");
//        wordOne = words.nextLine();
//        wordTwo = words.nextLine();
//        wordThree = words.nextLine();
//
//        System.out.println("Here are the three words you entered: ");
//        System.out.println(wordOne + " " + wordTwo + " " + wordThree);
//        //if you do it with .nextLine() you have to hit return between each word
//        //-it takes the whole line of an entry as one entry, vs. if you just use
//        //.next() it will divide entries by whitespace


            Scanner classroom = new Scanner(System.in);



            System.out.println("Please enter first the length and then the width");
            System.out.println("of the Codeup classroom.");

            float length = Float.parseFloat(classroom.next());
            float width = Float.parseFloat(classroom.next());
            float area = width * length;
            float perimeter = (width * 2) + (length * 2);

            System.out.println("The length is " + length + " and the width is " + width + " .");
            System.out.println("The area is " + area + " and the perimeter is " + perimeter);


    }
}
