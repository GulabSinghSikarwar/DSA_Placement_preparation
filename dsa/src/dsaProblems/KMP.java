package dsaProblems;

public class KMP {
    public  static  void kmpSearch(String pat,String text)
    {
        int m=pat.length();
        int n=text.length();

        int i=0;int j=0;

        int [] lps=new int [m];
        computeLps(pat,m,lps);

        while ( i<n)
        {
            if (pat.charAt(i) ==text.charAt(j))
            {
                i++;
                j++;

            }
            if(j==m)
                System.out.println("Pattern Found at :  "+ (i-j));

            else if(i<n &pat.charAt(j)!=text.charAt(j))
            {
                if(j!=0)
                {
                    j=lps[j-1];
                }
                else
                    i+=1;

            }
         }

    }

    private static void computeLps(String pat, int m, int[] lps) {
        int i=1;
        int len=0;

        lps[0]=0;

        while(i<m)
        {
            if (pat.charAt(len)==pat.charAt(i))
            {
                len++;
                lps[i]=len;
                i++;

            }
            else{
                if(len!=0)
                {
                    len=lps[len-1];

                }
                else{
                    lps[i]=len;
                    i++;

                }
            }

        }
    }

    public static void main(String[] args) {
        String text = "GEEKS FOR GEEKS";
        String pat = "GEEK";

        kmpSearch(pat,text);


    }
}
