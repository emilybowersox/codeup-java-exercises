package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
//            = new ArrayList<>()
    // don't need to intialize that here beforehand (but will work either way)

    public Student(String aName){
        this.name = aName;
        this.grades = new ArrayList<>();
        //intialize here instead of above
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for(Integer grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public static void main(String[] args) {
        getname("")




    }


}
