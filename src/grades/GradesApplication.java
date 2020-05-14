package grades;

public class GradesApplication {

    public static void main(String[] args) {
        Student emily = new Student("Emily");
        emily.addGrade(100);
        System.out.println(emily.getGradeAverage() == 100);
        // ^ that's a way to test your code, see if it's "true"
        emily.addGrade(40);
        System.out.println(emily.getGradeAverage());


    }






}
