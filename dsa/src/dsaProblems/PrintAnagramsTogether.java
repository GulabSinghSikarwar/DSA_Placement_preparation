package dsaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import  java.util.*;

public class PrintAnagramsTogether {

    static class Solution {
        public List<List<String>> Anagrams(String[] string_list) {
            // Code here
            List<List<String>> list = new ArrayList<>();
            int n=string_list.length;
            for (int i = 0; i <n; i++) {
                list.add(new ArrayList<String>());


            }

            for (int j=0;j<n;j++) {
                String ele =string_list[j];

                int hash=0;
                System.out.println("String :"+ele);
                for (int i = 0; i <ele.length() ; i++) {
                    hash+=ele.charAt(i);


                }
                int index=hash%n;
                /*{
                    System.out.println("Hash :" + hash);
                    System.out.println("Index :" + index);
                    System.out.println();
                    System.out.println();
                }*/
                list.get(index).add(ele);

            }




            List<List<String>> newlist = new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                if (list.get(i).size()!=0)
                    newlist.add(list.get(i));

            }

            System.out.println("List 2:"+newlist);

            return newlist;
        }
    }

    public static void main (String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter The number Of test Cases");
        int t=Integer.parseInt(br.readLine().trim());
        while(t > 0)
        {
            System.out.println("Enter the length of the array");
            int n= Integer.parseInt(br.readLine().trim());
            System.out.println("Enter the elements");
            String x = br.readLine().trim();
            String string_list[] = x.split(" ",n);

            Solution ob = new  Solution();

            List <List<String>> ans = ob.Anagrams(string_list);

            Collections.sort(ans, new Comparator<List<String>>(){
                public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);

                    return s1.compareTo(s2);
                }
            });

            for(int i=0;i<ans.size();i++)
            {
                for(int j=0;j<ans.get(i).size();j++)
                {
                    System.out.print(ans.get(i).get(j) + " ");
                }
                System.out.println();
            }



            t--;
        }

    }
}
//4
//bfj tro ffa rph
//4
//bfj tro ffa rph
