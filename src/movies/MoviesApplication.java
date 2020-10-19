package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");

        Integer userChoice = scanner.nextInt();
        System.out.println(userChoice);


        if (userChoice == 1) {
//            for String Movie[] :MoviesArray {
//                System.out.println(getName() + getCategory());
//            }
//        } else if (userChoice == 2) {
//            System.out.println();
//        } else if (userChoice == 3) {
//            System.out.println();
//        } else if (userChoice == 4) {
//            System.out.println();
//        } else if (userChoice == 5) {
//            System.out.println();
//        } else {
//            System.out.println("Oops! You did not enter a valid choice.");
//        }
    }


}


}
