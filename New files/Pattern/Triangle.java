/**
 * Triangle
 */
public class Triangle {

    public static void main(String[] args) {
        int n=7;
        int m=4;
        for(int i=1; i<=4;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(j==(n/2))
                {
                    System.out.print(i+" ");
                }
                else if(i==m)
                {
                    System.out.print(i+" ");
                    
                }
                else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}