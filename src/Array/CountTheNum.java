/*
Ques: Count the number of the        elements in the given array greater than a given number x.
 */
package Array;
public class CountTheNum {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,2,4,6,4,8,9,6,7};
        int x = 3;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}
