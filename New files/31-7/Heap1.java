import java.util.PriorityQueue;

/**
 * H1
 */
public class Heap1 {
    public static void main(String[] args) {   
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int arr []={2,5,4,6,3};
        int len = arr.length;
        int k = 3;
        // push== add;
        // top== peek;
        // pop==poll
        for(int i=0;i<len;i++)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
}