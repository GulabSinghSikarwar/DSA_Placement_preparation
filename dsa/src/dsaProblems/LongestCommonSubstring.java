package dsaProblems;

import java.util.Arrays;

public class LongestCommonSubstring {


    public static  int  LCS (String s1 ,String s2){
      if (s1.length()==0 || s2.length()==0)
          return 0;

        int n=s1.length();
        int  m=s2.length();
      if(s1.charAt(n-1)==s2.charAt(m-1))
          return LCS(s1.substring(0,n-1),s2.substring(0,m-1))+1;

        else return  Math.max(LCS(s1.substring(0,n),s2.substring(0,m-1)),
              LCS(s1.substring(0,n-1),s2.substring(0,m)));




/*
        int n=s1.length();
        int m=s2.length();
        int [][] dp=new int [n+1][m+1];
        for (int i = 0; i <n+1 ; i++) {
            Arrays.fill(dp[i],000);
        }

        int max=0;

        for (int i = 0; i <n+1 ; i++) {

            for (int j = 0; j <m+1 ; j++) {

                if (i==0||j==0)
                    dp[i][j]=0;
                 else if (s1.charAt(i-1)==s2.charAt(j-1))
                     dp[i][j]=1+dp[i-1][j-1];

                 else dp[i][j]=0;
                 max=Math.max(max,dp[i][j]);

            }
        }

        for (int i = 0; i <n+1 ; i++) {
            System.out.println(Arrays.toString(dp[i]));

        }

        System.out.println("your Ans Is : "+max);
    */

    }


    public static void main(String[] args) {
        String s1="ABCBDAB";
        String s2="BDCABA";
        int n = LCS(s1,s2);
        System.out.println("Your output :"+n);

    }

}
