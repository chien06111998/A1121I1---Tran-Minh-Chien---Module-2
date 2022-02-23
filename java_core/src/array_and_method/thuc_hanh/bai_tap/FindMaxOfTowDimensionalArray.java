package array_and_method.thuc_hanh.bai_tap;

import java.util.Scanner;

public class FindMaxOfTowDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length h: ");
        int h = sc.nextInt();
        System.out.print("Enter length w: ");
        int w = sc.nextInt();
        int [][] arr = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("Araay[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Array is: ");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("The biggest value in array: " + findMax(arr, h, w));
    }
    public static int findMax(int [][] arr, int h, int w) {
        int max = arr[0][0];
        for (int i = 0; i < h; i++) {
            for (int j = 1; j < w; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
