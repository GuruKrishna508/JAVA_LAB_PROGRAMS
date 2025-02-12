import java.util.Scanner;
public class ap6 {
    public static void main(String[] args) {
        //sum of arrays
        int[] arr=new int[5];
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the array elements:");
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        int sum=0;
        for(int e:arr){
            sum+=e;
        }
        System.out.println("The sum is "+sum);
    }
    
}
