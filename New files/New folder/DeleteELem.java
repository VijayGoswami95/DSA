public class DeleteELem {
    public static void main(String[] args) {
        int arr[] = {2,34,7,5,9,31,95};
        int pos = 3;
        int value = 5;
        for( int i=0; i<arr.length; i++)
        {
            if(arr[i]== value)
            {
                for(int j= pos; j<arr.length-1; j++)
                {
                    arr[j]= arr[j+1];
                }
            }
        }
        
        for(int k=0; k<arr.length; k++)
        {
            System.out.print(arr[k]+ " ");
        }
    }
}
