import java.util.Scanner;

public class Console3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the text");
        String text = scanner.nextLine();
        System.out.print("Please Enter the number of times to print");
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.print(text);
        }
        scanner.close();
    }
}
