// Function Scope and Block Scope.
package Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            /* int a = 30;  (Error because you can't initialize value
                            of any variable inside block scope if it
                            is initialized outside the block scope.)
            */
            a = 30;  // (We can change its value)
            int c = 40; // (We can initialize new variable)
        }
        /* System.out.println(c); (We can not print value of block scope
                                   outside the block)

           System.out.println(num); (num is in random method so we
                                     can't print it in main method)
        */
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);/* (We can print value of variable in
                                    the same method but not in different
                                    method.)
                                 */
       /* System.out.println(b); (b is initialized in main method so
                                  we can't print it in random method)
       */
    }
}

