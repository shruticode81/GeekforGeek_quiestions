//input --> pepCODing
//output --> PEPcodING
import java.util.Scanner;
public class ToggleCase {
    public static String toggleCase(String str){
        //we have to make chages in same string so we have to define
        //StringBuilder bz doing changes in string is not effective and slow
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch>='a' && ch<='z'){
                char uch= (char) ('A'+ch-'a');
                sb.setCharAt(i, uch);
            }else if(ch>='A' && ch<='Z'){
                char lch = (char)('a'+ch-'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(toggleCase(str));
    }    
}
