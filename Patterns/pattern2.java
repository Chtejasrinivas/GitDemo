public class pattern2 
{
    /*
     The pattern is 
     for n=4
     *
     * *
     * * *
     * * * *
     */
    static void pattern(int n)
    {
        // as there as total n rows run outer loop for n times 
        for(int rows=1;rows<=n;rows++)
        {
            // as in first row we have 1 star
            // in second row we have 2 stars
            // .
            // .
            // in nth row we have n stars
            for(int cols=1;cols<=rows;cols++)
            {
                System.out.print("*  ");
            }
            // for new line we have
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
