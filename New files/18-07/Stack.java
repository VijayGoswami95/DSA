import java.util.Scanner;

// import javax.lang.model.type.NullType;
public class Stack{
    public static void main(String[] args) {
        int size= 5;
        int [] stack = new int[size];
        int top =-1;
        
        Scanner sc = new Scanner(System.in);
        
        // int ch = sc.nextInt(); 
        while(true)
        {
            System.out.println("************************OPTIONS*************************");
            System.out.println("Enter 1 for adding an elements");
            System.out.println("Enter 2 for deleting an elements");
            System.out.println("Enter 3 for displaying elements");
            System.out.println("Enter 4 to peak");
            System.out.println("Enter 5 to exit an elements");
            System.out.print("Enter your choice : - ");
           int ch = sc.nextInt();
           
           if(ch==1)
           {
            if(top==size-1)
            {
                System.out.println("Stack if full");
            }
            else{
                System.out.print("Enter the value :-");
                stack[++top]=sc.nextInt();
            }
           }
           else if(ch==2)
           {
            if(top==-1)
            {
                System.out.println("Stack is empty");
            }
            else{
                stack[top]=0;
                top--;
            }
           }
           else if(ch==3)
           {
            if(top==-1)
            {
                System.out.println("Stack is empty");
            }
            else{
                for(int i = 0 ; i<=top;i++)
                {
                    System.out.print(stack[i]+" ");
                }
                System.out.println();
            }
           }
           else if(ch==4)
           {
            if(top==-1)
            {
                System.out.println("Stack is empty");
            }
            else{
                System.out.println("The top element of stack is :- "+stack[top]);
            }
           }
 
            else if(ch ==5)
           {
            break;
           }
           else
           {
            System.out.println("You should enter 1 or 5");
           }
        }
    }
    
}


