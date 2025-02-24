import java.util.Scanner;
class SumNum
{
    int num1,num2,sum;
    Scanner sc= new Scanner(System.in);
    void input(){
        System.out.println("Enter the first number:- ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number:- ");
        num2 = sc.nextInt();
    }
    void add(){
        input();
        sum = num1+num2;
        System.out.println("The Sum of "+num1+" and "+num2+" is :- "+sum);
    }
    public static void main(String[] args) {
       SumNum obj1 = new SumNum();
    //    obj1.input();
       obj1.add();
    }
}