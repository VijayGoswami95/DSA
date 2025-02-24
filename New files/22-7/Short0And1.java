public class Short0And1 {
    public static void main(String[] args) {
        int arr[]= {0,1,1,0,0,1,0,1};
        // int arr[]={4,2,1,5,3,6};
        int len = arr.length;
        int s = 0;
        int e= len-1;
        while(s!=e)
        {
            if(arr[s]<arr[e]){
                s++;
            }
            else if(arr[s]==arr[e])
            {
                e--;
            }
            else if(arr[s]> arr[e])
            {
                int temp = arr[s];
                arr[s]= arr[e];
                arr[e]=temp;
            }
            else{
                System.out.println("Something went wrong during compilation.");
            }
        }
        for(int i =0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
