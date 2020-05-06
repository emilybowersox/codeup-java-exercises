import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        //while loop
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println("i = " + i);
//            i++;
//        }
//

//        //do-while loop
//        int i = 0;
//        do {
//            System.out.println("i = " + i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println("i = " + i);
//            i-=5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println("i = " + i);
//            i*=i;
//        } while (i < 1000000L);
//        //it breaks at exactly 65,536: which is 256*256
//        // ^so can't let it calculate it with i = 65536 cause then the answer will be a long
//        //65,536 squared is like 4 billion which is a long not an int
//      // the solution is just to use long instead of int!!!
//
//// refactoring as for-loops
//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println("i is " + i);
//        }

//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println("i is " + i);
//        }

//        for(long i = 2; i < 1000000L; i*=i) {
//            System.out.println("i is " + i);
//        }
//        //just have to use long instead of int!!
            //the problem is called an "overflow"


////Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0)
//                System.out.println("Fizzbuzz");
//            else if (i % 3 == 0)
//                System.out.println("Fizz");
//            else if (i % 5 == 0)
//                System.out.println("Buzz");
//            else
//                System.out.println(i);
//        }





//    Scanner numbers = new Scanner(System.in);
//    //initializing a scanner named (number)
//        //had to import "import java.util.Scanner;" at the top!!!
//        boolean userContinues = true;
//
//        do {
////            System.out.print("Please enter an integer: ");
////            int userNumber = numbers.nextInt();
//            System.out.print("What number you want your table to go up to: ");
//            int userTop = numbers.nextInt();
//            System.out.println("You want the table to range from " + userNumber + " to " + userTop);
//
//            int numberSquared = userNumber *= userNumber;
//            System.out.println(numberSquared);
//            int numberCubed = userNumber *= numberSquared;
//            System.out.println(numberCubed);
//
//
//            System.out.println("Here is your table!");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            System.out.println(userNumber + "      " + numberSquared + "         " + numberCubed);
//
//        } while (userContinues);
//

//



//        Scanner grades = new Scanner(System.in);
//        boolean continueOn = true;
//
//do {
//    System.out.print("Enter a grade number: ");
//    int grade = grades.nextInt();
//
//    if (grade > 100)
//        System.out.print("Overachiever! That's not a valid grade ;)");
//    else if (grade <= 100 && grade >= 88)
//        //don't need all these true^ statements cause it's working through the list
//        //top to bottom, you don't need to evauluate for a condition that's already
//        //been evaluated
//        System.out.println("A");
//    else if (grade <= 87 && grade >= 80)
//        System.out.println("B");
//    else if (grade <= 79 && grade >= 67)
//        System.out.println("C");
//    else if (grade <= 66 && grade >= 60)
//        System.out.println("D");
//    else
//        System.out.println("F");
//
//    System.out.println("Would you like to continue?");
//    String agree = grades.next();
//    if (agree.equalsIgnoreCase("y") || agree.equalsIgnoreCase("yes")) {
//        continueOn = true;
//    }
//} while (continueOn);
//
////when using do-whiles, initialize a boolean outside that you will say is true or false
//        // do, WHILE (if) this condition is true


    }
}
