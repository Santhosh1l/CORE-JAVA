import java.util.Scanner;

class pattern_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the butterfly pattern:");
        int size = scanner.nextInt();

        // up
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (size - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } // down
        for (int i = size; i >0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < 2 * (size - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}