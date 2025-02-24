public class MergeSort {
    static int mergeS(int arr[],int l, int m, int r)
    {
        if(m==1)
        {
            return arr[m];
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,6,3,1,5,4,9,7};
        int len = arr.length;
        int m = len/2;
        int l = m-1;
        int r= m+1;
        mergeS(arr,l,m,r);
    }
}
