/*
Ques: Find the maximum value out of all the give Elements in
the Array.
 */
package Array;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {20,10,41,65,87,93,43,12};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
