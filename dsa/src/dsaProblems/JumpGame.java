package dsaProblems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class JumpGame{
    public  static  boolean   jumGame(int arr[] , int start ){





        Queue<Integer> q=new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()){
            int curr=q.poll();
            if ( arr[curr] ==0)
                return  true;

            if (curr+arr[curr]<arr.length)
                q.add(curr+arr[curr]);

            if (curr-arr[curr]>=0)
                q.add(curr-arr[curr]);
            arr[curr]=-arr[curr];

        }

return false;
    }
    public static void main(String[] args) {

        int  arr [] = {3,0,2,1,2};
         int start =2;
/*{
[4,2,3,0,3,1,2]
5
true (aspected)


    [1,1,1 ,1,1,1 ,1,1,0 ]
    3

true (aspected)


[3,0,2,1,2]
2

false  (aspected)



}*/

        System.out.println("Jump Output :"+dfs(arr,start));


    }
    public  static  boolean dfs(   int arr [] , int start ){


        if (start<0 || start >=arr.length|| arr[start]<0)
            return  false;
        if (arr[start]==0)
            return true;

        arr[start]=-arr[start  ];


      boolean left =dfs(arr,start+arr[start]);
       boolean right = dfs(arr , start -arr[start]);



        return  left||right;

    }
}
