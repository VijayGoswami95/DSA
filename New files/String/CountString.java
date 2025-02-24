/**
 * CountString
 */
public class CountString {

    public static void main(String[] args) {
        int count =1;
        int max=0;
        // int secondMax =0;
        // char chr2=
        String str = "hjdbnabmnbnnsaba";
        int len = str.length();
        char chr = str.charAt(0);
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                }                
            }
            if(count>max)
            {
                max=count;
                chr = str.charAt(i);
            }
            // if(count==max)
            // {
            //     int secondMxa= count;
            //     char chr2 = str.charAt(i);
            //     System.out.println(chr2+" also has maximum frequency "+secondMxa +" times.");
            // }
            count=1;
        }
        System.out.println("The character "+chr+" has occured "+max+" time in the string. Which is maximum.");
    }
}