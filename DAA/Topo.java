
import java.util.*;
public class Topo{
    static int n,top=-1;
    static int[][] adj;
    static boolean[] visited;
    static int[] stack;
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("enter the number of vertices");
        n=in.nextInt();
        System.out.println("Enter the adjacency matix");
        adj=new int[n][n];
        visited=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                adj[i][j]=in.nextInt();
            }
        }
       for(int i=0;i<n;i++){
        if(!visited[i])
         dfs(i);
       }
       System.out.println("************TOPOLOGICAL SORT*****************");
       while(top!=-1){
        System.out.print(stack[top--]+" ");
       }
    }
    static void dfs(int v){
        stack=new int[n];
        visited[v]=true;
        for(int i=0;i<n;i++){
            if(adj[v][i]==1 && !visited[i])
            dfs(i);
        }
        stack[++top]=v;
    }

}