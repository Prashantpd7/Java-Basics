/*Given an array of marks of students,
if the mark of any student is less then 35 print its roll number.
Roll number here refers to the index of the array.*/

package Array;

public class marks {
    public static void main(String[] args) {
        int[] mark = {40,56,74,32,19,86,57,31};
        for(int i=0;i<mark.length;i++){
            if(mark[i]<35){
                System.out.print(i+" ");
            }
        }
    }
}
