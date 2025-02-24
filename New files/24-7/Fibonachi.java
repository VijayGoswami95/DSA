public class Fibonachi {
    public int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        // else if(n==1)
        // {
        //     return 1;
        // }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Fibonachi fb = new Fibonachi();
        System.out.println(fb.fib(5));
    }
}
