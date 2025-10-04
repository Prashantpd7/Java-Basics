/*
Ques: Take an array as an input form the user.
      Search for a given number x and print the
      index at which it occurs.
 */
package Array;
import java.util.Scanner;
public class SearchX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Array Element: ");
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter number to search: ");
        int x = sc.nextInt();
        for (int i=0; i<arr.length; i++){
            if(arr[i] == x){
                System.out.print("X is at index "+i);
            }
        }
    }
}
