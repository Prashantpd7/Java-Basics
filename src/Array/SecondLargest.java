/*
Ques: Print the Second-Largest Number of the Array Element.
 */
package Array;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,5,8,3,6,4,9,1};
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smax<arr[i] && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
