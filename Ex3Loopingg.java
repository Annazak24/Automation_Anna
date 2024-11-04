/*Write a do-while loop that asks the user to enter two numbers.
The numbers should be added and the sum should be displayed.
The loop should ask the user whether they wish to perform the operation again.
If so, the loop should repeat; otherwise, the program should terminate. */

import java.util.Scanner;

public class Ex3Loopingg {

    static Scanner scanner = new Scanner(System.in);

    public static void sumcalculator(int a, int b) {
        String answer = "YES";
        do {
            int sum = a + b;
            System.out.println("The sum is: " + sum);
            System.out.println("Would you like to repeat? (YES/NO): ");
            answer = scanner.nextLine();

            // Ask for new numbers if the user wants to repeat
            if (answer.equalsIgnoreCase("YES")) {
                System.out.println("Please enter two new numbers:");
                a = scanner.nextInt();
                b = scanner.nextInt();
                scanner.nextLine(); // Consume the newline left by nextInt()
            }

        } while (answer.equalsIgnoreCase("YES"));
    }

    public static void main(String[] args) {
        System.out.println("Please enter 2 digits and I will give you the sum:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()
        sumcalculator(a, b);
        scanner.close();
    }
}