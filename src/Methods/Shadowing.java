/*
Topic: Shadowing (If anything is initialized before psvm then
                  it becomes parent of everything which comes
                  under that)
 */

package Methods;

public class Shadowing {
    static int x = 10; // this will shadow on line 7.
    public static void main(String[] args) {
        System.out.println(x); // x = 10
        int x = 20;
        System.out.println(x); // x = 20
        fun(); // x = 10
    }
    static void fun(){
        System.out.println(x); // x = 10
    }
}
