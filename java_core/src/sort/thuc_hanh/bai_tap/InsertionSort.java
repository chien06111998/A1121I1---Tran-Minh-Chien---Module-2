package sort.thuc_hanh.bai_tap;

public class InsertionSort {
    static int [] arr = {5, 2, 4, 1, 7, 9, 12, 10, 6, 22, 20, 17, 15};

    public static void main(String[] args) {
        System.out.print("Initial array: ");
        display(arr);
        System.out.print("Array after sorting: ");
        insertionSort(arr);
        display(arr);
    }

    public static void insertionSort(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > min) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = min;
        }
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
