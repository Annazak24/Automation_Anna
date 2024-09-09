public class ExThree {
    public static void main(String[] args) {
        calculator("+", 3, 2);
    }

    public static void calculator(String operator, int int1, int int2) {
        switch (operator) {
            case "*": {
                System.out.println(int1 * int2);
            }
            break;
            case "/": {
                System.out.println(int1 / int2);
            }
            break;
            case "+": {
                System.out.println(int1 + int2);
            }
            break;
            case "-": {
                System.out.println(int1 - int2);
            }
            break;
            case "%": {
                System.out.println(int1 % int2);
            }
            break;
        }
    }
}