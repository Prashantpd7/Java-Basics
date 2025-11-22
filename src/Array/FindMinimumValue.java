package Array;
public class FindMinimumValue {
    public static void main(String[] args) {
        int[] arr = {3,5,-1,9,8,4,2};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]) min=arr[i];
        }
        System.out.println(min);
    }
}
