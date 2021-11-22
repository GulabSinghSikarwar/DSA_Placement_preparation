package dsaProblems;
import  java.util.*;



public class Word_Break {
    public static int wordBreak(String a, String []  b ,int index )
    {
        //code here

        if(index==a.length()) {
            System.out.println("Inside break condition ");
            return 1;
        }


        for(int i=0;i<b.length;i++)
        {
            String current=b[i];

            if(a.charAt(index)==current.charAt(0))
            {
                System.out.println(  "First Character Matched ");

                if(current.length()==1) {
                    System.out.println(   "Input String : "+ a+"___ " +"Current: "+current);
                    return wordBreak(a.substring(index + current.length()), b, index);




                }                else
                {
                    if(a.substring(0,current.length()  ).equals(current))
                    {System.out.println("current Input :" +a+"___"+ " Required String :"+a.substring(0,current.length() ) +"___"+" Current:"+current);
//                        System.out.println(   "Input String : "+ a+" " +"Current: "+current);
                     return    wordBreak(a.substring(index+current.length()),b,index);
                    }
                }

            }
            System.out.println(  "First Character Not  Matched ");
            System.out.println(  "Input: "+a+"___ "+ " Current: "+current);

        }



        return 0;

    }
    public static void main(String[] args) {

        String [] b = { "i", "like", "sam","sung", "samsung", "mobile",
                        "ice","cream", "icecream","man", "go", "mango"
        };

        String a = "ilike";
        int index=0;
         int ans= wordBreak(a,b,0);
         if(ans==0)
             System.out.println("Not Possible to break The String");
         else
             System.out.println("Word is successfully Breaked ");




    }
}
