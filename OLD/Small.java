import java.util.Scanner;
public class Small 
{
    public static void main(String[] args)
    {
        int[] arr=new int[5];
        int sma=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all the values in an array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=1;i<arr.length;i++)
        {
             if(arr[i]<arr[0])
             {
                arr[0]=arr[i];
             } 
            sma=arr[0];       
        }       
        System.out.println("The smallest variable is :"+sma);
    }
}
