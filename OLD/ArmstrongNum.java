public class ArmstrongNum {
    public static void main(String args[])
    {
        int num = 153;
        int num3= num;
        // int num1= (num%10);
        // int num2= (num/10)%10;
        // int num3= ((num/10)/10)%10;
        // int Sum= num1*num1*num1 + num2*num2*num2 + num3*num3*num3;
        int Sum= 0;
        while(num>0){
            int newNum= num%10;
            int num1 = newNum*newNum*newNum;
            Sum = Sum+num1;
            num=num/10;
        }
        if(Sum == num3)
        {
            System.out.println("The number is armstrong number");
        }
        else
        {
            System.out.println("The number is not an armstrong number");
        }
    }  
}
