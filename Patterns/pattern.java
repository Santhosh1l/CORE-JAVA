import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String n = scanner.nextLine();
        //char[] l = n.toCharArray();
        int m = n.length();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == m -1) {
                    System.out.print (n.charAt(j));//(l[j]);//
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
