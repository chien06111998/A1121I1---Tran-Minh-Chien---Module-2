package loop_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money, month;
        double interestRate;
        System.out.print("Nhap so tien vay: ");
        money = sc.nextInt();
        System.out.print("Nhap so thang: ");
        month = sc.nextInt();
        System.out.println("Nhap lai suat (%/year): ");
        interestRate = sc.nextDouble();
        double toTalInterest = money * (interestRate / 12) * month;
        System.out.println("Total of Interest: " + toTalInterest);
    }
}
