//package dsaProblems;
//
//import java.util.Arrays;
//
//public class WordWrap {
//    public static  int solveWordWrap( int [] nums ,int  k  ){
//
//        int n=nums.length;
//
//
//        int [][] memo= new int [n+1][k+1];
//
//        for (int i = 0; i <n ; i++) {
//            Arrays.fill(memo[i],-1);
//        }
//
//
//        return  solveWordWrapUsingMemo( nums, n,k,0,k,memo);
//    }
//
//    public  static int
//    solveWordWrapUsingMemo(int[] words , int n, int length,
//                           int wordIndex, int remLength, int[][] memo) {
//
//if(memo[wordIndex][remLength]!=-1)
//    return memo[wordIndex][remLength];
//
//
//        memo [wordIndex][remLength]=solveWordWrap(words,n,length,wordIndex,remLength,memo);
//
//        return memo[wordIndex][remLength];
//
//
//    }
//
//    private static int solveWordWrap(int[] words, int n, int length, int wordIndex, int remLength, int[][] memo) {
//        if (wordIndex==n-1)
//        {
//            memo[wordIndex][remLength]=words[wordIndex]<remLength?0:square(remLength);
//            return  memo[wordIndex][remLength];
//
//        }
//        int currWord=words[wordIndex];
//
//        if(currWord <remLength)
//        {
//            return  Math.min(
//                    solveWordWrapUsingMemo(words,n,length,wordIndex+1,
//                            remLength==length?remLength-currWord:remLength+currWord-1,memo),
//
//                    square (remLength)+solveWordWrapUsingMemo(words, n, length, wordIndex+1, remLength-currWord, memo)
//                    );
//
//
//            )
//        }
//        else{
//            return square(remLength)+solveWordWrapUsingMemo(words ,n,length,wordIndex+1,length-currWord,memo);
//
//        }
//
//    }
//    public static  int square(int number){
//        return (int )Math.pow(number,2);
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
