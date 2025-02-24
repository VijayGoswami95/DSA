import java.util.Scanner;
class Array
{
    public static void main(String[] args)
    {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the value of array :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to count :");
        int g=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==g)
            {
                count++;
            }
        }

        if(count!=0)
        {
            System.out.println("count is :- "+count);
        }
        else
        { 
            System.out.println("not found");
        }
        sc.close();
    }
}
