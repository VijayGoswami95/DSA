public class BubbleSort {
    public static void main(String[] args) {
        int arr []={4,3,1,7,9,2,5};
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
            for(int k = 0 ; k< len ; k++)
            {
                System.out.print(arr[k] +" ");
            }
            System.out.println();
            // Time complixity for this algo
            // For best case O(n) For Worst case O(n^2)
        }
    }
}
