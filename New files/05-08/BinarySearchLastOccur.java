/**
 * BinarySearchLastOccur
 */
public class BinarySearchLastOccur {
    public static void main(String[] args) {
        int arr []={1,2,2,2,2};
        int len = arr.length;
        int t= 2;
        // int mid=len/2;
        int r=-1;
        int end = len-1;
        for(int start=0;start<=end;start++)
        {
            int mid =start+ (end-start)/2;
            if(arr[mid]== t)
            {
                if(arr[mid+1]==arr[mid])
                {
                    mid++;
                    
                    continue;
                }
                else
                {
                    r=mid;
                    break;
                }
            }
            else if(t>arr[mid])
            {
                start = mid+1;
            }
            else 
            {
                end= mid-1;
            }
            
        }
        System.out.println("The target has occured last at "+r+" index");
    }
}