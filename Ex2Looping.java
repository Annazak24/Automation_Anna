public class Ex2Looping {
    /*  Write a program which allows the user to enter as many numbers
    as they want and at the end the program should display the largest and
     the smallest numbers entered. */
    public static int smallest, largest;

    public static void sizer(int... numbers) {
        largest = numbers[0];
        smallest = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            else if(numbers[i]<smallest) {
                smallest= numbers[i];
            }
        }
        System.out.println("The largest number is" + " " + largest);
        System.out.println("The smallest number is" + " " + smallest);
    }

    public static void main(String[] args) {
        sizer(1, 5, 7, 0, -8, 6666, 458, 222, 8512, 2, 5, 47, 5, 2, 2, 4, 5, 2, 54, 2, 9);
    }
}


