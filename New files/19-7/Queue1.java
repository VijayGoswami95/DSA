import java.util.Scanner;

public class Queue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        int size = 5;
        int queue [] = new int[size];
        int front = 0;
        int rear = -1;
        int option = sc.nextInt();
        
        while(true)
        {
            switch(option)
            {
                case 1:
                if(rear== size-1)
                {
                    System.out.println("Queue is full");
                }
                else
                {
                    queue[++rear]= sc.nextInt();
                }
                break;
                case 2:
                if(rear==-1)
                {
                    System.out.println("Queue is empty");
                }
                else
                {
                    rear--;
                }
                break;
                case 3;
            }
        }
    }
}
