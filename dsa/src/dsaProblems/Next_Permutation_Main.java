package dsaProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Next_Permutation_Main {
    static List<Integer> nextPermutation(int N, int arr[]) {
        // code here
        List<Integer> list = new ArrayList<>();
     int k=arr.length-1;


        int n = arr.length;

        for (k = n - 2; k >= 0; k--) {
            if (arr[k] < arr[k + 1]) {
                break;
            }
        }
        int l=0;
if(k<0){
//    reverse from start  to end
    reverse(arr,0,n-1);

}
else{
    for(int i=n-1;i>k;i--)
    {
        if(arr[i]>arr[k])
        {
            System.out.println("l-->"+l);

            l=i;
            break;

        }
    }
//    swap
    System.out.println(" k and l are : "+k+" --- "+l);

   swap(arr,k,l);

//    reverse
    reverse(arr,k+1,n-1);

    fillElements(arr,list);
    printList(list);



}


        return list;

    }

    private static void printList(List<Integer> list) {
        System.out.println(list);
    }

    private static void fillElements(int[] arr, List<Integer> list) {
        for (int ele:arr)
            list.add(ele);
    }

    private static void reverse(int[] arr, int i, int j) {

        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;


        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 5, 4};
        System.out.println("Intial Arrays ::"+Arrays.toString(arr));
        nextPermutation(arr.length, arr);


    }

}
