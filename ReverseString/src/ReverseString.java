import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in); //Read
        String str = read.nextLine();
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Original: " + str + "\nReversed: " + reverse);
        
        if(str.equalsIgnoreCase(reverse))
            System.out.println("That's a palindrome!");
    }
}
