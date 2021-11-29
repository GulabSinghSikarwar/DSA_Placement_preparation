package dsaProblems;

import java.util.Arrays;

public class longestPalindromicSubSequence {
     public static  int longest_Palindromic_Subsequence_Recursive_Solution
             (String string,int firstIndex,int lastIndex)
     {
         if(firstIndex==lastIndex) {
             System.out.println(string.charAt(firstIndex));
             return 1;
         }

         // whwen string  is of two characters
         if (
                 string.charAt(firstIndex)==string.charAt(lastIndex)
         &&
                lastIndex==firstIndex+1
         ) {
             System.out.println(string.charAt(firstIndex) +""+string.charAt(lastIndex));
             return 2;
         }

         if (
                 string.charAt(firstIndex)==string.charAt(lastIndex)
                 &&
                 lastIndex>firstIndex+1
         )
         {
             System.out.print(string.charAt(firstIndex) +""+string.charAt(lastIndex)+" ");

             return longest_Palindromic_Subsequence_Recursive_Solution(string,firstIndex+1,lastIndex-1)
                     +2;
         }
         else {
             System.out.print(string.charAt(firstIndex) + "---"+string.substring(firstIndex+1,lastIndex) +"--" + string.charAt(lastIndex)+"    ");
             return Math.max(
                     longest_Palindromic_Subsequence_Recursive_Solution(string, firstIndex + 1,
                             lastIndex),
                     longest_Palindromic_Subsequence_Recursive_Solution(string,
                             firstIndex, lastIndex - 1)
             );
         }



     }

     public  static    int longest_Palindromic_Subsequence_Iterative_Solution(String string)

     {
        int n=string.length();

        int [][]dp=new int [n][n];
        for (int i = 0; i < n; i++) {
            dp[i][0]=0;
            dp[0][i]=0;

        }
        for (int i = 0; i <n ; i++) {
            dp[i][i]=1;
        }

//
//        for (int diff = 1; diff <=n-2 ; diff++) {
//        int i=0;
//        for (int j=i+diff;j<n;j++)
//        {
//            if(string.charAt(i)==string.charAt(j)&&
//            i-j==2
//            )
//                dp[i][j]=2;
//            else  if (string.charAt(i)==string.charAt(j))
//            {
//                dp[i][j]=dp[i+1][j-1]+2;
//
//            }
//            else
//                dp[i][j]=Math.max(
//                        dp[i+1][j],dp[i][j-1]
//                );
//
//        i++;
//        }
//        }
         for ( int cl=2; cl<=n; cl++)
         {
             for ( int i=0; i<n-cl+1; i++)
             {
                  int j  = i+cl-1;
                 if (string.charAt(i) == string.charAt(j) && cl == 2)
                     dp[i][j] = 2;
                 else if (string.charAt(i) == string.charAt(j))
                     dp[i][j] = dp[i+1][j-1] + 2;
                 else
                     dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
             }
         }
        for (int i = 0; i <n ; i++) {
            System.out.println(Arrays.toString(dp[i]));

        }


        return  dp[0][n-1];
    }
    public static void main(String[] args) {
        String s1="GEEKSFORGEEKS";
        String s2="bbbab";
        String s3="a";


//        int n=s1.length();
//        int output=longest_Palindromic_Subsequence_Recursive_Solution(s1,0,n-1);
//        System.out.println("Output :"+output);
//        System.out.println(longest_Palindromic_Subsequence_Iterative_Solution(s1));
System.out.println(longestPalindromeSubseq(s2));

    }
    public static  int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(Arrays.toString(dp[i]));

        }
//        System.out.println("Arrays Length : "+s.length());
//        for (int i = n - 1; i >= 0; i--) {
//            dp[i][i] = 1;
//            System.out.print("( "+i+" , "+" )"+",  ");
//            System.out.println();
//
//            for (int j = i + 1; j < n; j++) {
//
//                System.out.print("( "+i+" , "+j +" )"+",  ");
//            }
//            System.out.println("-----------");
//        }

        return dp[0][n - 1];
    }
}
