package src;

import java.util.Scanner;
public class amrstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int num = s.nextInt();
        int n=Integer.toString(num).length();
        System.out.println(n);
        int sum=0,temp=num;
        while (temp> 0)
        {

            int digit = temp % 10;
            sum+=Math.pow(digit,n);
            temp /= 10;
        }

        if (num ==sum) {
            System.out.println("it is amstrong");
        } else {
            System.out.println("not a amstrong");
        }

    }
}