public class ExOne {
    public static void main(String[] args) {
        increasingDecrasing(4, 2, 1);
    }

    public static void increasingDecrasing(int a, int b, int c) {
        if (c > b && b > a) {
            System.out.println("increasing");
        } else if (a > b && b > c) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }

    }
}