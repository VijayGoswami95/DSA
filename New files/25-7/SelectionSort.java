class SelectionSort{
    public static void main(String[] args) {
        int arr[] = {1,4,3,6,2,6,1};
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j =i+1; j<len;j++)
            {
                if(arr[i]>arr[j])
                {
                    int min = arr[i];
                    arr[i]=arr[j];
                    arr[j]= min;
                }
                // System.out.print(arr[j] +" ");
            }
            
            for(int k=0; k<len;k++)
            {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
            // Time complixity for this algo
            // For best case O(^2) For Worst case O(n^2)
        }
    }
}