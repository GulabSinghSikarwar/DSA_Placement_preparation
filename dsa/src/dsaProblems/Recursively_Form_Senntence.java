package dsaProblems;

public class Recursively_Form_Senntence {

    public  static  String PrintSentence(String input ,String arr [][],int index)
    {
        if (index==arr.length)
            return "";


        input+=wordGiver(arr[index],0,input);
//        System.out.println(input);
//        input+=PrintSentence(input,arr,index+1);
//        System.out.println(input);

        return  input;
    }
    public  static  String wordGiver(String []  wordBox,int index ,String input)
    {
        if (index==wordBox.length)
            return  "";
        String ans=wordBox[index];
//        System.out.println(ans);
        input+=ans+" ";
        System.out.println(input);


        return wordGiver(wordBox,index+1,input);
    }
    public  static  void main (String [] args)
    {

        String [][] arr = {
                {"you", "we"},
                {"have", "are"},
                {"sleep", "eat", "drink"}}
                ;
    String  input ="";
    String output=PrintSentence(input,arr,0);
        System.out.println( "Output :  "+output);
    }

}
