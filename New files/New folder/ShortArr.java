public class ShortArr {
    public static void main(String args[])
    {
        int [] arr = {2,3,5,4,6,7,2,8};
        int temp;
        for(int i= 0 ; i<arr.length;i++)
        {
            // for(int j=0 ; j<arr.length; j++)
            for(int j=i+1 ; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        for(int a= 0; a<arr.length; a++)
        {
            System.out.print(arr[a]+" ");
        }
    }
}
