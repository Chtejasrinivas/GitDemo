// consider first element as sorted and for the next elements
// take the next first element as temp and compare with the first element
// if the temp element is less than the sorted element then increment the index of that sorted element by 1
// and now store this temp element in that sorted position list
// for more information watch the youtube video 
// https://www.youtube.com/watch?v=0lOnnd50cGI&ab_channel=CodingwithJohn

public class InsertionSort {
    public static void insertionSort(int[] inputArray)
    {
        for(int i=1;i<inputArray.length;i++)
        {
            int temp=inputArray[i];
            int j=i-1;
            while(j>=0 && inputArray[j]>temp)
            {
                inputArray[j+1]=inputArray[j];
                j--;
            }
            inputArray[j+1]=temp;
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
        int[] arr={4,2,5,1,1,3,25,0,12,45,41};
        System.out.println("Before Sorting");
        printArray(arr);
        insertionSort(arr);
        System.out.println("After Sorting");
        printArray(arr);
    } 
}
