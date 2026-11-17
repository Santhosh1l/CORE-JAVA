package src;

import java.util.Scanner;
public class palindromeword {

    public static void main(String[] args) {
      //  word=word.toLowerCase();
        String str = "Madam love evol madam";
        boolean isPalindrome = true;
        str=str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break; // No need to check further
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }
}
