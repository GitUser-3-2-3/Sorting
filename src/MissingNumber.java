// https://leetcode.com/problems/missing-number/
/**
 * MissingNumber
 */
public class MissingNumber {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 0, 2, 4, 3, 1 };
        System.out.println(missingNumber(arr));

        System.out.println();
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for first missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }
}
