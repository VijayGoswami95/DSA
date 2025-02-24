public class AnnagramString {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        int len1= str1.length();
        int len2 = str2.length();
        int count=0;
        if(len1==len2)
        {
            for(int i =0; i<len1; i++)
            {
                for(int j=0;j<len2;j++)
                {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        count++;
                    }
                }
            }
            if(count==len1)
            {
                System.out.println("String is annagram.");
            }
            else
            {
                System.out.println("String is not annagram.");
            }
        }
        else{
            System.out.println("String length is not equal.");

        }

    }
}
