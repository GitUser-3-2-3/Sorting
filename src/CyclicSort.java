// if range is [0 - N], every element will be at: index = value
// if range is [1 - N], every element will be at: index = value - 1; 
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 2, 5, 3, 1, 4 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }
}