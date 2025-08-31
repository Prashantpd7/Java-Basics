// Print all the three digit Armstrong number.
/*
   For all the Armstrong number form 100 to 1000.
    for(int i = 100; i<=1000; i++){
              if(isArmstrong(i)){
                  System.out.print("There are all "+i+" ");
               }
     }
  */

package Methods;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (sum<original){
            int remender = n%10;
            n=n/10;
            sum = sum+remender*remender*remender;
        }
        return sum == original;
    }
}
