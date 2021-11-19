package dsaProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Next_Permutation_Main {
    static List<Integer> nextPermutation(int N, int arr[]) {
        // code here
        List<Integer> list = new ArrayList<>();
        int k = Integer.MIN_VALUE;

        int n = arr.length;


        for (int i = 1; i < n; i++) {
            if (i > k && arr[i] > arr[i - 1]) {
                k = i;

            }

        }
        int l = Integer.MIN_VALUE;

        for (int i = k + 1; i < n; i++) {
            if (isGreater(arr, i, k)) ;
            {
                l =i;
                
                System.out.println(" Vallue Of K ::" + k + " Value Of l::" + l + "  Value of arr[k]::" + arr[k] + "  Value of arr[l]" + arr[l]);

            }

        }

        System.out.println("the Value Of L:" + l + " The Value of K :" + k);

        System.out.println("Before Swaping :" + Arrays.toString(arr));

        int temp = arr[l];
        arr[l] = arr[k];
        arr[k] = temp;
        System.out.println("After Swaping :" + Arrays.toString(arr));
        int j = 0;
        for (; j <= k; j++) {

            list.add(arr[j]);
            System.out.println(list);
        }
        n -= 1;

        while (n >= k + 1) {
            list.add(arr[n]);
            n--;

        }

        System.out.println(list);


        return list;

    }

    private static boolean isGreater(int[] arr, int i, int k) {
        if(arr[i]>arr[k])
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 5, 4};
        nextPermutation(arr.length, arr);


    }

}
