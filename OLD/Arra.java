import java.util.Scanner;

public class Arra 
{
    public static void main(String args[])
    {
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of array :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
}
