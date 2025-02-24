class Vowels{
    public static void main(String[] args) {
        String str = "HelloO";
        String str1="";
        for(int i =0;i<str.length(); i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            {
                continue;
            }
            else{
                // str1= str1.concat("h");
                // str1= str1.concat(str.charAt(i));
                
                str1 = str1+str.charAt(i);
            }
        }
        // str.replaceAll("aeiouAEIOU", "");
        System.out.println(str1);
    }
}