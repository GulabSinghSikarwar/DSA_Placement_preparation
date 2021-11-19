package dsaProblems;

public class Word_Wrap_problem {
       //{ 3 , 2 , 2 , 5 } k=6

    public  static  int  wordWrapUtil(int arr [] ,  int n ,int k){


        if(n==0)
        return (int)Math.pow(k,2);

        if(n==1)
            return  (int)Math.pow(k-arr[0],2);


        int index=0;
        int count =0;
        int totalSum=0;

        while(index<n){
            // [___.__.__._____. ]

            int currentSum=0;
            System.out.println(" inside Outer loop ");


       while(k>currentSum){
            System.out.print(" Inside inner loop"+" ->");
           if(currentSum+arr[index]+1<=k)
           {
               System.out.println();

               System.out.print(arr[index]+" -- ");
                currentSum =currentSum+arr[index]+1;
               index++;

           }
           else
                break;


       }
            System.out.println();

            System.out.println(" Current extra space is :"+(k-currentSum));
       n=index;
       System.out.println(" current index is: "+ index);


            count++;
            System.out.println();
        }
        return  count;

    }
    public static  int wordWrap( int arr [] ,int k  ){

        int n=arr.length;
        System.out.println( " length of array "+n);
        int result = wordWrapUtil(arr ,n, k);
    return result;
    }

    public static void main(String[] args)
    {
        int k=6;
        int  arr [] ={ 3 , 2 , 2 , 5 };
        int result = wordWrap(arr,k);
        System.out.println("OutPut : "+result);


    }
}
