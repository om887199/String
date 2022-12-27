import java.util.Scanner;
class StringsRev
{
       
   public static void main(String[] args){
    String st1="yogesh yadav";
    String st2=" ";
    int l = st1.length();

    for(int i=l-1;i>=0;i--){
      st2=st2+st1.charAt(i);
    }
    System.out.println(st2);
       

}
}

       



        

