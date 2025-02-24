public class ReverseString1 {
    public static void main(String[] args) {
        String str = "Hello, World";
        char stack[] = new char[str.length()];
        int top=-1;
        for(int i =0; i<str.length();i++)
        {
            stack[++top]= str.charAt(i);
        }
        for(int i=top; i>=0;i--)
        {
            System.out.print(stack[i]);
        }
    }
}
