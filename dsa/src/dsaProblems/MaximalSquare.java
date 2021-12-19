package dsaProblems;

import java.util.Arrays;

public class MaximalSquare {
    public static  int maximalSquare(char[][] matrix) {

        int n=matrix.length;
        int m=matrix[0].length;
        int max=Integer.MIN_VALUE;
        /*
        [
        ["1","0","1","0","0"],
        ["1","0","1","1","1"],
        ["1","1","1","1","1"]
       ,["1","0","0","1","0"]]
        */

        int dp[][]=new int[n][m];
        for (int i = 0; i <n ; i++)
        {
            for (int j = 0; j <m ; j++)
            {
                if (matrix[i][j]=='1') {
                    dp[i][j] = 1;
                    if (i-1<0||j-1<0) {

                    }
                    else{
                        if (dp[i-1][j-1]>=0 && matrix[i-1][j]=='1' && matrix[i][j-1]=='1') {
                            dp[i][j] = Math.min(Math.min(dp[i][j-1] , dp[i-1][j-1]), dp[i-1][j]) + 1;
                        }
                    }
                }
                else
                    dp[i][j]=0;

            max=Math.max(max,dp[i][j]);

            }
//            System.out.println(Arrays.toString(dp[i]));
//            System.out.println();

        }
        {
            System.out.println("............ Noe first dp table............................");

            for (int i = 0; i <n ; i++) {
                System.out.println(Arrays.toString(dp[i]));

            }
            System.out.println("...................now matrix .....................");
            for (int i = 0; i <n ; i++) {
                System.out.println(Arrays.toString(matrix[i]));

            }

        }
    return max;
    }
    public  static  void main(String [] args)
    {
        char [][] matrix={

        {'1','1','1','1','0'},
  {'1','1','1','1','0'},
        {'1','1','1','1','1'},
    {'1','1','1','1','1'}
        ,{'0','0','1','1','1'}
};
        int ans=maximalSquare(matrix);
        System.out.println("Ans : "+ans);


    }
}
