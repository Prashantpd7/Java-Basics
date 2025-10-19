package Array;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        int element = list.get(1);
        System.out.println(element);

        list.add(1,4);
        System.out.println(list);

        list.set(0,5);
        System.out.println(list);

    }
}
