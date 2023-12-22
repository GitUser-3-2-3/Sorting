// https://leetcode.com/problems/find-the-duplicate-number/

public class DuplicateNumber {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 3, 1, 3, 4, 2 };
        DuplicateNumber obj = new DuplicateNumber();
        System.out.println(obj.findDuplicate(arr));

        System.out.println();
    }

    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}