import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 1, 2, 3, 4, 5, 0, 7 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
    }

    static void bubbleSort(int[] arr) {
        boolean swap;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            // for each step, max item will come at last respective index
            for (int j = 1; j < arr.length - i - 1; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
