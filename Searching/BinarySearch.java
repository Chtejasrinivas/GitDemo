import java.util.Random;
class BinarySearch
{
    static int binarySearch(int[] nums,int target)
    {
        int start=0;
        int end=nums.length - 1;
        while(start<=end)
        {
            int mid=start + (end - start) /2 ;
            if(nums[mid]==target)
            return mid+1;
            else if(nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
    static void printArray(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        System.out.print(nums[i]+" ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr= new int[9];
        Random rd = new Random();
        for(int i=0;i<arr.length;i++)
        {
         arr[i]=rd.nextInt(10);
        }  
        int target=rd.nextInt(10);
        System.out.print("Array is:");
        printArray(arr);
        System.out.println("Target element is:"+target);
        System.out.print("Result of Searching is:");
        System.out.println(binarySearch(arr,target));
    }
}