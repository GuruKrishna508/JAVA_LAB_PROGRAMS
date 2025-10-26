package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Edge{
    int src,dest;
    public Edge(int s,int d){
        this.src=s;
        this.dest=d;
    }
}

public class bfs {
    static ArrayList<Edge>[] graph;
    static void createGraph(int v){
        graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 0));
      
    }
    static void bfs(int v,int s){
        boolean[] vis=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int cur=q.remove();
            if(vis[cur]==false){
                System.out.print(cur+" ");
                vis[cur]=true;
                for(Edge e:graph[cur]){
                    q.add(e.dest);
                }
            
            }

        }

    }
    public static void main(String[] args){
        createGraph(4);
        bfs(4,0);
        
    }
    
}
