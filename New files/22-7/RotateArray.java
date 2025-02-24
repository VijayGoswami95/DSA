import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= {1,2,3,4,5};
        int n= 5;
        int temp=0;
        System.out.print("Enter how many times do you want to rotate the array :- ");
        int r=sc.nextInt();
        while(r>0){ 
            for(int i=0; i<arr.length-1; i++)
            {
                if(i==0)
                {
                    temp= arr[0];
                }
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]= temp;
            r--;
        }
        sc.close();
        System.out.println("Rotated array ");
        for(int j=0; j<n;j++)
        {
            System.out.print(arr[j] +" ");
        }
    }
}
