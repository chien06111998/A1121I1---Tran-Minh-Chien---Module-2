package introduction_to_java.thuc_hanh.bai_tap;

import java.util.Scanner;

public class ReadNumberInToLetter {
        final static String[] ones = {" ",  " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
        final static String[] tens = {" ", " ", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};
        public static void readNum(int num, String value) {
            System.out.print(num > 19? tens[num/10] + " " + ones[num%10] : ones[num]);
            System.out.print(num > 0? value : "");
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----convert numbers to letters-----");
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            readNum(((num/100)%10) , " Hundred And");
            readNum(num%100, "");
        }
}
