/*
Ques: Use String value in methods.
 */

package Methods;
import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.print(greet(name));
    }
    static String greet(String name){
        String greeting = "Good morning "+name;
        return greeting;
    }
}
