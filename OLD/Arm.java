public class arm {
    public static void main(String args[])
    {
        String s1 = "Hello how are you";
        String s3 = "What is your name??";
        String s2 = s1.replace("you", "You");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.endsWith("you"));
        System.out.println(s1.contains("how"));
        System.out.println(s2.indexOf("You"));
        System.out.println(String.join(s1,s3));  
        
    }
}
