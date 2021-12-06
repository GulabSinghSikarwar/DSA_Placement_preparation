import java.util.*;

import  java.util.stream.*;

public class secondMostRepeatingString
{
     public static  String secFrequent(String arr[], int N)
    {

        int n=N;
        Map<String,Integer>map=new HashMap<>();

        for (int i=0;i<n;i++)
        {
            int count=map.getOrDefault(arr[i],0);
            map.put(arr[i],count+1);


        }

map.entrySet();






        return "";

    }
    public static void main(String[] args) {

         String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
         String vale=secFrequent(arr,arr.length);


    }

}
