
import java.util.*;
class Quick_sort{
    static final int  max=10005;
    static int[] a=new int[max];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Enter the number of elements");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            a[i]=random.nextInt(1000);
        }
        System.out.println("unsorted array");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        long start_time=System.nanoTime();
        quick_algo(0,n-1);
        long stop_time=System.nanoTime();
        long elapsed_time=stop_time-start_time;
        System.out.println("Time complexity:-"+(double)elapsed_time/1000000);
        System.out.println("Sorted array [Quick sort]");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
      in.close();
    }
    static void quick_algo(int p,int r){
        int pivot,temp,i,j;
        if(p<r){
        pivot=a[p];
        i=p;
        j=r;
        while(true){
            i++;
            while(a[i]<pivot && i<r){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }
            if(i<j){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            else{
                break;
            }
        }
        a[p]=a[j];
        a[j]=pivot;
        quick_algo(p,j-1);
        quick_algo(j+1, r);
    }}}

