public class ReverseArr {
    public void reverse(int n,int len, int arr[])
    {
        if(n==0)
        {
            return;
        }
        return ;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int len= arr.length;
        int n=0;
        ReverseArr rev = new ReverseArr();
        // System.out.println(rev.reverse(n,len,arr));``
        rev.reverse(n,len,arr);
        for(int i =0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
