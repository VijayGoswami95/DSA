public class QuickSort {
    static void printArray(int arr[],int len)
    {
        for(int i =0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void sort(int arr[], int l, int r)
    {
        
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,6,4};
        int len =arr.length;
        System.out.println("Given Array is-: ");
        printArray(arr,len);
        sort(arr,0,len-1);
        // We prefer Quick Sort over merge sort because the 
        // Space Complixity of Quick Sort is O(1)
        // Time complixity for both algo is same O(nlog(n))
    }
}
