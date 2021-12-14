package dsaProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ipAddress {
    public static  void ip(String str){
        int size=str.length();
        ArrayList<String>list=new ArrayList<>();



        String snew = str;

        for (int i = 1; i < size - 2;
             i++) {
            for (int j = i + 1;
                 j < size - 1; j++) {
                for (int k = j + 1;
                     k < size; k++) {
                    snew
                            = snew.substring(0, k) + "."
                            + snew.substring(k);
                    snew
                            = snew.substring(0, j) + "."
                            + snew.substring(j);
                    snew
                            = snew.substring(0, i) + "."
                            + snew.substring(i);


//                    System.out.println(snew);

                    if (isValid(snew)) {
                        System.out.println("inside condition");
                        list.add(snew);
                        System.out.println(list);
                    }


                    snew = str;

                }

            }

        }
         System.out.println(list);

    }
public static  boolean isValid(String ip)
{
    String a[] = ip.split("[.]");
    for (String s : a) {
        int i = Integer.parseInt(s);
        if (s.length() > 3 || i < 0 || i > 255) {
            return false;
        }
        if (s.length() > 1 && i == 0)
            return false;
        if (s.length() > 1 && i != 0
                && s.charAt(0) == '0')
            return false;
    }

    return true;
}
    public static void main(String[] args) {
        String s="93606261879";
        ip(s);
    }
}
