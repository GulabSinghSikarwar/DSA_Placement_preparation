package dsaProblems;
import java.util.*;


public class Valid_Parentheses {
    public boolean isValid(String s) {

        return  ispar(s);
    }
    boolean ispar(String x)
    {
        if (x.length()==0)
            return  false;

        // add your code here
        Stack<Character>stack=new Stack<>();
        int n=x.length();
        for(int i=0;i<n;i++)
        {
//            System.out.println( "index:"+i+" Current  initial Stack:: "+stack);
//            System.out.println("Current  character:: "+x.charAt(i));


            if(stack.isEmpty())


            {
                if (x.charAt(i)=='{' ||x.charAt(i)=='[' ||x.charAt(i)=='('  )
                    stack.push(x.charAt(i));
                else {
//                     System.out.println("Stack Empty and }])");
                    return false;
                }

            }
            else{
                if((x.charAt(i)==')' &&
                        stack.peek()!='(' )||
                        (x.charAt(i)=='}' &&
                                stack.peek()!='{' )||
                        (x.charAt(i)==']' &&
                                stack.peek()!='[' )) {
//                     System.out.println("Stack Entry }]) without {[(");


                    return false;
                }
                else
                {
                    if(x.charAt(i)=='{'||x.charAt(i)=='['
                            ||x.charAt(i)=='('){
                        stack.push(x.charAt(i));

                    }
                    else{
                        if((x.charAt(i)==')' &&
                                stack.peek()=='(' )||
                                (x.charAt(i)=='}' &&
                                        stack.peek()=='{' )||
                                (x.charAt(i)==']' &&
                                        stack.peek()=='[' ))
                            stack.pop();

                    }
                }
            }





        }
        if (stack.size()==0)
            return true;
//        System.out.println(stack);

        return  false;
    }
    public static void main(String[] args) {

    }
}
