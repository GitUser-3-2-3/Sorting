import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 2, 3, 8, 4, 1, 9 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}