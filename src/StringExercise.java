public class StringExercise {
    public static void main(String[] args) {

        String pinkFloyd = "We don't need no education\nWe don't need no thought control";
        // \n creates a "new line"
        System.out.println(pinkFloyd);

        String checkIt = "Check \"this\" out!, \"s inside of \"s!";
        //print "" inside the string by putting \ in front of each "
        System.out.println(checkIt);

        String windows = "In windows, the main drive is usually C:\\";
        //each double \\ produces one \
        System.out.println(windows);

        String backslash = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
                //wow intellij actually fixed it automatically for me^
                //but same, use a double \\ for each single \ you're representing,
                //use \n to create a "new-line", don't have to concatenate but just keeps
                //your code less wide on this page
        System.out.println(backslash);












    }
}
