package Array;
import java.util.Scanner;
public class Revise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Array elements: ");
        for(int i=0; i<arr.length;i++)
{
            arr[i] = sc.nextInt();
        }
        System.out.print("You Entered: ");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
