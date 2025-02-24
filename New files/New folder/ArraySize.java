public class ArraySize {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,8,7};
        int b [] = {34,53,65,84,72,42,45,43};
        int a_length = a.length;
        int b_length= b.length;
        int c_length = a_length+ b_length;
        int [] c = new int[c_length];
        
        for( int i = 0 ; i<a.length ; i++)
        {
            c[i]= a[i];
        }
        for( int j =0;  j<b.length;j++)
        {
            c[a_length]=b[j];
            a_length++;
        }
        for(int i=0; i<c.length; i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
