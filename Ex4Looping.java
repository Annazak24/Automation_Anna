/*Write a program that takes as an input an integer n and an integer k and
calculates n to the power of k (usage of Math.pow() is not allowed).*/
public class Ex4Looping {
    public static int power(int n, int k) {
        int power = 1;
        if (n == 0) {
            return 0;
        }
        else {
            while (k>0) {
                power= power*n;
                    k--;}
            }
        return power;
    }

    public static void main(String[] args) {
        int power= power(-5,2);
        System.out.println(power);
    }
}

