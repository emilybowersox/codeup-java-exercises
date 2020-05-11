import java.util.Scanner;

public class Bob {
    public static void main(String[] args){


        //Bob answers 'Sure.' if you ask him a question.
        // (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him.
        // (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!'
        // if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.

//
//
//        Scanner convo = new Scanner(System.in);
//
//        boolean keepTalking = true;
//        System.out.println("Go ahead, talk to Bob!");
//        //placing the intro outside so it doesn't keep repeating
//        do {
//            String userInput = convo.nextLine();
//
//            if (userInput.endsWith("?")) {
//                System.out.println("Sure.");
//            } else if (userInput.endsWith("!")) {
//                System.out.println("Whoa, chill out!");
//            } else if (userInput.trim().equals("")) {
//                System.out.println("Fine. Be that way!");
//            } else {
//                System.out.println("Whatever.");
//            }
//        } while (keepTalking);
        //can also just write "true"

        int x = 5 * 4 % 3;
        System.out.println(x);

        String hey = "hello";
        System.out.println(x + hey);



    }
}
