package Array;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] arr = {3,4,5,67,8,3,45,75};
        change(arr);
        System.out.println(arr[3]+","+arr[6]+","+arr[7]);
    }
    public static void change(int[] arr){
        arr[3]=6;
        arr[6]=9;
        arr[7]=2;
    }
}
