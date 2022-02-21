package introduction_to_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Show the number of day of the month");
        System.out.println("Enter month: ");
        int month;
        do{
            month = sc.nextInt();
        } while (month < 1 || month >12);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The number of days of the month " + month + " is: 31 days");
                break;
            case 2:
                System.out.println("February has 28 or 29 days.");
                break;
            default:
                System.out.println("The number of days of the month " + month + " is: 30 days");
                break;
        }
    }
}
