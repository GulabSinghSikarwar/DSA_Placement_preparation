package dsaProblems;

public class Wildcard_Pattern_Matching {
    public static boolean wildcardMatching(String pattern, String text) {
        // Write your code here.
        int m=pattern.length();
        int n=text.length();

        int i=0;
        int j=0;
        char star='*';
        char qmark='?';
        int steps=0;
        while(steps<m)
        {

            while(!(pattern.charAt(i)==star || pattern.charAt(i)==qmark))
            {
                System.out.println("i : "+i+"  j : "+j);

                if (pattern.charAt(i)==text.charAt(j)){
                    i++;
                    j++;
                }
                else return  false;

            }
//        pattern.charAt(i) either eqal to * or ?
//        i=*       or i=?
            System.out.println("Text :"+text+"  Pattern : "+pattern+"  i : "+i+"  j : "+j);
            System.out.println("Character At i : "+pattern.charAt(i));
            if (i==m-1)
                return true;



            System.out.println();
            int characterPending=(pattern.length()-(i+1));
            int newJindex=n-characterPending;
            System.out.println(" newJindex  : "+newJindex);



            int nextPositionOfIndex=i+1;


            if (pattern.charAt(i)==star)
            {
                System.out.println("We are in star Condition  ANd characterPending : " +characterPending);

                while(!(text.charAt(j)==pattern.charAt(i+1) && j==newJindex))
                {
                    System.out.print(j+"..>");
                    System.out.println(" J: "+j+" Character at j :"+text.charAt(j)+" "+pattern.charAt(i+1));
                    j++;
                    if (j==n)
                        return false;
                }
                // now we at position  where our  new strings start

                System.out.println("...........................");
                System.out.println("Text :"+text+"  Pattern : "+pattern+"  i : "+(i+1)+"  j : "+j);
                System.out.println("Character At i : "+pattern.charAt(i+1)+"  Character At J : "+text.charAt(j));
                i++;
                pattern=pattern.substring(i);
                text=text.substring(j);
                steps+=i+1;
                System.out.println("Steps : "+steps);
                System.out.println( "Now i: "+i+"  J : "+j+" New Pattern :"+pattern+" new Text : "+text);


                i=0;j=0;




            }
            else{
                System.out.println("Inside Q mark ");
                if (i==(pattern.length()-1) && j==(text.length()-1))
                    return  true;
                else if (i==(pattern.length()-1)  && j!=(text.length()-1))
                    return false;


                else  if (pattern.charAt(i+1)!=text.charAt(j+1))
                    return  false;
                else
                {
                    i++;j++;

                    pattern=pattern.substring(i);
                    text=text.substring(j);
                    steps+=i+1;
System.out.println("Steps : "+steps);
                    i=0;j=0;

                }


            }
            System.out.println(".............................................................");
        }


        return true ;

    }

    public static void main(String[] args) {
//        ba*a?
//baaabab
        String pattern="ba*a?";
        String text= "baaabab";
        System.out.println("main call");

        boolean output =wildcardMatching(pattern,text);
        System.out.println("Output : "+output);


    }
}
