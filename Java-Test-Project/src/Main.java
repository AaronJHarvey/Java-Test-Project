import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // declare the variable 
            //format:  <type> <name>
            // final int age;
        
        // intialize the variable/assign a value to it
            // format: <name> = <value>
            // age = 28;
            
            // print the variable value to the terminal
            // System.out.println("I am " + age + " years old.");

            // char smallLetter = 'a';
            // char capitalLetter = 'A';

            // System.out.println(smallLetter > capitalLetter);

            // String name = "Aaron James Harvey";

            // System.out.println(Arrays.toString(name.split(" ")));



            // Tests replace() method to replace part of a string - 
                // String sentence = "This is a test sentence.";
                // System.out.println(sentence);
                // String changedSentence = sentence.replace("test sentence", "the same test sentence but it has been changed");
                // System.out.println(String.format(changedSentence));

            

                // Contains(method) to see if a string contains a certain substring:
                    String lyric = "Roses are red, violets are blue";
                    if (lyric.contains("Blue")) {
                        System.out.println("The lyric has the word blue in it.");
                    } else {
                        System.out.println("The lyric does not contain the word blue.");
                    }
    }
}