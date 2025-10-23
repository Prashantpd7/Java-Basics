package Array;

public class LSearch {
    public static void main(String[] args) {
        int[] nums = {12,34,14,76,98,34,65,19,46};
        int target = 98;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target)
                return target;
        } return 2;
    }
}
