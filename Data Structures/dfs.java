import java.util.*;

class dfs 
{
static int n;
static int[] visited= new int[10];
static int[][] cost= new int[10][10];
  public static void DFS(int v)
  {
    visited[v]=1;
    for(int u=1;u<=n;u++)
    {
        if(cost[u][v]==1 && visited[u]==0)
        {
            System.out.println(v+"->"+u);
            DFS(u);
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
    DFS(start);
  }
}
