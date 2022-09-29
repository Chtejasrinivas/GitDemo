public class nQueen {
    static int[] x;
    static int n;
    public static void nqueen(int k)
    {
        for(int i=1;i<=n;i++)
        {
            if(place(k,i)==1) x[k]=i;
            if(k==n)
            {
                for(int j=1;j<=k;j++)
                {
                    System.out.println(x[j]);
                }
            }
            else
            {
                nqueen(k+1);
            }
        }
    }
    public static int place(int k,int l)
    {
        for(int i=1;i<k;i++)
        {
            if(x[i]==l || Math.abs(i-k)==Math.abs(l-x[i]))
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        {
            int n=4;
            nqueen(1);
        }
    }
}
