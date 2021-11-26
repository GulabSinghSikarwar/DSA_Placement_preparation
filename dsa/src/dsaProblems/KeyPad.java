package dsaProblems;

import java.text.Format;

public class KeyPad {


    public static void main(String[] args) {
        String str []= {
                "2" ,"22", "222",
                "3" ,"33", "333",
                "4" ,"44", "444",
                "5" ,"55", "555",
                "6" ,"66", "666",
                "7" ,"77", "777","7777",
                "8" ,"88", "888",
                "9" ,"99", "999","9999"
};
        String input="HELLO WORLD";
        KeyPad_output(input,str);



//        System.out.println(str.length);
//        int c='Z'-'C';
//        System.out.println(str.length-c-1);


    }

    private static void KeyPad_output(String input, String[] str) {
        String myOutput="";

        for(int i=0;i<input.length();i++)
        {
            int character=input.charAt(i);
          if(character!=' '){
              int characterIndex='Z'-character;

              int index=str.length-characterIndex-1;
              System.out.print(str[index]);
          myOutput+=str[index];

          }
          else
          {
              myOutput+="0";
              System.out.print("0");

          }




        }
        System.out.println();
        System.out.println(myOutput);

String requiredOutput="4433555555666096667775553";
        System.out.println(requiredOutput);
        if (myOutput.equals(requiredOutput))
            System.out.println(true);
        else System.out.println(false);
    }
}
