
import java.util.Scanner;
public class Warshall{
    static int n;
    static int[][] a;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        n=in.nextInt();
        a=new int[n][n];
        System.out.println("Enter the adjacency matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        getclosure();
        printMatrix();
    }
    static void getclosure(){
        int i,j,k;
        for(k=0;k<n;k++){
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(a[i][j]==1 || a[i][k]==1 && a[k][j]==1){
                        a[i][j]=1;

                    }
                }
            }
        }}
        static void printMatrix(){
            System.out.println("Tranitive closure:-");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.println(a[i][j]);
                }
                System.out.println();
            }
        }
    }

