import java.util.Scanner;

public class reverse_no {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum=0;

        int number= 1234;
        //int []n=new int[str.length()];
        while (number >0) {

            sum = number % 10;  // Extract the last digit and add to sum
            number = number / 10;
            System.out.print(sum);// Remove the last digit
        }


    }
}
