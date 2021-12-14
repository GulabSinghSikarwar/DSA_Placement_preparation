package dsaProblems;

import java.util.Arrays;

public class MinimumCharacterstoFormPalindrome {
    public static int formPalindromeUsingLCS(String str){

        int n=str.length();
        StringBuilder sb=new StringBuilder(str);

        sb=sb.reverse();
        String rev=sb.toString();

        System.out.println(sb);
        int [][]dp=new int [n+1][n+1];

        for (int i = 0; i <n+1 ; i++) {
            for (int j = 0; j < n+1; j++) {
                if (i==0||j==0)
                    dp[i][j]=0;
                else if (str.charAt(i-1)==rev.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Integer.max(dp[i-1][j],dp[i][j-1]);


            }

        }
        for (int i = 0; i <n ; i++) {
            System.out.println(Arrays.toString(dp[i]));

        }
        System.out.println(dp[n][n]);
        return dp[n][n];
    }

    public static void main(String[] args) {
        String str="anasdad";
//anasdad
        int l=formPalindromeUsingLCS(str);

        int min=str.length()-l;
        System.out.println("ans :"+min);
    }

}
