package cognizant;

import java.util.Scanner;

public class q3{

    public static int countGreenToRedSwitches(int N, int[] numbers) {
        int switchCount = 0;
        String prevColor = "";

        for (int i = 0; i < N; i++) {
            String currentColor = (numbers[i] % 2 == 1) ? "green" : "red";

            if (prevColor.equals("green") && currentColor.equals("red")) {
                switchCount++;
            }

            prevColor = currentColor;
        }

        return switchCount;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for(int i=0;i<N;i++){
            numbers[i]=sc.nextInt();
        }

        int result = countGreenToRedSwitches(N, numbers);
        System.out.println("Number of switches from green to red: " + result); // Output: 1
    }
}
