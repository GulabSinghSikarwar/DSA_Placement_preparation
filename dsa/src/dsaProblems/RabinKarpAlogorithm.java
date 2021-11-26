package dsaProblems;

public class RabinKarpAlogorithm {

     public static int d=256;

    public static  void search(String pat ,String text,int q){
        int m=pat.length();
        int n=text.length();

        int p,t,h;
        p=0;
        t=0;
        h=1;
        int i,j;
        for (i = 0; i < m-1; i++)
            h = (h*d)%q;
// Calculate the hash value of pattern and first
// window of text
        for (i = 0; i < m; i++)
        {
            p = (d*p + pat.charAt(i))%q;
            t = (d*t + text.charAt(i))%q;
        }
        for(i=0;i<=n-m;i++)
        {
            if (p==t)
            {
                for (j=0;j<m;j++)
                {
                    if (pat.charAt(j)!=text.charAt(i+j))
                        break;

                }
                if (j==m)
                    System.out.println("Pattern Found AT i=: "+i);
            }
            if (i<n-m)
            {
                t=(d*(t-text.charAt(i)*h)+text.charAt(i+m))%q;
                if (t<0)
                    t=t+q;

            }
        }


    }

    public static void main(String[] args) {

        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        System.out.println("Text Length : "+txt.length()+ " -- "+ " PAt Length :"+pat.length());
// A prime number
        int q = 101;
// Function Call
        search(pat, txt, q);
    }
}
