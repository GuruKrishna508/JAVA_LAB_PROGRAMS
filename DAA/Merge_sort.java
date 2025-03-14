package DAA;
import java.util.*;
public class Merge_sort {
    static final int max = 10005;
    static int[] a=new int[max];
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        Random random=new Random();
        System.out.println("enter the number of elements");
        int n=in.nextInt();
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=random.nextInt(1000);

        }
        System.out.println("Before sorting :");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        long start_time=System.nanoTime();
        merge_algo(0,n-1);
        long stop_time=System.nanoTime();
        merge_algo(0, n-1);
        long elapsed_time =start_time-stop_time;
        System.out.println("The time complexity is "+(double)elapsed_time/1000000);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void merge_algo(int low,int high){
        int mid;
        if(low<high){
            mid=(low+high)/2;
            merge_algo(low, mid);
            merge_algo(mid+1, high);
            merge(low,mid,high);
        }
    }
    static void merge(int low,int mid,int high){
        int[] b=new int[max];
        int i,j,h,k;
        i=h=low;
        j=mid+1;
        while((h<=mid) && (j<=high)){
            if(a[i]>a[j])
            b[i++]=a[h++];
            else
            b[i++]=a[j++];

        }
        if(h>mid){
            for(k=j;k<=high;k++){
                b[i++]=a[k];
            }
        }
      else{
        for(k=h;k<=mid;k++){
            b[i++]=a[k];
        }
        for(k=low;k<=high;k++){
            a[k]=b[k];
        }
      }
        
    }

}
/*
 * i j h k
 * i=>keeps track of the current position of the  resultant array/
 * j=>used to keep track or second subarray
 * h=>used to keep track of first subaray
 * k=>used to copy back to original array
 */
