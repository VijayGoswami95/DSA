public class LinearSearch {
    public int search(int n,int len,int m, int arr[])
    {
        if(n==len && arr[n]!=m)
        {
            // System.out.println("The Array does not have value "+m);
            return -1;
        }
        if(arr[n]==m)
        {
            return n;
        }
        return search(n+1,len,m,arr);
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        int m =5;
        int n=1;
        int len= arr.length;
        LinearSearch lr = new LinearSearch();
        int c=lr.search(n,len,m,arr);
        if(c==-1)
        {
            System.out.println("Value not found in array");
        }
        else
        {
            System.out.println("The value "+m+" is found at "+c+" index");
        }
        // System.out.println(c);
    }
}
