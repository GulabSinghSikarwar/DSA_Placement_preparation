package dsaProblems;

import java.util.Arrays;

public class edit_Distance {
    public static  int  editDistance(String str1 , String str2 ){

        if(str1.length()==0)
            return str2.length();
        if (str2.length()==0)
            return str1.length();

        int m=str1.length();
        int n =str2.length();

        if ( str1.charAt(m-1)==str2.charAt(n-1))
            return  editDistance(str1.substring(0,m-1),str2.substring(0,n-1));

        else {
            return 1+Math.min(
                    replace(str1,str2),
                    Math.min(
                            insert(str1,str2),remove(str1,str2)
                    )
            );

        }


    }
    public  static  int edit_distance(String str1 ,String str2,int m , int n ){

        if(m==0)
            return  n;
        if (n==0)
            return  m;

        if(str1.charAt(m-1)==str2.charAt(n-1))
            return  edit_distance(str1,str2,m-1,n-1);

        else
        {
            return  1+ Math.min(edit_distance(str1,str2,m,n-1),
                    Math.min(edit_distance(str1,str2,m-1,n),
                            edit_distance(str1,str2,m-1,n-1)));
        }


    }

    private static int replace(String str1, String str2) {
        char strOne [] =str1.toCharArray();
        char strTwo[]=str2.toCharArray();
        int m=str1.length();
        int n=str2.length();
        strTwo[n-1]=strOne[m-1];
        str2=new String(strTwo);
        return editDistance(str1.substring(0,m-1),str2.substring(0,n-1));
    }

    private static int insert(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();

        str2+=str1.charAt(m-1);
        return editDistance(str1.substring(0,m-1),str2.substring(0,n));


    }

    private static int remove(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();
        str2=str2.substring(0,n-1);
        return editDistance(str1,str2);

    }

    public static  int dp_edit_distance(int m , int n , String str1, String str2){

        int dp[][]=new int [m+1][n+1];


        for (int i = 0; i <=m ; i++) {
            for (int j = 0; j <= n; j++) {
                if (i==0)
                    dp[i][j]=j;
                else  if (j==0)
                    dp[i][j]=i;
                else if (str1.charAt(i-1)==
                        str2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                {
                    dp[i][j]=1+Math.min(dp[i-1][j]
                            ,Math.min(dp[i][j-1],dp[i-1][j-1]));

                }
            }
        }
        for (int i = 0; i <m+1 ; i++) {
            System.out.println(Arrays.toString(dp[i]));


        }

        return dp[m][n];

    }

    public static  int dp_edit_distance(String str1, String str2 ){
        int len1=str1.length();
        int len2=str2.length();
         int dp[][]=new int [2][len1+1];
        for (int i = 0; i <= len1; i++)
            dp[0][i] = i;



        for (int i = 1; i <=len2 ; i++) {
            for (int j = 0; j <=len1 ; j++) {

                if (j==0)
                {
                    dp[i%2][j]=i;

                }
                else if(str1.charAt(j-1)==str2.charAt(i-1))
                    dp[i % 2][j] = dp[(i - 1) % 2][(j - 1)];
                else{
                    dp[i%2][j]=1+Math.min(dp[(i-1)%2][(j-1)],Math.min(dp[(i)%2][(j-1)],dp[(i-1)%2][(j)]));
                }
            }
        }

        return dp[len2%2][len1];
    }
    public static void main(String[] args) {

        String  str1="sunday";
        String str2="saturday";
        int m=str1.length();
        int n =str2.length();

        int output=editDistance(str1,str2);

        int Second_output=edit_distance(str1,str2,m,n);
        int third_output=dp_edit_distance( m,n,str1,str2);
        int fourth_output=dp_edit_distance(str1,str2);





        System.out.println(" Output :"+output);
        System.out.println("Second_output:"+Second_output);
        System.out.println("third_output :"+third_output);
        System.out.println("fourth_output :"+fourth_output);

    }
}
