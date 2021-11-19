package dsaProblems;


import java.util.HashSet;
import java.util.Set;

public class next_permutation {
    public static  void next_permutation_Util(String input,int index,Set<String>set){

        if(index==input.length())
        {
//            System.out.println("....");
            return;

        }
      if (!set.contains(input))
      {
          System.out.println(input);
          set.add(input);
      }


        for(int i=index;i<input.length();i++)
        {
//            String OrginalString=input;

            char characterAtIndex=input.charAt(index);

            char characterAt_I=input.charAt(i);
//             now permutation  string will be
            char string[]=input.toCharArray();
            string[index]=characterAt_I;
            string[i]=characterAtIndex;
            String ans=new String(string);
//            System.out.println(ans);
            next_permutation_Util(ans,index+1,set);






        }
    }

    public static void main(String[] args) {
     Set<String>set= new HashSet<>();
        next_permutation_Util("ABC",0,set);



    }
}
