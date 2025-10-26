
import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
       int[] a={4,3,5,2,8};
       bubble(a);
    }
    static void bubble(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            boolean swaped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaped=true;
                }
            }
            if(!swaped)
            break;
        }
     System.out.println(Arrays.toString(arr));
    }
}
/*
 * some key points about bubble sort
 * 1)bs is also called as exchange sort or sinking sort
 * 2)it is also called as stable sort because 30,10[1],20,10[2]=>10[1],10[2],20,30
 * 3)its space complexity o(1),time complexity o(n^2)
 */