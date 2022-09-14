
class bubbleSort
{
    public static void bubble(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={4,2,5,1,3,25,0,12,45,41};
        System.out.println("Before Sorting");
        printArray(arr);
        bubble(arr);
        System.out.println("After Sorting");
        printArray(arr);
    }
}