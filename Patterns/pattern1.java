class pattern1
{
    /*The pattern is 
     for n=4
     * * * *
     * * * *
     * * * *
     * * * *
     */
    static void pattern(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       pattern(4);
    }
}