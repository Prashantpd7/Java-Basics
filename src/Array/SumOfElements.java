/*
Ques: Sum of the elements of Array.
 */
package Array;
import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int a=0;
        for (int i=0; i<5; i++){
            a = a+arr[i];
        }
        System.out.print(a+" ");
    }
}
