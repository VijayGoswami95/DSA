import java.util.Scanner;

/**
 * Parentheses
 */
public class Parentheses {
    public static void main(String[] args) {  
        StringBuilder str = new StringBuilder();
        // char openP ='(';
        // char closeP =')';
        String p= "()";
        char openP = p.charAt(0);
        char closeP = p.charAt(1);

        System.out.print("Enter the length of array between 1 to 8 :-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            str.append(openP);
            str.append(closeP);   
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(str);

    }

}