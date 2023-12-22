// https://leetcode.com/problems/first-missing-positive/

// Apply cyclic sort whenever the question asks something that includes the array searching from 1 till N, or the answer seeks
// the pattern to be from 1 till N.

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(firstMissingPositive(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for first missing element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;
    }
}