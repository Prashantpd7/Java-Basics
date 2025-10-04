package Array;
import java.util.Scanner;
public class revise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array elements: ");
        for(int i=0; i<=arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("You Entered: ");
        for(int i=0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
