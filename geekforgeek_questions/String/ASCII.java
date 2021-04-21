import java.util.Scanner;

public class ASCII {
    public static String asciiDiff(String str){
        String s = "";
        s+=str.charAt(0);
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int val = (curr-prev);
            s+=val;
            s+=curr;
        }
        return s;
    }
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       String str=s.next();
       System.out.println(asciiDiff(str));
   } 
}
