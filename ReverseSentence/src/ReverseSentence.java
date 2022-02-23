import java.util.*;

/**The goal of this application is to reverse a the order of words
 * that a user gives. This does not reverse the characters, only the
 * words input by the user.
**/
public class ReverseSentence {

    public static String Reverse(String input) {

        String inputAsArray[] = input.split(" ");
        String[] reversedInput = new String[inputAsArray.length];
        String reversedWords = "";
        int j = 0;
        
        for(int i = inputAsArray.length-1; i >= 0; i--) {
            reversedInput[j] = inputAsArray[i];
            reversedWords += reversedInput[j] + " ";
            j++;
        }

        return reversedWords;
    }
    public static void main(String[] args) throws Exception {

        System.out.println("Please enter a sentence: ");
        Scanner read = new Scanner(System.in);
        while(!read.hasNext()){
            System.out.println("I didn't see any input, please enter a sentence: ");
            read.next();
        }
        String input = read.nextLine();
        read.close();

        System.out.println("Original sentence:\n" + input + "\nReversed sentence:\n" + Reverse(input));

    }
}
