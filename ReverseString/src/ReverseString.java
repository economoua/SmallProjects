import java.util.*;

public class ReverseString {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in); // Read input

        while(!read.hasNext()){
            System.out.println("I didn't see any input, please enter a string: ");
            read.next();
        }

        String str = read.nextLine();
        read.close(); //Close input reading.
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Original: " + str + "\nReversed: " + reverse);
        
        if(str.equalsIgnoreCase(reverse))
            System.out.println("That's a palindrome!");

    }
}
