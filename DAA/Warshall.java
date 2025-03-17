package DAA;
import java.util.Scanner;
public class Warshall {
    static int[][] a;
    static int n;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numbr of vertices");
        n=in.nextInt();
        a=new int[n][n];
        System.out.println("Enter the cost matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        getClosure();
        printMatrix();
        in.close();
    }
    static void getClosure(){
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(a[i][j]==1 || a[i][k]==1 && a[k][j]==1){
                        a[i][j]=1;
                    }
                }
            }
        }
    }
    static void printMatrix(){
      System.out.println("Transitive closure of givien matrix is:-");
      for(int i=0;i<n;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
    }
    
}
