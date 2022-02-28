package array_and_method.thuc_hanh.bai_tap;

import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc. nextInt();
        int [] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter arr[" + (i + 1) + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        show(arr);
        System.out.print("\nEnter value x to delete: ");
        int value = sc.nextInt();
        delete(arr, value);
        System.out.print("Array after delete: ");
        show(arr);
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void delete(int [] arr, int value) {
//        int i = 0;
//        while (i < arr.length && arr[i] != value) {
//            i++;
//        }
//        if (arr[i] != value) {
//            System.out.println("There is no value in the field.");
//        } else {
//            for (int j = i; j < arr.length - 1; j++) {
//                arr[j] = arr[j+1];
//                arr[j+1] = 0;
//            }
//        }
        boolean checkDelete = true;
        for (int k = arr.length - 1; k >= 0; k--) {
            if (arr[k] == value) {
                for (int j = k; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[k+1] = 0;
            } else {
                checkDelete = false;
            }
        }
        if (!checkDelete) {
            System.out.println("There is no value in the field.");
        }
    }
}
