package loop_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + "is not prime.");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a prime.");
            } else {
                System.out.println(number + " is not prime.");
            }
        }
    }
}
