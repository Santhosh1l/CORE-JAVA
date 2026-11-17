package src;

import java.util.Scanner;

public class digisme {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num = sc.nextInt();

        int factor = (int) Math.pow(10, String.valueOf(num).length() - 1);
        System.out.println(factor);

        while (factor > 0) {
            int placeValue = (num / factor) * factor;
            System.out.println(placeValue);
            num = num % factor;
            factor = factor / 10;
        }
    }
}
