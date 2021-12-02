package dsaProblems;

public class longestCommonPrefix {
    public  static  String longestCommonPrefix(String[] strs) {

        int index=0;
        int len=strs.length;
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<len;i++)
        {
            minLen=Math.min(minLen,strs[i].length());

        }
        System.out.println("MinLength: "+minLen);

        String ans="";

        while(index<minLen)
        {
            String  requiredPrefixString=strs[0].substring(0,index+1);
            System.out.println("Current prefix Required string :"+requiredPrefixString);

            int i=0;

            for(;i<len;i++){
                System.out.print("current String :"+strs[i]+"--> Current substring From  0 to  index+1 :  "+strs[i].substring(0,index+1)+" ____");

                if(!strs[i].substring(0,index+1).equals(requiredPrefixString))
                    break;
            }
            System.out.println("Value of I :"+i);
            if (i<len)
                break;

            index++;
            ans=requiredPrefixString;

            System.out.println();
            System.out.println();

        }

        return ans;
    }

    public static void main(String[] args) {
//        String [] str={"dog","racecar","car"};
        String [] str={"flower","flow","flight"};
       String output= longestCommonPrefix(str);
       System.out.println("Your output  is :"+ output);


    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {


        String lcp = strs[0];
        for(int i = 1; i< strs.length; i++)
        {
            lcp = getCommonString(lcp, strs[i]);
            if(lcp.length() == 0)
            {
                return "";
            }
        }
        return lcp;
    }

    String getCommonString(String str1, String str2) {

        int i = 0;
        while(i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }

        return str1.substring(0,i);

    }
}

