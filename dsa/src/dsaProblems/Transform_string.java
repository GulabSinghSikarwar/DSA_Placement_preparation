package dsaProblems;

import java.util.Arrays;

public class Transform_string {
    /* public static  int transform (String a, String b)
    {
        // code here

        int n=a.length();
        int m=b.length();
        int FreqOfA []=new int [256];
        int FreqOfB []=new int [256];
        for (int i = 0; i <m ; i++) {


            FreqOfA[a.charAt(i)-0]=FreqOfA[a.charAt(i)-0]+1;


        }
        for (int i = 0; i <n ; i++) {
             FreqOfB[b.charAt(i)-0]=FreqOfB[b.charAt(i)-0]+1;

        }

   int count=0;
        for (int i = 0; i <256 ; i++) {
            if (FreqOfA[i]!=FreqOfB[i])
                return -1;
            else continue;

        }


        StringBuilder sb=new StringBuilder(a);
        for (int i=m-1;i>=0;i--) {
            char curr=sb.charAt(i);

            if (curr==b.charAt(i)) {

                continue;
            } else {

                sb.deleteCharAt(i);

                sb.insert(0,curr);
                i++;
                count++;
            }

            if (sb.toString().equals(b))
            {
                break;
            }
        }


    return 0;
    }*/

    public static void main(String[] args) {
//        String A="GeeksForGeeks";
//        String B ="ForGeeksGeeks";
        String A="abd";
        String B ="bad";

        System.out.println("Output : "+transform(A,B));


    }
    public static  int transform (String A, String B)
    {
        // code here
        // This parts checks whether conversion is
        // possible or not
        if(A.length() != B.length())
            return -1;

        int i, j, res = 0;
        int count [] = new int [256];

        // count characters in A

        // subtract count for every character in B
        for(i = 0; i < A.length(); i++)
        {
            count[A.charAt(i)]++;
            count[B.charAt(i)]--;
        }

        // Check if all counts become 0
        for(i = 0; i < 256; i++)
            if(count[i] != 0)
                return -1;

        i = A.length() - 1;
        j = B.length() - 1;

        while(i >= 0)
        {
            // If there is a mismatch, then
            // keep incrementing result 'res'
            // until B[j] is not found in A[0..i]
            if(A.charAt(i) != B.charAt(j))
                res++;
            else
                j--;
            i--;
        }
        return res;
    }
/*public static  int transform(String a ,String b){
    int n=a.length();
    int m=b.length();
    int FreqOfA []=new int [256];
    int FreqOfB []=new int [256];
    for (int i = 0; i <m ; i++) {


        FreqOfA[a.charAt(i)-0]=FreqOfA[a.charAt(i)-0]+1;


    }
    for (int i = 0; i <n ; i++) {
        FreqOfB[b.charAt(i)-0]=FreqOfB[b.charAt(i)-0]+1;

    }

    int count=0;
    for (int i = 0; i <256 ; i++) {
        if (FreqOfA[i]!=FreqOfB[i])
            return -1;
        else continue;

    }
    int i,j;
    i=m-1;
    j=n-1;
    while (a.charAt(i)==b.charAt(j))
    {
        i--;
        j--;
if (i<0||j<0)
    break;

    }
//    System.out.println(" i : "+i+  " j : "+j+"  character at i : "+a.charAt(i)+ "  character at j : "+b.charAt(j));
    int start =i+1;
    int end=0;
    char currentMissMatchedCharInB=b.charAt(j);
//  System.out.println("currentMissMatchedCharInB :  "+currentMissMatchedCharInB);
    while(a.charAt(i)!=currentMissMatchedCharInB)
    {
        i--;

    }
//    System.out.println( " Start :  "+start +"  End : "+end);
     end=i+1;
    int diff=start-end;

//    System.out.println("Diff : "+diff);





        return diff;
}*/
}
/*package dsaProblems;

import java.util.Arrays;

public class Transform_string {
     public static  int transform (String a, String b)
    {
        // code here

        int n=a.length();
        int m=b.length();
        int FreqOfA []=new int [256];
        int FreqOfB []=new int [256];
        for (int i = 0; i <m ; i++) {
//            System.out.println( "  Current "+" Character : " +a.charAt(i)+ "  index  : "+(a.charAt(i)-0));
//            System.out.println(Arrays.toString(FreqOfA));

            FreqOfA[a.charAt(i)-0]=FreqOfA[a.charAt(i)-0]+1;
//            System.out.println();

        }
        for (int i = 0; i <n ; i++) {
             FreqOfB[b.charAt(i)-0]=FreqOfB[b.charAt(i)-0]+1;

        }
//        System.out.println(Arrays.toString(FreqOfA)+"  b->"+Arrays.toString(FreqOfB));

        int count=0;
        for (int i = 0; i <256 ; i++) {
            if (FreqOfA[i]!=FreqOfB[i])
                return -1;
            else continue;

        }


        StringBuilder sb=new StringBuilder(a);
        for (int i=m-1;i>=0;i--) {
            char curr=sb.charAt(i);



            if (curr==b.charAt(i)) {
                System.out.println(" Current character of Sb:"+sb.charAt(i)
                        +"  current character of B : "+b.charAt(i));
                continue;
            } else {
                System.out.println("CHARACTER NOT MATCH   ");
                System.out.println(" Current character of Sb:"+sb.charAt(i)
                        +"  current character of B : "+b.charAt(i));
                System.out.println(" ");



                System.out.println("Before oeration Sb : "+sb.toString());
                sb.deleteCharAt(i);
                System.out.println("After delete  operation Sb : "+sb.toString());
                sb.insert(0,curr);
                System.out.println("After  Insert operation Sb : "+sb.toString());

i++;
count++;
                System.out.println(" Count  : "+count );

                System.out.println(".......................................................");


            }

            if (sb.toString().equals(b))
            {

                System.out.println("String Matched Now Break ");
                break;
            }
        }


    return 0;
    }

    public static void main(String[] args) {
//        String A="GeeksForGeeks";
//        String B ="ForGeeksGeeks";
        String A="abd";
        String B ="bad";

        System.out.println("Output : "+transform(A,B));


    }
}
*/
