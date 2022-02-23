package array_and_method.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("arr["+ (i + 1) + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("\nMax is : " + findMax(arr));
    }
    public static int findMax(int [] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
