public class DuplicateVal {
    public static void main(String args[])
    {
        int [] arr = { 2,4,5,6,7,8,3,3,6,7,3,1,2};
        for(int i = 0; i<arr.length; i++)
        {
            for(int j= i+1; j<arr.length; j++)
            {
                if(arr[i]== arr[j] && i!=j)
                {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
}
