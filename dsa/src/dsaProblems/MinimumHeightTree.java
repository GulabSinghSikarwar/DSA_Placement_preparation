package dsaProblems;
import  java.util.*;


public class MinimumHeightTree {
    public  static  List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> list =new ArrayList<>();
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for (int i = 0; i <=n ; i++) {
            adjList.add(new ArrayList<>());


        }
        for (int i = 0; i <n ; i++) {
            int u =edges[i][0];
            int v =edges[i][1];
adjList.get(u).add(v);
adjList.get(v).add(u);



        }

        int m=adjList.size();
        int indegree []=new  int [m];


        for (int i = 0; i < m ; i++) {
        indegree[i]=adjList.get(i).size();

        }


        Queue<Integer> queue=new LinkedList<>();


        for (int i = 0; i <m ; i++) {
            if (indegree[i]==1)
                queue.add(i);

        }

        while (!queue.isEmpty()){
            int s=queue.size();
            list.clear();

            for (int i = 0; i <s ; i++) {
                int pop=queue.peek();
                queue.poll();
                list.add(pop);





                 ArrayList <Integer> smallList=adjList.get(pop);

                for (int ele:smallList)
                {
                    indegree[ele]--;
                    if (indegree[ele]==1)
                        queue.add(ele);


                }



            }

        }
        System.out.println( " List : "+list);



if (n==1)list.add(0);
        return  list;


    }

    public static void main(String[] args) {
        int arr [][]= {{3,0},{3,1},{3,2},{3,4},{5,4}};

        System.out.println( "output : "+findMinHeightTrees(arr.length,arr));

    }
}
