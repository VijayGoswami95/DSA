public class MultiplyA_B_Times {
    static int multiple(int a, int b)
    {
        if(b==0)
        {
            return 1;
        }
        return a*multiple(a,b-1);
    }
    public static void main(String[] args) {
        int a= 2,b=5;
        int c=multiple(a, b);
        System.out.println(c);
    }
}
