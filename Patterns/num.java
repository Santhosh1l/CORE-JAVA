public class num {

        public static void main(String[] args) {
            int n = 5; // Number of rows
            int[][] arr = new int[n][n];

            // Fill the array based on the observed pattern
            for (int i = 0; i < n; i++) {
                arr[i][0] = i + 1; // The first column in each row
            }

            // Fill remaining values based on the observed pattern/
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