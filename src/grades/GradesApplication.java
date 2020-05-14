package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        //String = key: git hub username, Student class = student object



        Student emily = new Student("Emily");
        emily.addGrade(100);
        System.out.println(emily.getGradeAverage() == 100);
        // ^ that's a way to test your code, see if it's "true"
        emily.addGrade(40);
        System.out.println(emily.getGradeAverage());

        Student kelly = new Student("Kelly");
        kelly.addGrade(80);
        kelly.addGrade(78);

        students.put("emilybowersox", emily);
        students.putIfAbsent("emilybowersox", kelly);
        //you can replace "put" with a "replace" OR just another "put"......
        //but using putIfAbsent ensures you don't accidentally replace something
        //so putIfAbsent is the safer choice

        cli(students);
        //sending the information so that the a Hashmap with the same data type
        //and a variable of the same name--- so the above line can send all this
        //info to the next method -- because methods don't automicatically share
        //info with each other
        //^ saving the students info in the variable "cli"
        //SAVE
        //(cli for "command line interface")

    }

    public static void cli(HashMap<String, Student> students){
        //CATCH
        //^ catching the information from above (line 31, (cli(students)))
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");

        for (String key : students.keySet()) {
            System.out.println(key + " ");
            //KEY here is the github username
        }


        do {
            System.out.println("What student do you want to look up?");
            String userInput = input.getString();
            if(students.containsKey(userInput)) {
                System.out.println(students.get(userInput).getName());
                System.out.println("yep we have that student");
            } else {
                System.out.println("sorry no student by that name: " + userInput);
            }
            System.out.println("do you want to see another student?");
        } while(input.yesNo());

    }



}
