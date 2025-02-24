public class Array3d {
    public static void main(String args[])
    {
        int [][][] arr = {{{1,3,2,4,6},{4,5,2,7,9},{1,2,6,7,3}},{{32,64,75,34,85},{54,22,33,66,44},{11,53,87,96,24}}};
        for(int i = 0; i<2;i++)
        {
            for(int j = 0; j<3; j++)
            {
                for(int k=0; k<=4;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
