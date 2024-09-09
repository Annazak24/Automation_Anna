public class ExTwo {
    public static void main(String[] args) {
leapYear(100);
    }
    public static void leapYear(int year){
        if(year%4==0 && year%100!=0){
            System.out.println("Leap year");
        } else if (year%400==0){
            System.out.println("leap year");
        }else {
            System.out.println("not leap year");
        }
    }
}
