package introduction_to_java.thuc_hanh.bai_tap;

import java.util.Scanner;

public class ConvertUSTToVND {
    public static void main(String[] args) {
        System.out.println("Enter USD: ");
        Scanner sc = new Scanner(System.in);
        int usd;
        usd = sc.nextInt();
        int vnd = usd * 23000;
        System.out.println(usd + " USD to VND is: " + vnd);
    }
}
