/*The Fibonacci sequence is a series of numbers where a number is the sum of
previous two numbers. Starting with 0 and 1,
the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.
Write a program that takes as an input an integer n and generates n numbers of
Fibonacci sequence.*/
public class Ex6Looping {
    public static int[] fibonacciCalc(int n) {

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    public static void main(String[] args) {

        int[] numbers = fibonacciCalc(5);

        System.out.println("Fibonacci numbers are");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
