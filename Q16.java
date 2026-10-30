import java.util.Scanner;

class ShiftOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int multiply = num << power;
        int divide = num >> power;

        System.out.println("After Multiplication = " + multiply);
        System.out.println("After Division = " + divide);

        sc.close();
    }
}
