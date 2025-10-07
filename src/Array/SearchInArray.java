package Array;
import java.util.Scanner;
public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,4,5,6,7,8,9};
        int n = sc.nextInt();
        for(int i = 0; i<arr.length; i++){
            if (arr[i]==n){
                System.out.println("Available");
            }
            else System.out.println("Not Available");
        }
    }
}
