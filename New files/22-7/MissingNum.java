/**
 * MissingNum
 */
public class MissingNum {
    public static void main(String[] args) {
        // int [] arr = new int [6];
        int [] newArr = {1,2,4,5};
        int n = 6;
        int sum=0;
        for(int i =0; i<4; i++)
        {
            sum+=newArr[i];
        }
        int missingNumb =  (n*(n-1)/2) - sum;
        System.out.println(missingNumb);
    }
}