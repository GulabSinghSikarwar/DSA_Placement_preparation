package dsaProblems;

import java.util.Stack;

public class MinimumNoOfSwapsForBracketBalancing {
    static int minimumNumberOfSwaps(String str){
        // []][][
        int n=str.length();


        int count=0;

        Stack<Character> stack=new Stack<>();

        for (int i = 0; i <n ; i++) {
            if (stack.isEmpty())
            {
                stack.push(str.charAt(i));

            }
            else {
                if (stack.peek()=='[')
                {
                    if (str.charAt(i)==']')
                        stack.pop();
                    else {
                        // i= '['
                        if (i<n-1)
                            stack.push(str.charAt(i));
                        else  count++;


                    }
                }
                else {
                    //pekk = ]
                    if (str.charAt(i)=='[') {
                        stack.pop();
                        count++;

                    }

                }
            }

System.out.println(stack);
            }






        return count;

    }

    public static void main(String[] args) {
//        String str="[[][]]";
        String str=" []][][";

        System.out.println(minimumNumberOfSwaps(str));


    }
}
