package sort.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class BubbleSortIllustration {
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
        bubbleSort(arr);
        display(arr);
    }

    public static void bubbleSort(int [] arr) {
        boolean isCkeck = true;
        for (int i = 1; i < arr.length && isCkeck; i++) {
            isCkeck= false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isCkeck = true;
                }
            }
        }
    }

    public static void display(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
