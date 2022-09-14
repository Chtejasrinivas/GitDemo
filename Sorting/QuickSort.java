public class QuickSort {
    public static void quickSort(int[] arr,int leftIndex,int rightIndex)
    {
        if(leftIndex>=rightIndex)
        {
            return;
        }
        int pivot = arr[arr.length/2];
        int leftPointer=leftIndex;
        int rightPointer=rightIndex;
        while(leftPointer<rightPointer)
        {
            while(arr[leftPointer]<=pivot && leftPointer<rightPointer)
            {
                leftPointer++;
            }
            while(arr[rightPointer]>=pivot && leftPointer<rightPointer)
            {
                rightPointer--;
            }
        swap(arr,leftPointer,rightPointer);
        }
        swap(arr,leftPointer,rightIndex);
        quickSort(arr,leftIndex,leftPointer-1);
        quickSort(arr,rightIndex+1,rightIndex);
    }
    public static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
     {
        int[] arr={4,2,5,1,1,3,25,0,12,45,41};

        System.out.println("Before Sorting");

        printArray(arr);

        quickSort(arr,0,arr.length-1);

        System.out.println("After Sorting");

        printArray(arr);
    } 
}
