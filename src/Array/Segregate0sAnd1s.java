package Array;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int [] arr = {1,0,0,0,1,1,1,0,1,0,1,1};
        int numOf0s = 0;
        int numOf1s = 0;
        for(int ele : arr) {
            if (ele == 0) numOf0s += 1;
            else numOf1s += 1;
        }
        System.out.println(numOf0s);
        System.out.println(numOf1s);
        for(int i=0; i<numOf0s; i++) arr[i] = 0;
        for(int i=numOf0s; i<arr.length; i++) arr[i] = 1;
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
