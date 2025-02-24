import java.util.Scanner;

public class PalindromStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : - ");
        String str = sc.nextLine();
        int len = str.length();
        int n= len;
        int count =0;
        for(int i=0; i<len/2;i++)
        {
            if(str.charAt(i)==str.charAt(n-1))
            {
                count++;
                n--;
            }
        }
        if(count!=len/2)
        {
            System.out.println("The String is not palindrom");
        }
        else{
            System.out.println("The String is  a palindrom.");
        }
        sc.close();

    }
}
