public class ReverseArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int n =arr.length;
        int temp = 0;
        int revNum = n;
        for(int i=0; i<n/2; i++)
        {
            temp = arr[i];
            arr[i]= arr[n-1];
            arr[n-1]=temp;
            n--;
        }
        for(int j=0;j<revNum;j++)
    {
        System.out.print(arr[j]+" ");
    }
    }
}
