package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");

        String userChoice = scanner.nextLine();
        System.out.println(userChoice);

//
//        if (userChoice == 1) {
//            for String Movie[] : MoviesArray {
//                System.out.println(getName() + getCategory());
//            }
//
        }


    }


}
