package loop_to_java.thuc_hanh.bai_tap;

import java.util.Scanner;

public class ShowFirst20Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 2, n = 3;
        System.out.print("20 primes: 2 3 ");
        while (count != 20) {
            boolean checkPrime = true;
            n++;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    checkPrime = false;
                }
            }
            if (checkPrime) {
                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println("\nCount = " + count);
    }
}
