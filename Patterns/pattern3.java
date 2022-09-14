public class pattern3 
{
     /*
     The pattern is 
     for n=4
     * * * *
     * * *
     * * 
     * 
     */
    static void pattern(int n)
    {
        //as there are 4 rows so we have
        for(int rows=1;rows<=n;rows++)
        {
            for(int cols=n;cols>=rows;cols--)
            {
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        pattern(4);
    }
}
