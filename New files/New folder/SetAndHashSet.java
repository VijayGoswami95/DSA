import java.util.HashSet;
import java.util.Set;

public class SetAndHashSet {
    public static void main(String[] args) {
        int arr [] = {2,3,4,6,7,6,3,};
        int arr2 []= {4,5,7,2,3,1,3,6};
        Set<Integer> s = new HashSet<>();

        for (int i : arr)
        {
            s.add(i);
            // System.out.print(i+" ");
        }
        System.out.println();
        for(int j : arr2)
        {
            if(s.add(j)==false)
            {
                System.out.print(j+" ");
            }
        }
    }
}
