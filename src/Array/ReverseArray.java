/*
Ques: Write a program to reverse the array without using any extra array.
 */
package Array;

public class ReverseArray {
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11};
        int n = arr.length;
        print(arr);
        int i = 0, j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        print(arr);
    }
}
