import  java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
Scanner scanner= new Scanner(System.in);
        System.out.println("Enter items (type 'exit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")){
                break;
            }
            items.add(input);
        }

      //  System.out.println("You entered:");
        for (String item : items) {
            System.out.println(item);
        }

    }
}
