public class BinarySearchTry {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6};
        int s=0;
        int e=arr.length-1;
        int key=4;
        int result=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==key)
            {
                result=mid;
                s=mid+1;

            }
            else if(arr[mid]<key)
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        if(result != -1)
        {
            System.out.println("element found at "  +result+  " index");
        }
        else{
            System.out.println("element not found");
        }
    }
}
