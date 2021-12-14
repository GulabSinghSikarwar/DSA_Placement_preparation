package dsaProblems;

import java.util.Arrays;

public class SmallestDistinctWindow {

    public static  String findSubString( String str) {

        int n =str.length();
        if (n<=1)
            return str;

        boolean visisted [] =new boolean[256];
        int distinctCount=0;
        Arrays.fill(visisted,false);


        for (int i = 0; i <n ; i++) {
            if (!visisted[str.charAt(i)]) {
                visisted[str.charAt(i)] = true;
                distinctCount++;
            }

        }
        // to maintain the count of  character of string visited
        int  currCharacterCount [] =new int[256];

        // to maintain the count of distinct characters of  string visited

        int count =0;
        int minLen=Integer.MAX_VALUE;

//

        int start =0;
        int startIndex=-1;


        for (int i=0;i<n;i++)
        {
            currCharacterCount[str.charAt(i)]++;
            if (currCharacterCount[str.charAt(i)]==1)
                count++;

            if (count==distinctCount)
            {
                while (currCharacterCount[str.charAt(start)]>1)
                {
                    if ( currCharacterCount[str.charAt(start)]>1) {
                        currCharacterCount[str.charAt(start)]--;
                        start++;
                    }
                }

                int windowLength=i-start+1;

                if (windowLength<minLen) {
                    minLen = windowLength;
                startIndex=start;
//

                }





            }
        }




        return  str.substring(startIndex,minLen+start);
//return "";

    }
    public static void main(String[] args) {

        String str="aabcbcdbca";
        System.out.println(findSubString(str
        ));
    }
}
