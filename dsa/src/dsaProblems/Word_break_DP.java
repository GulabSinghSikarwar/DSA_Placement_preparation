package dsaProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Word_break_DP {
    public  static  boolean wordBreak (String word, String [] dictionary){

        int size=word.length();
        boolean [] dp=new  boolean[ size+1];

        //intialize  array with default array value as false
        Arrays.fill(dp,false);

        // dp [i] will store the result of  prefix string

        for (int i=1;i<=size;i++)
        {
            if ( dp[i]==false && dictionaryContains(word.substring(0,i),dictionary) )
                dp[i]=true;

            if (dp[i]==true)
            {
                if( i==size)
                    return true;

                for(int j=i+1;j<=size;j++)
                {
                    if(dp[j]==false &&   dictionaryContains(word.substring(i,j),dictionary))
                        dp[j]=true;

                    if(j==size &&  dp[j]==true)
                        return true;

                }
            }

        }


        return false;

    }

    private static boolean dictionaryContains(String substring, String[] dictionary) {
        int n=dictionary.length;
        for(String  ele:dictionary)
            if (substring.equals(ele))
                return true;
            return false ;

    }

    public static void main(String[] args) {

                String word ="ilike";
        String  [] dictionary = { "i", "like", "sam",
                "sung", "samsung", "mobile",
                "ice","cream", "icecream",
                "man", "go", "mango" };
        boolean output=wordBreak(word,dictionary);
        System.out.println(output);


    }
}
