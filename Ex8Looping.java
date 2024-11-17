/*Write a program that takes as an input an integer number representing half of the number
 of rows and displays diamond-like patterns.*/
public class Ex8Looping {
    public static double computeLogarithm(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i % 2 == 0 ? -1.0 : 1.0) / i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        double pattern = computeLogarithm(n);
        System.out.println(pattern);
    }
}


