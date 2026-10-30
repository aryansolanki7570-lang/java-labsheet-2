int a = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        int b = sc.nextInt();

        System.out.print("Enter marks of subject 3: ");
        int c = sc.nextInt();

        int total = a + b + c;
        double percentage = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (a >= 40 && b >= 40 && c >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
