package dsaProblems;

import java.util.Arrays;

public class MinNumberofFlip {
    public  static int minFlips(String str) {

System.out.println("Your Input :"+str);
        int m=str.length();
        if (m<=2)
            return 0;


        if (m>3){

            char [] arr =str.toCharArray();

            int flip=0;
            for(int i=0;i<m;i++)
            {
                if( i+1<m &&arr[i+1]==arr[i])
                {
                    System.out.println("Flip condition activated ");
                    int current=arr[i+1];
                    boolean condition =true;
                    int j=i+1;

                    while (j+1<m)
                    {
                        if (arr[j]!=current && (arr[j+1]!=current && arr[j-1]!=current)) {
                            flip++;
                            swap(i + 1, j, arr);
                            break;
                        }
                        j++;

                    }
                    System.out.println( " Your array After flip "+Arrays.toString(arr));
                }
            }


            return flip;
        }
        int flip=0;
        char [] arr=str.toCharArray();
        char current =arr[0];
        if (arr[1]==current)
        {
            if(arr[1]!=arr[2]) {
                swap(1, 2, arr);
            flip++;

            }
        }
        if (arr[1]==arr[2])
        {
            if(arr[1]!=arr[0]) {
                swap(1, 0, arr);
                flip++;

            }
        }

        System.out.println("Your Output is :"+Arrays.toString(arr));
        return flip;

    }


    private static  void swap(int i, int j, char[] arr) {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public  static  int  flips(String str){
        int m=str.length();
        String one="";
        int StringOneOneCount=0;
        int StringOneZeroCount=0;
        for (int i = 1; i <m+1 ; i++) {

            if (i%2==0) {
                one += '0';
                StringOneZeroCount++;
            }
            else {
                one += '1';
           StringOneOneCount++;
            }


        }
//        System.out.println("String One :"+one);
//        System.out.println("StringOneOneCount: "+StringOneOneCount+" "+"StringOneZeroCount :"+StringOneZeroCount);
        String two="";
        int StringTwoOneCount=0;
        int StringTwoZeroCount=0;
        for (int i = 1; i <m+1 ; i++) {

            if (i%2==0) {
                two += '1';
                StringTwoOneCount++;
            }
            else {
                two += '0';
                StringTwoZeroCount++;
            }


        }
//        System.out.println("String two :"+two);
//        System.out.println("StringTwoOneCount: "+StringTwoOneCount+" "+"StringTwoZeroCount :"+StringTwoZeroCount);

        int StringOneCount=0;
        int StringZeroCount=0;
         int StringOneFlipCount=0;
         int StringTwoFlipCount=0;

        for (int i=0;i<m;i++)
        {
            {
                if (str.charAt(i) == '0') {
                    StringZeroCount++;
                }
                if (str.charAt(i) == '1') {
                    StringOneCount++;
                }
            }
            if(str.charAt(i)!=one.charAt(i))
                StringOneFlipCount++;
            if(str.charAt(i)!=two.charAt(i))
                StringTwoFlipCount++;





        }
//        System.out.println("String  :"+str);
//        System.out.println("StringZeroCount: "+StringZeroCount+" "+"StringOneCount :"+StringOneCount);

        int minFlip=Math.min(
                StringOneOneCount-StringOneCount+StringOneZeroCount-StringZeroCount,
                StringTwoOneCount-StringOneCount+StringTwoZeroCount-StringZeroCount

                );
        System.out.println("StringOneFlipCount :"+StringOneFlipCount+" "+" StringTwoFlipCount :"+StringTwoFlipCount);

        return Math.min(StringOneFlipCount,StringTwoFlipCount );




    }

    public static void main(String[] args) {

        String input="0001010111";
        String input2="001";
        String input3="100";
        int flip=flips(input);
        System.out.println(" Your Flips : "+flip);
    }
}
