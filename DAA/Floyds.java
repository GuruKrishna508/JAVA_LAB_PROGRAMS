package DAA;
import java.util.*;

public class Floyds {
    static int n;
    static int[][] a;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        n=in.nextInt();
        a=new int[n][n];
        System.out.println("enter the cost matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][i]=in.nextInt();
            }
        }
        floyds();
        print_Matrix();
        in.close();
        
}
  static void floyds(){
    for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][k]+a[k][j]<a[i][j]){
                    a[i][j]=a[i][k]+a[k][j];
                }
            }
        }
    }}
    static void print_Matrix(){
        System.out.println("****************FLOYDS ALGORITHM**********************");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }

    
  





}

