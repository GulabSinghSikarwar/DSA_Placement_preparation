package dsaProblems;

import java.util.HashSet;
import java.util.Set;

public class PrintAllSubsequence {
    public  static  void  findSubSequenceRecursiveApproach(String string,String ans){
        if(string.length()==0)
        {
            System.out.println(ans+" ");

       return;
        }
        findSubSequenceRecursiveApproach(string.substring(1),ans+string.charAt(0));
        findSubSequenceRecursiveApproach(string.substring(1),ans);

    }

    static Set<String> set=new HashSet<>();

    public  static  void  findSubSequenceIterativeApproach(String string)
    {
        int n=string.length();

        for (int i=0;i<n;i++)
        {
            for (int j=n;j>i;j--)
            {
                String  substring=string.substring(i,j);
                if (!set.contains(substring))
                    set.add(substring);

                for (int k =1;k< substring.length()-1;k++)
                {
                    StringBuffer strBf=new StringBuffer(substring);
                    strBf.deleteCharAt(k);

                    findSubSequenceIterativeApproach(strBf.toString());
                }

            }
        }
    }

    public static  void findSubSequenceOptimalApproach(String string ,String curr,int index,int n)
    {
        if(index==n)
            return ;
        if(curr!=null && curr.length()!=0)
            System.out.println(curr);

        for (int i=index+1;i<n;i++)
        {
            curr+=string.charAt(i);

            findSubSequenceOptimalApproach(string ,curr, i,n);
            curr=curr.substring(0,curr.length()-1);
        }
    }
    public static void main(String[] args) {

        String str="abcd";
//        findSubSequenceIterativeApproach(str);
      /*  findSubSequenceRecursiveApproach(str, "");

        System.out.println(set);*/

        findSubSequenceOptimalApproach(str,"",-1,str.length());


    }
}
