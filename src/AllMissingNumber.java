import java.util.ArrayList;
import java.util.List;

/**
 * AllMissingNumber
 */
public class AllMissingNumber {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        AllMissingNumber obj = new AllMissingNumber();
        System.out.println(obj.findDisappearedNumbers(arr));
        System.out.println();
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}