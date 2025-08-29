/*
Topic: Variable length Arguments.
 */
package Methods;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,3,5,6,7,4,9);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
/*
     ...v means unlimited parameters of int array or string
 */