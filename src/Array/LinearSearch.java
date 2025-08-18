/*
Ques: Find the Element 'x' in the Array. Take Array and x as input.
 */
package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,45,32,65,76,45,24,98,71};
        int x = 71;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Not Present");
        }
        else
            System.out.println("Here it is!");
    }
}
