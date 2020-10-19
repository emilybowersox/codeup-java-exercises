import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StringCapitalization {
    // capitalize every other letter of a sentence, ignoring spaces between words
public static String capitalizeLetters (String sentence) {

    char[] array = new char[]{};

    array = sentence.toCharArray(); //put the sentence into a character array

    //need to add- if the i+= 1 is a space (" "), then i +=1, otherwise, do i+=2

    for (int i = 0; i < array.length; i += 2) {
        //problem right now is that after a 1 character word it doesn't recognize the spaces afterwards
        if (array[i] == ' ') { //if the character is blank, move to the next index
            i++;
        }
        array[i] = Character.toUpperCase(array[i]); //capitalize

    }

    sentence = new String(array); //revert array back to String

    return sentence;

}


    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        System.out.println("hello");
        String sampleSentence = "i would want to manipulate this string yes i would";
        System.out.println(capitalizeLetters(sampleSentence));


//        while ((sampleSentence = in.readLine()) != null) {
////            System.out.println(line);
////            System.out.println("hello");
////            System.out.println(capitalizeLetters(sampleSentence));
//        }

    }





}
