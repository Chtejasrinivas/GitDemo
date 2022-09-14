// here we divide the entire array into two parts namely sorted and unsorted.
// we take the minimum element in the unsorted part of array and add to the sorted part of array 
//before adding we swap the first element in the unsorted part of the array with the 
// index at which we got the minimum element

// refer att notes for more details...


public class SelectionSort {
    public static void selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            int minimum_index=i;
            int minimum_element=arr[i];
            for(int j = i+1; j < n; j++)
            {
                if(arr[j]<minimum_element)
                {
                    minimum_element=arr[j];
                    minimum_index=j;
                }
            }
            arr[minimum_index]=arr[i];
            arr[i]=minimum_element;
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
        selectionSort(arr);
        System.out.println("After Sorting");
        printArray(arr);
}

}
