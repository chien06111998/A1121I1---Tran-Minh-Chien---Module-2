package array_and_method.thuc_hanh.bai_tap;

import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        int [] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Array[" + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nThe smaller value in the array: " + findMin(arr));
    }
    public static int findMin(int [] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
