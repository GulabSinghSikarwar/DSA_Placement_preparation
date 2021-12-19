package dsaProblems;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;


public class lastOccurrencesOfX {


    public static  int getFirst(long arr[], int n, int x){
        int l=0;
        int h=n-1;
        while ( l <= h)
        {
            int  mid=(l+(h-l))/2;
//             mid=mid-1;

            if (arr[mid]==x)
            {
                if (mid==0 || arr[mid]!=arr[mid-1])
                {
                    return  mid;

                }
                else {
                    h=mid-1;
                }
            }
            else  if (arr[mid]>x)
                h=mid-1;
            else
                l=mid+1;


        }

    return -1;
    }
    public  static  int getLast(long arr[], int n, int x){

        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;

            if (mid==x)
            {
                if (mid==n-1||arr[mid]!=arr[mid+1])
                {
                    System.out.println("  last Index : "+mid);
                    return mid;
                }
                else {
                    l=mid+1;
                }
            }
            else  if (arr[mid]>x) {
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
    }






    /*public static ArrayList<Long> find(long arr[], int n, int x) {
        // code here
        ArrayList<Long> list = new ArrayList<>();

        System.out.print(Arrays.toString(arr));

        int first=-1;
         boolean firstSeen=false;

        int last=-1;
        for (int i = 0; i <n ; i++) {
            if (arr[i]==x)
            {
                if (!firstSeen)
                {
                    first=i;
                    firstSeen=true;
                }
                else last=i;


            }

        }
        list.add((long) first);
        list.add((long) last);

        return list;

    }*/
    public static  int binarySearch(long arr[], int n, int x){
        if(arr[n-1]==x)
            return (n-1);
        if (arr[0]==x)
            return 0;

       else {

            int low=0;
            int high=n-1;
            int index=(low+high)/2;

            while (index>0 && index <n)
            {
                if (arr[index]==x)
                    break;

                 else if (arr[index]>x)
                    high=index;
                 else
                     low=index;

                 index=(low+high)/2;


            }
            System.out.println("Index : "+index+"  Value: "+arr[index]);

return index;

        }



    }
    public static ArrayList<Long> find(long arr[], int n, int x) {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        int first=getFirst(arr,n,x);

        int last=getLast(arr,n,x);
        list.add((long) first);
        list.add( (long) last);


        return list;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));


//        String String_name = br.readLine();
        System.out.println("Enters the no of test case ");
        int testcases =Integer.parseInt(br.readLine());


        while(testcases-- >0)
        {
            System.out.println("Enter the  n and x ");

            String o[]=br.readLine().trim().split("\\s");
            int n=Integer.parseInt(o[0]);
            int x=Integer.parseInt(o[1]);

            System.out.println("Enter  the elements  ");

            String o2[]=    br.readLine().trim().split("\\s");
            long [] arr=new long[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=Long.parseLong(o2[i]);

            }
            ArrayList <Long>list=find(arr,n,x);
            System.out.println(list);


        }



    }

}


/*
*
  int a1=-1;
    int a2=-1;
    for(int i=0;i<n;i++){
        if(arr[i]==x){
            a1=i;
            break;
        }
    }
    for(int i=n-1;i>=0;i--){
        if(arr[i]==x){
            a2=i;
            break;
        }
    }
    return {a1,a2};

*/
