/*
Ques: Write a program to show swaping of two number
using method is possible or not.
 */

package Methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10 , b = 20;
        System.out.println(a+" "+b);// #Output: 10 20
        swap(a,b);// swap(10,20)
        System.out.println(a+" "+b);// #Output: 10 20
    }
    public static void swap(int a, int b){//int a = 10, b = 20
        int temp = a;
        a = b;
        b = temp;
        // a = 20
        // b = 10
        // But this is a void so it will not return any value
    }
}

