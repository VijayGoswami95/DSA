import java.util.Scanner;

class Apple
{
    int a,b;
    void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        sc.close();
    }
    void sum()
    {
        int c;
        c=a+b;
        System.out.println("The sum is :"+c);
    }
    public static void main(String args[])
    {
        Apple to= new Apple();
        to.read();
        to.sum();
    }
}