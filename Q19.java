int sum = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;

            while (temp > 0) {
                int rem = temp % 10;
                sum += (int)Math.pow(rem, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
