package dsaProblems;

public class Split_binary_string {
    public  static  int  SplitZeroAndOne(String string){

        int count=0;
        int consecutiveOneCount=0;
        int counsecutiveZeroCount=0;
        int n=string.length();
        for(int i=0;i<n;i++)
        {
            if( consecutiveOneCount==0 && string.charAt(i)=='0')
            {
                System.out.println(string.charAt(i)+" ");
                counsecutiveZeroCount++;


            }
            else {

                if (consecutiveOneCount==0 && string.charAt(i)=='1'){
                    consecutiveOneCount++;
                    System.out.println(string.charAt(i)+" ");
                }
                else if (consecutiveOneCount!=0 &&
                        consecutiveOneCount<=counsecutiveZeroCount
                && string.charAt(i)=='1'){

                    consecutiveOneCount++;
                    System.out.println(string.charAt(i)+" ");

                }

                else if (consecutiveOneCount==counsecutiveZeroCount
                && string.charAt(i)=='0'){
                    count++;
                    System.out.println();
                    counsecutiveZeroCount=1;
                    consecutiveOneCount=0;

                    System.out.print(string.charAt(i));
                }
                else if(consecutiveOneCount>counsecutiveZeroCount &&
                 string.charAt(i)=='1'){
                    counsecutiveZeroCount=0;
                    consecutiveOneCount++;


                }
            }


        }
        if (consecutiveOneCount==counsecutiveZeroCount)
            count++;


        return count;
    }

   public static int splitbinarySubstring(String string){

        int countOne=0;
        int countZero=0;
        int count=0;
        int n=string.length();
        for (int i=0;i<n;i++)
        {
            if(string.charAt(i)=='1')
                countOne++;
            else
                countZero++;
            if (countOne==countZero)
                count++;

        }
        return count;

    }
    public static void main(String[] args) {

        String string="0111100010";
        int count =splitbinarySubstring(string);
        System.out.println(" Your Answer is :"+count);

    }
}
