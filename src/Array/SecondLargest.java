/*
Ques: Print the Second-Largest Number of the Array Element.
*/
package Array;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,5,8,3,6,4,9,1};
        int max = Integer.MIN_VALUE;
        for (int num: arr){
            if(max<num){
                max = num;
            }
        }
        int smax = Integer.MIN_VALUE;
        for(int num : arr){
            if(smax<num && num!=max){
                smax = num;
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
