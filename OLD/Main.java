import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
    int n;
    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();

    if(n%2==0 && n>20){
        System.out.println("Weird");
    
    if(n%2==0&&n>=6&&n<=20){
        System.out.println("Not so Weird");
    }
    else if(n%2!=0){
        System.out.println("Not Weird");
    }}
    sc.close();
}
}
