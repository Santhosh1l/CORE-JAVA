import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of N: ");

        int n = scanner.nextInt();
       /* patt1(n);
        patt2(n);

        patt3(n);*/

                int[][] arr = new int[n][n];

                // Fill the array based on the observed pattern
                for (int i = 0; i < n; i++) {
                    arr[i][0] = i + 1; // The first column in each row
                }

                // Fill remaining values based on the observed pattern
                for (int i = 1; i < n; i++) {
                    for (int j = 1; j <= i; j++) {
                        arr[i][j] = arr[i - 1][j - 1] + (n - j);
                    }
                }

                // Print the array in the desired pattern
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }


/*

    static void patt1(int n) {
       // Number of rows in the pattern
        for (int row = 1; row <= n; row++) { // Loop for each row
            for (int col = 1; col <= n; col++) { // Loop to print asterisks in each row
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    static void patt2(int n) {
        // Number of rows in the pattern
        System.out.println("\n");
        for (int row = 1; row <= n; row++) { // Loop for each row
            System.out.print(row);
            for (int col = 1; col <= row; col++) {

            }
            System.out.println(); // Move to the next line after each row
        }
    }
    static void patt3(int n){
        for(int i = 1; i<=n; i++ ) {
           System.out.print(i +"\n");
        }
    }*/
