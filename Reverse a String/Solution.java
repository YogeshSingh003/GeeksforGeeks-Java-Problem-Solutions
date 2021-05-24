class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        char[] s = str.toCharArray();
            for(int i = s.length;i>s.length/2;i--){
                char k = s[i-1];
                s[i-1] = s[s.length-i];
                s[s.length-i] = k;
            }
            String string = new String(s);
        return string;
    }
}
