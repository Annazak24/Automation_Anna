import java.util.Scanner;

public class Console1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text");
        String text = scanner.nextLine();
        int count = text.length();
        System.out.println("The number of characters" + " is " + count);
        scanner.close();
    }
}
