package dsaProblems;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        Map<Character,Character> map=new HashMap<>();
        int count =0;
         int m=str1.length();
         int n=str2.length();
         if (m!=n)
             return  false;

        for (int i = 0; i <n ; i++) {
            if (map.containsKey(str1.charAt(i)))
            {
                char value=str2.charAt(i);
                if (value==map.get(str1.charAt(i)))
                {
                    count++;
                }
                else
                    return  false;



            }
            else {
                if (map.containsValue(str2.charAt(i)))
                    return false;

else {
                    map.put(str1.charAt(i),str2.charAt(i));
                    count++;

                }

            }


        }
        if (count==m) {
//            System.out.println(" Count : "+count );
            return true;
        }



        else {
//            System.out.println(" Inside  Last else  ::  Count  :  "+count);
            return false;
        }


    }
    public static void main(String[] args) {

         String str1 = "pijthbsfy";
         String  str2 = "fvladzpbf";
         boolean output= areIsomorphic(str1,str2);
         System.out.println( " Output : "+ output);

    }
}
