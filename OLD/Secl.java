import java.util.Scanner;

public class Secl {
    
  public static void main(String[] args)
    {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of array :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
        int secondlargest=0;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {  secondlargest=largest;
                largest=arr[i];
            }
        }

            System.out.println("Largest is :- "+largest);
            System.out.println("secondlargest is :- "+secondlargest);
        sc.close();
    }


}
