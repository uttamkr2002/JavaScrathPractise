class Stringtiu {
 
    // Returns true if s1 is substring of s2
    static int isSubstring(String s1, String s2)
    {
        int M = s1.length();  // substring
        int N = s2.length();  // main string
 
        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N ; i++) {
            int k=i;
            int j;
 
            /* For current index i, check for
            pattern match */
            for (j = 0; j < M; j++){
                if (s2.charAt(k ) != s1.charAt(j)) //??i+j 0+0 =g!,e!,e!,k!,s!,//,f=,j=0,o=o,j=1,j=2
                    break;
                    k++;
            }
            if (j == M)
                return i;
        }
 
        return -1;
    }
 
    /* Driver code */
    public static void main(String args[])
    {
        String s1 = "for";
        String s2 = "geeksfgeeksforgeeks";
 
        int res = isSubstring(s1, s2);
 
        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index " + res);
    }
}
 

