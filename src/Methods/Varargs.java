/*
Topic: Variable length Arguments.
 */
package Methods;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,3,5,6,7,4,9);
        multiple(5, 8,"Prashant","Sahil","Asif");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
/*
     ...v means unlimited parameters of int array or string
 */