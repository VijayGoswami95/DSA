public class TowerOfHanoi {
    public void tower( int n , char S, char D, char H)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            tower(n-1, S, H, D);
            System.out.println("Move disk "+n+ " from rod "+S+" to rod "+D);
            tower(n-1, H, D, S);
        }
    }
    public static void main(String[] args) {
        int n=4;
        TowerOfHanoi twr = new TowerOfHanoi();
        twr.tower(n, 'S', 'D', 'H');
        // tower(n, 'S', 'D', 'H');
    }
}
