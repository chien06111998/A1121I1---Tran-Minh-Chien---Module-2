package sort.thuc_hanh.bai_tap;

import java.util.Scanner;

public class InsertSortIllustration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "]= ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Inital array: ");
        display(arr);
        System.out.print("Array after sorting: ");
        insertSort(arr);
        display(arr);
    }

    public static void insertSort(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > min) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = min;
        }
    }

    public static void display(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
