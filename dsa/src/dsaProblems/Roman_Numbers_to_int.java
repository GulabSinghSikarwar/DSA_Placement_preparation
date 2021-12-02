package dsaProblems;

public class Roman_Numbers_to_int {
    public static int romanToDecimal(String str) {
        // code here
        int m=str.length();
        int value=0;

        int j=0;

        while(j<m){
            if (j+1<m){
                char firstChar=str.charAt(j);
                char secondChar=str.charAt(j+1);
                int firstCharValue=0;
                int secondCharValue=0;


                if ( str.charAt(j)=='I')
                    firstCharValue  =1;
                else if (str.charAt(j)=='V')
                    firstCharValue=5;
                else if ( str.charAt(j)=='X')
                    firstCharValue=10;
                else if ( str.charAt(j)=='L')
                    firstCharValue=50;
                else if ( str.charAt(j)=='C')
                    firstCharValue=100;
                else if ( str.charAt(j)=='D')
                    firstCharValue=500;
                else if ( str.charAt(j)=='M')
                    firstCharValue=1000;
                else
                    firstCharValue=0;
                //now compare sechond char value
                if ( str.charAt(j+1)=='I')
                    secondCharValue  =1;
                else if (str.charAt(j+1)=='V')
                    secondCharValue=5;
                else if ( str.charAt(j+1)=='X')
                    secondCharValue=10;
                else if ( str.charAt(j+1)=='L')
                    secondCharValue=50;
                else if ( str.charAt(j+1)=='C')
                    secondCharValue=100;
                else if ( str.charAt(j+1)=='D')
                    secondCharValue=500;
                else if ( str.charAt(j+1)=='M')
                    secondCharValue=1000;
                else
                    secondCharValue=0;

                //now calculate the  value
                if (firstCharValue<secondCharValue)
                    value+=secondCharValue-firstCharValue;
                else
                    value+=secondCharValue+firstCharValue;




                j=j+2;

            }
            else
            {
                if ( str.charAt(j)=='I')
                    value+=1;
                else if ( str.charAt(j)=='V')
                    value+=5;
                else if ( str.charAt(j)=='X')
                    value+=10;
                else if ( str.charAt(j)=='L')
                    value+=50;
                else if ( str.charAt(j)=='C')
                    value+=100;
                else if ( str.charAt(j)=='D')
                    value+=500;
                else if ( str.charAt(j)=='M')
                    value+=1000;
                j=j+1;

            }


        }
        return value;


    }

    public static void main(String[] args) {
        String input="XIV";
        int output=romanToDecimal(input);
        System.out.println("Your Number :"+output);


    }
}
