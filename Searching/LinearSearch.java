
import java.util.Random;
import java.util.Scanner;
class LinearSearch
{
    public static int linearSearch(int[] arr, int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target)
            {
            return i+1;
            }
        }
        return -1;
    }
    public static void printArray(int[] nums)
    {
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rd = new Random();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= rd.nextInt(100);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element:");
        int target=sc.nextInt();
        sc.close();
        int res=linearSearch(arr,target);
        if(res>0) 
        {
            System.out.println("You won the game ");
            System.out.print("The array is:");
            printArray(arr);
            System.out.println("The element found at "+res);
        }
        else
        {
            System.out.println("You lost the game");
            System.out.print("The array is:");
            printArray(arr);
        }
    }
}