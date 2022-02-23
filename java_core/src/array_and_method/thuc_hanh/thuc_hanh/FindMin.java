package array_and_method.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        enter();
    }
    public static void enter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Array[" + (i + 1) + "] = " );
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("\nThe smallest value in the array is: " + findMin(arr));
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
