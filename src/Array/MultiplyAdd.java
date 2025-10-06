/*
Ques: Multiply odd element indexed by 2 and add 10 in even.
 */
package Array;

public class MultiplyAdd {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                arr[i] = arr[i]+10;
            }
            else {
                arr[i] = arr[i]*2;
            }
            System.out.print(arr[i]+" ");
        }

    }
}
