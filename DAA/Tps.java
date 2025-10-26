import java.util.*;
public class Tps {
    static final int inf=999;
    static int[][] dist;
    static int[][] dp;
    static int n;
    static int tsp(int mask,int pos){
        if(mask==(1<<n)-1)
        return dist[pos][0];
        if(dp[mask][pos]!=-1)
        return dp[mask][pos];
        int ans=inf;
        for(int city=0;city<n;city++){
          if((mask& 1<<city)==0){
            int newans=dist[pos][city]+tsp(mask | (1<<city),city);
            ans=Math.min(ans,newans);}
        }
        return dp[mask][pos]=ans;
    }
    
    
    public static void main(String[] args) {
        dist=new int[][]{
            {0,10,15,20},
            {10,0,035,25},
            {15,35,0,30},
            {20,25,30,0}
        };
        n=dist.length;
        dp=new int[1<<n][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int res=tsp(1,0);
        System.out.println(res);
        
    }
}

