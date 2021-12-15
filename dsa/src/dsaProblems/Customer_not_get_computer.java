package dsaProblems;

import java.util.*;

public class Customer_not_get_computer {
    public static int countCustomers(ArrayList<Integer> arr, int k)
    {
        //    Write your code here


        Map <Integer,Integer>map=new HashMap<Integer,Integer>();
        // if customer  on first  coming  if  computers are available then customers gets
        // the computers
        //4 1
        //1 2 3 4 4 3 2 1
        int computers=k;
        int count =0;



        for ( int ele : arr) {

//            System.out.println( " Current Element : "+ele+"  Intially before the any Operation : "+map
//                    +"   Before -> No of Computers : "+computers);
            if(!map.containsKey(ele))
            {

                if (computers>0) {
                    map.put(ele, 1);
                    computers--;
                }
                else map.put(ele,0);
            }
            else {
                // if it  value is present in the  map
                // the we check  does this customer  had got the computer or not
                int response=map.get(ele);
                if (response==0)
                {
                    // it means that customer does not got the computer
                    count++;
                    map.remove(ele);

                }
                else {
                    computers++;
                    map.remove(ele);


                }




            }
//            System.out.println( " After -> No of Computers  : "+computers+"   After the any Operation : "+map);
//
//            System.out.println("Count : "+count );
//            System.out.println();
//            System.out.println();


        }



        return count;

    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the  element : ");

        String str= sc.nextLine();
        String[] words=str.split("\\s");
        ArrayList<Integer> arr=new ArrayList<>();

        System.out.println("Enter the no element : ");
        int n=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter  K : ");
        int k=sc.nextInt();


        for (String ele: words) {
            int value=Integer.parseInt(ele);
            arr.add(value);





        }
      System.out.println(arr+" k-. "+k+"  n = "+n);

//
        int output =countCustomers(arr,k);
        System.out.println("Final Output : "+output);

    }
}
