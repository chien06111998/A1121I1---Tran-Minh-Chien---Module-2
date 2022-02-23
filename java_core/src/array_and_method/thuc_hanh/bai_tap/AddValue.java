package array_and_method.thuc_hanh.bai_tap;

import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length, value, index;
        length= sc.nextInt();
        int [] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + (i + 1) +"] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        show(arr);
        System.out.print("\nEnter value x to insert: ");
        value = sc.nextInt();
        System.out.print("Enter index x: ");
        index = sc.nextInt();
        System.out.print("Array after insert: ");
        int [] cpyArr = new int[length + 1];
        copyArray(arr, cpyArr);
        add(cpyArr, value, index);
        show(cpyArr);
    }
    public static void copyArray(int [] arr, int [] cpyArr) {
        for (int i = 0; i < arr.length; i++) {
            cpyArr[i] = arr[i];
        }
    }
    public static void show (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void add( int [] arr, int value, int index) {
        int i = 0;
        while (i < arr.length) {
            i++;
        }
        if (index > arr.length - 1 || index < 0) {
            System.out.println("Enter the wrong index.");
        } else {
            for (int j = arr.length - 1; j >= index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[index] = value;
        }
    }
}
