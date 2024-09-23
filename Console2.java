import java.util.Scanner;

public class Console2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text");
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
        scanner.close();
    }
}

