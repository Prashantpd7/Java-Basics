package Array;

import java.util.Scanner;

public class FunctionRevise {
    public static void main(String[] args) {
        int Solution = Fill();
        System.out.println("Sum of these no. is: "+Solution);
    }
    public static int Fill(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no one : ");
        int n = sc.nextInt();
        System.out.print("Enter no two : ");
        int m = sc.nextInt();
        int sum = n + m;
        return sum;
    }
}
