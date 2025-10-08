/*
Ques: Rotate the array to the left by d steps. where
      d is 3.
 */
package Array;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9,1};
        int n = arr.length;
        int i = 0, j = 2;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        int k = 3, l = n-1;
        while(k<l){
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            k++;
            l--;
        }
        int m = 0, o = n-1;
        while(m<o){
            int temp = arr[m];
            arr[m] = arr[o];
            arr[o] = temp;
            m++;
            o--;
        }
        for( int ele : arr) System.out.print(ele+" ");
    }
}
