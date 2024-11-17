/*Write a program that takes as an input a positive integer n and computes the natural
logarithm of 2, by adding up to n terms in the series: 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n. */
public class Ex7Looping {
    public static double Logarithm(int n) {

        if (n <= 0) {
        }

        double sum = 0.0;
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
        double logarithm = Logarithm(n);


        System.out.println("The Logarithm of " + n + "  is: " + logarithm);
    }
}

}
