package cognizant;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(num(a));
    }

    static int num(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }

            if (sum > 9) {
                return num(sum);
            }

            return sum;
        }
    }


