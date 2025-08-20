/*
Ques: Calculate the sum of all the elements
in the give Array.
 */
package Array;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Element: ");
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
        }
        System.out.print("The sum of you Array Element is: "+sum);
    }
}
