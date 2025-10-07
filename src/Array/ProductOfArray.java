package Array;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = {3,7,8,3};
        int Product = 1;
        for(int i=0; i<arr.length; i++){
            Product *= arr[i];
        }
        System.out.println(Product);
    }
}
