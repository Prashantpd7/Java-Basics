/*
Ques: Rotate the array to the left by d steps. where
      d is 3.
 */
package Array;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9,1};
        int n = arr.length;
        int d = 3;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for( int ele : arr) System.out.print(ele+" ");
    }
    public static void reverse(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
