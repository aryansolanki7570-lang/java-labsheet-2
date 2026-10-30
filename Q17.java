import java.util.Scanner;

class RotateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int rotate = (num << 2) | (num >>> 30);

        System.out.println("After Left Rotation by 2 = " + rotate);

        sc.close();
    }
}
