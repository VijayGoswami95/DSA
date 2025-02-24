public class SecondLargestnum {
    public static void main(String[] args) {
        int arr[]= {5,10,3,8,14,14,12,1};
        int max= arr[0];
        int tesja=0;
        for(int i =1; i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                tesja= max;
                max=arr[i];
            }
            else if(tesja<arr[i]&& arr[i]!=max){
                tesja = arr[i];

            }
        }
        System.out.println("Maximum value = "+max);
        System.out.println("Second max= "+tesja);
    }
}
