/*
Ques: Find the doublet in the array  whose sum is equal to the given value x.(Two sum)
 */
package Array;

public class Doublet {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,9};
        int x = 13;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int a = 0;
                if(arr[i]+arr[j]==x){
                    a = arr[i]+arr[j];
                    System.out.println(arr[i]+" + "+arr[j]+" = "+a);
                }
            }
        }
    }
}
