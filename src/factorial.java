package src;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=s.nextInt();
        System.out.println(fact(num));

    }
    static int fact(int n){
        if (n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
