class Factorial{

    public int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n* fact(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        Factorial rc = new Factorial();
        rc.fact(n);
        System.out.println(rc.fact(n));
    }
}