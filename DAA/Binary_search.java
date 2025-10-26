
import java.util.*;
public class Binary_search {
    public static void main(String[] args) {
        int[] a={2,3,5,6,7,8,9,10};
        int low,high,mid,key;
        key=9;
        low=0;
        high=a.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==key)
            {System.out.println("Key found at index "+mid);
            break;}
            else if(key>a[mid]){
                low=mid+1;
            }
            else{
                high=mid+1;
            }
           
        }
    }
    
}
