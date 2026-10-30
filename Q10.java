
import java.util.Scanner;

class LeapYearRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter ending range: ");
        int end = sc.nextInt();

        if (start <= end && year >= start && year <= end &&
                (year % 400 == 0 ||
                        (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Leap Year and Within Range");
        } else {
            System.out.println("Not a Leap Year within the Range");
        }

        sc.close();
    }
}
