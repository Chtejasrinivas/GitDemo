import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class BFS 
{
static int n;
static int[] visited= new int[10];
static int[][] cost= new int[10][10];
public static void bfs(int v)
{
    Queue<Integer> q = new LinkedList<>();
    visited[v]=1;
    q.offer(v);
    while(!q.isEmpty())
    {
        int u =q.poll();
        System.out.println(u+" ");
        for(v=1;v<=n;v++)
        {
            for(int w=1;w<=n;w++)
            {
                if(visited[w]==0 && cost[v][w]==1)
                {
                    visited[w]=1;
                    q.offer(w);
                }
            }
        }
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n:");
    n=sc.nextInt();
    System.out.println("Enter 1 if there is an edge");
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            System.out.println("Enter from "+i+" to:"+j);
            cost[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<=n;i++) visited[i]=0;
    System.out.print("Enter start vertex:");
    int start=sc.nextInt();
    bfs(start);
}
}
