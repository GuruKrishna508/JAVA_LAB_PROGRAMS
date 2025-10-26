package daa;
import java.util.*;

public class Main {
    static int max = 20;
    static int n;
    static int[][] cost;
    static int[] parent = new int[max];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("***************Kruskals Algorithm***********************");
        readmatrix();
        kruskalalgo();
    }

    static void readmatrix() {
        System.out.println("Enter the number of vertices:");
        n = in.nextInt();
        cost = new int[max][max];
        System.out.println("Enter the cost matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                cost[i][j] = in.nextInt();
                if (cost[i][j] == 0)
                    cost[i][j] = 999;
            }
        }
    }

    static void kruskalalgo() {
        int a, b, u, v, i, j, min, mincost, ne;
        a = b = u = v = mincost = 0;
        ne = 1;

        while (ne < n) {
            min = 999; // Reset min before each edge selection
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    if (cost[i][j] < min) {
                        min = cost[i][j];
                        u = a = i;
                        v = b = j;
                    }
                }
            }

            u = find(u);
            v = find(v);
            if (u != v) {
                uni(u, v);
                System.out.println(ne++ + " edge (" + a + " " + b + "): " + min);
                mincost += min;
            }
            cost[a][b] = cost[b][a] = 999;
        }

        System.out.println("Minimum cost: " + mincost);
    }

    static int find(int i) {
        while (parent[i] > 0)
            i = parent[i];
        return i;
    }

    static void uni(int i, int j) {
        parent[j] = i;
    }
}
