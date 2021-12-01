package dsaProblems;

public class Bayer_more_algo {
    static int no_of_characters=256;

    public static  void  patternSearch(String text,String pat )
    {
        int m=pat.length();
        int n=text.length();

        int bad_chars []=new int[no_of_characters];

        bad_huristic(pat,m,bad_chars);
        int shift=0;

        while(shift<=(n-m))
        {

            int j=(m-1);
            while (j>=0 && pat.charAt(j)==text.charAt(shift+j))
                j--;
            if (j<0)
            {
                System.out.println("pattern found at at shift s =:"+shift);
                shift+=(shift+m<n)?m-bad_chars[text.charAt(shift+m)]:1;

            }
            else shift+=Math.max( j-bad_chars[text.charAt(shift+j)],1 );


        }

    }

    private static void bad_huristic(String pat, int m, int[] bad_chars) {
        for (int i = 0; i <m ; i++) {
            bad_chars[i]=-1;

        }
        for (int i = 0; i <m ; i++) {
            bad_chars[(int)pat.charAt(i)]=i;

        }
    }

    public static void main(String[] args) {
        String text="ABAABCAABCD";
        String pat="ABC";
        patternSearch((text), (pat));

    }
}
