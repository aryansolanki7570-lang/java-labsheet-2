public class VisitorCounter {
    public static void main(String[] args) {
        int visitors = 0;

        System.out.println("Initial Visitors = " + visitors);

        System.out.println("Visitor Entering: " + (++visitors));
        System.out.println("Visitor Entering: " + (visitors++));
        System.out.println("After Postfix Increment = " + visitors);

        System.out.println("Visitor Leaving: " + (visitors--));
        System.out.println("Visitor Leaving: " + (--visitors));

        System.out.println("Final Visitors = " + visitors);
    }
}