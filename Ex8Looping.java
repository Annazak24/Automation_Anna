/*Write a program that takes as an input an integer number representing half of the number
 of rows and displays diamond-like patterns.*/
public class Ex8Looping {
    public static double logarithm(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        double logarithm = logarithm(n);
        System.out.println(logarithm);
    }
}
