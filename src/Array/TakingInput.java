package Array;
import java.util.Scanner;
public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input
        System.out.print("Enter Array Element: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // output
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
