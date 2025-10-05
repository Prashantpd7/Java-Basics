package Array;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,9,8,11,5};
        int a=0,b=0;
        for(int i=0; i<arr.length; i++){
            a = arr[i];
            if(a>b){
                b=a;
            }
        }
        System.out.println(b+" ");
    }
}
