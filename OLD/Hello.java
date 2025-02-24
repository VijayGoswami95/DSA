import java.util.Scanner;

class Hello
{
    int a,b,c;
    void read()
    {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the first value :");
    a=sc.nextInt();
    System.out.print("Enter the second number :");
    b=sc.nextInt();
    sc.close();
    }
    void sum()
    {
        c=a+b;
        System.out.println("The sum is :" +c);
    }
    public static void main(String []args)
    {
        Hello o= new Hello();
        o.read();
        o.sum();
    }
}