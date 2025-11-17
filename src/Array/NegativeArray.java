package Array;

public class NegativeArray {
    public static void main(String[] args) {
        int[] arr = {2,-4,6,-8,5,9,-5,1};
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
