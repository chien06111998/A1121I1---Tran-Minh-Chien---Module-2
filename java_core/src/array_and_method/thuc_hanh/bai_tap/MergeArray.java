package array_and_method.thuc_hanh.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthA, lengthB;
        System.out.print("Enter length array a: ");
        lengthA = sc.nextInt();
        int [] arrA = new int[lengthA];
        System.out.println("Array A: ");
        for (int i = 0; i < lengthA; i++) {
            System.out.print("arrA[" + (i + 1) + "] = " );
            arrA[i] = sc.nextInt();
        }
        System.out.print("Array A = ");
        show(arrA);
        System.out.print("Enter length array b: ");
        lengthB = sc.nextInt();
        int [] arrB = new int[lengthB];
        int [] arrC = new int[lengthA + lengthB];
        for (int j = 0; j < lengthB; j++) {
            System.out.print("Array B[" + (j + 1) + "] = ");
            arrB[j] = sc.nextInt();
        }
        System.out.print("Array B = ");
        show(arrB);
        mergeArray(arrA, arrB, arrC);
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeArray(int [] a, int [] b, int [] c) {
        int pos = 0;
        for (int i = 0; i < a.length; i++) {
            c[pos] = a[i];
            pos++;
        }
        for (int j = 0; j < b.length; j++) {
            c[pos] = b[j];
            pos++;
        }
        System.out.print("Array C after merge array is: " );
        show(c);
    }
}
