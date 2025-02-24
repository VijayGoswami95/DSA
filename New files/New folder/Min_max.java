public class Min_max {
    public static void main(String args[])
    {
        int [] arr = {2,3,5,4,7,11,4};
        int max= arr[0];
        // int min= MAX_VALUE;

        for(int i = 0; i <=5; i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
    }
}
