class Array {
    public static void main(String args[])
    {
        // int [] arr = new int[5];
        int arr2[]= {2,6,8,5,3,5,3,6,8,9,3};
        for(int i=0; i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }

        int [][] arr4= new int[2][2];
        arr4[0][0]= 34;
        arr4[0][1]= 53;
        arr4[1][0]= 43;
        arr4[1][1]= 52;
        System.out.println("\n"+ arr4[1][1]);
    }
}
