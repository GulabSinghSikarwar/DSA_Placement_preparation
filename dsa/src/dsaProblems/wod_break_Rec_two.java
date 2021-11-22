package dsaProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class wod_break_Rec_two<dictionary> {
    public  static  boolean word_break(String word ,String [] dictionary){
        int length=word.length();
        if(length==0)
            return true;
        for (int i=0; i<=length;i++)
            if(cantains(word.substring(0,i),dictionary)
                    &&
                    word_break(word.substring(i,length),dictionary )) {
//             System.out.println(word.substring(0,i));
               return true;
            }

        return  false;

    }

    private static boolean cantains(String word, String [] dictionary ){
        int size=word.length();
        int dictionaryLength=dictionary.length;
        for (int i=0;i<dictionaryLength;i++)
            if(dictionary[i].equals(word))
                return true;

            return false ;

    }
    public static int wordBreak(String word, ArrayList<String> list  )
    {
        //code here
        int length=word.length();
        if(length==0)
            return 1;

        for(int i=1;i<=length;i++)
            if(list.contains(word.substring(0,i)) && wordBreak(word.substring(i,length),list)==1)
                return 1;

        return 0 ;


    }

    public static void main(String[] args) {
        String [] dictionary ={ "i", "like", "sam",
                "sung", "samsung", "mobile",
                "ice","cream", "icecream",
                "man", "go", "mango" };

        String str="ilike";
        boolean output =word_break(str,dictionary);
        System.out.println(output);
        ArrayList<String> list=new ArrayList<>();



    }
}
