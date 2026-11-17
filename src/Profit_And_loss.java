import java.sql.SQLOutput;
import java.util.Scanner;

public class Profit_And_loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp= sc.nextInt();

        if(cp<sp){
            int profit=Math.abs(sp-cp);
            System.out.println("Profit"+profit);
        } else if (cp>sp) {
            int loss= Math.abs(cp-sp);
            System.out.println("Loss"+loss);

        }

        else{
            System.out.println("There is no loss and profit");
        }
    }
}
