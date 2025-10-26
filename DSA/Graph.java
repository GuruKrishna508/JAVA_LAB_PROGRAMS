package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//----------------------------------------------------------------------------------------------------------------------------------
class Edge{
    int src,dest;
    public Edge(int src,int dest){
        this.src=src;
        this.dest=dest;
    }
}
//-------------------------------------------------------------------------------------------------------------------------------------------
public class Graph {
    static ArrayList<Edge>[] graph;
    static void createGraph(int v){
        graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
         graph[1].add(new Edge(1,0));
    }
//----------------------------------------------------------------------------------------------------------------------------------
    static void printGraph(){
        for(int i=0;i<graph.length;i++){
            System.out.println("node:"+i);
            for(Edge e:graph[i]){
                System.out.println(e.src+"->"+e.dest);
            }
            for(Edge e:graph[0]){
                System.out.println(e.dest);
            }
        }
    }
//---------------------------------------------------------------------------------------------------------------------------------
    static void bfs(int v){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean[] vis=new boolean[v];
        while(!q.isEmpty()){
            int cur= q.remove();
            if(vis[cur]==false){
                System.out.print(cur+" ");
                vis[cur]=true;
                for(Edge e:graph[cur]){
                    q.add(e.dest);
                }
        }}
    }
//---------------------------------------------------------------------------------------------------------------------------------
 static void dfs(int cur,boolean[] vis){
    if(vis[cur]==true)return ;
    System.out.print(cur+" ");
    vis[cur]=true;
    for(Edge e:graph[cur]){
        if(!vis[e.dest]){
        dfs(e.dest,vis);}
    }

 }
 //-----------------------------------------------------------------------------------------------------------------------------------
public static void main(String[] args){
        createGraph(2);
        printGraph();
        bfs(2);
        dfs(0,new boolean[2]);

    }
}
