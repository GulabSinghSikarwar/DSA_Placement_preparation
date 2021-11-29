package dsaProblems;

import java.util.Stack;

public class CountRev {

    public static void main(String[] args) {

        String s1 = "}{{}}{{{";
        String s2 = "{{}{{{}{{}}{{";
//        int output=countReversals(s2);
        int output=countWithStack(s1);
        System.out.println(output);
    }
    public static  int   countWithStack(String input){
        int n=input.length();
        Stack<Character>stack=new Stack<Character>();
        for(int i=0;i<n;i++)
        {
            if (i==0||stack.isEmpty())
            {
                stack.push(input.charAt(i));
            }
            else{
                char peek=stack.peek();
                char current=input.charAt(i);

                if(peek=='{' &&  current =='}')
                    stack.pop();
                else stack.push(current);
//                it includes the conditions whe
//                peek ='{" and current ='{'
//                peek ='}" and current ='}'
//                peek ='}" and current ='{'
            }
        }
        int count =0;
        if(stack.size()%2!=0) {

            System.out.println(" Odd toatal Count "+ stack);

            return -1;
        }
        else{
            char open='{';
            int opening=0;
            char close='}';
            int closing=0;
            for(char ele:stack)
            {
                if (ele ==open) {
                    opening++;
                }
                else {
                    closing++;
                }

            }
            System.out.println("Opening: "+opening+ " -- "+ " Closing: "+closing);

            count=stack.size()/2+opening%2;


            System.out.println("Reversal Count "+count);

        }




return count;
    }
}
