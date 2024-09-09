public class Ex1Looping {
    public static void main(String[] args) {
        digitCount(1000000000);
    }

    public static void digitCount(int a) {
        int count = 0;
        if (a < 0) {
            a = -a;
        } else if (a == 0) {
            count = 1;
        }
        for (int x = 10; a > 0; a = a / 10) {
            count++;
        }
        System.out.println(count);
    }
}
