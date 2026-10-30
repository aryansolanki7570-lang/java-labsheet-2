public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Wrong Password! Try Again.");
            }

        } while (!password.equals(correctPassword));

        System.out.println("Correct Password! Access Granted.");

        sc.close();
    }
}