package dsaProblems;

import java.util.Stack;

public class MinimumNoOfSwapsForBracketBalancing {
    /*static int minimumNumberOfSwaps(String str){
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
                if (stack.peek()=='[' && str.charAt(i)==']')
                    stack.pop();
                 else if (stack.peek()==']' && str.charAt(i)=='[') {
                    stack.pop();
                    count++;
                    System.out.print(count+" : ");

                }


            }



            }
        stack.push('-');



        System.out.println(stack+" =="+ stack.size());






        return count;

    }*/

    static int minimumNumberOfSwaps(String str){
      int count=0;
      int n=str.length();
      int left=0;
      int right=0;
      int imbalance=0;
      for (int i=0;i<n;i++)
      {
          if (str.charAt(i)=='[')
          {
              left++;

              if (imbalance>0)
              {
                  count+=imbalance;
                  imbalance--;
              }
          }
          else if (str.charAt(i)==']')
          {
              right++;
              imbalance=right-left;

          }
      }
        return count;
    }
    public static void main(String[] args) {
//        String str="[[][]]";
        String str="[]][][";

        System.out.println(minimumNumberOfSwaps(str));


    }
}
