// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 1, 3, 2, 2, 5 };
        SetMismatch obj = new SetMismatch();
        System.out.println(Arrays.toString(obj.findErrorNums(arr)));

        System.out.println();
    }

    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for the missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] { arr[index], index + 1 };
            }
        }

        return new int[] { -1, -1 };
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
