/*
Topic: In array if you change its value in method then the value
will be changed in main class also unlike in primitive data type.
 */

package Methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7};
        change(arr);// change(1,3,5,6,7)
        System.out.println(Arrays.toString(arr));//(99,3,5,6,7)
    }
    static void change(int [] nums){//int[] nums = {1,3,5,6,7};
        nums[0] = 99;// nums = {99,3,5,6,7};
    }
}
