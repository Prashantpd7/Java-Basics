/*
Ques: Find the missing number from the array element.
 */
package Array;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        int arrsum = 0;
        for(int ele : arr){
            arrsum += ele;
        }
        System.out.println(sum - arrsum);
    }
}
