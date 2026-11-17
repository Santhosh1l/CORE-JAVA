package src;

import java.util.*;
public class FirstElementUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))
                        +(word.substring(1))
                        +(" "));
            }
        }
        System.out.println(result);
    }}
