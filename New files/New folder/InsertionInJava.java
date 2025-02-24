public class InsertionInJava {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7,8};
        int pos = 2;
        for(int i = arr.length-1; i>=pos; i--)
        {
            arr[i]= arr[i-1];
            
        }
        arr[pos]= 25;
        for( int j= 0;j<arr.length; j++)
    {
        System.out.print(arr[j] +" ");
    }
    }
}
