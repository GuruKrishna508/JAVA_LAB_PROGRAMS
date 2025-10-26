import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={9,5,8,2,7,3,1,6,4};
        cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void cycle_sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct_index=arr[i]-1;
            if(i!=correct_index)
           { swap(arr,i,correct_index);}
           else{
            i++;
           }
        }
    }
    static void swap(int[] arr,int first,int next){
        int temp=arr[first];
        arr[first]=arr[next];
        arr[next]=temp;
    }
}
