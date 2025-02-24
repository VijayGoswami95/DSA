import java.util.Scanner;

public class Nineoct 
{
    int a,b,c;
    void display()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    a=sc.nextInt();
    System.out.println("Enter the second Number:");
    b=sc.nextInt();
    sc.close();
    }
    void sum()
    {
        c=a+b;
        System.out.println("The sum is "+c);
    }
    public static void main(String args[])
    {
        System.out.println("Hello");
        Nineoct f=new Nineoct();
        f.display();
        f.sum();
    }
}
