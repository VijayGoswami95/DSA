import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicte {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,1,2,3};
        Set<Integer> s = new HashSet<>();
        for(int i : arr)
        {
            // if(s.add(i)==false)
            // {
            //     System.out.print(i+" ");
            // }
            s.add(i);
            System.out.print(i+" ");
           
        }
        for(int j =0; j<1; j++)
        {
            System.out.print(s+" ");
        }

    }
}
