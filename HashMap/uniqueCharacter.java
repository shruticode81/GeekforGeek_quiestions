//code to remove all duplicates character from a string
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class uniqueCharacter {
    public static String duplicateUnique(String str){
        HashMap<Character,Boolean> map = new HashMap<>();
        //ArrayList<Character> list = new ArrayList<>();
        String s = "";
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                continue;
            }else{
                map.put(str.charAt(i),true);
                //list.add(str.charAt(i));
                s=s+str.charAt(i);
            }
        }
        return s;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.next();
        String res=duplicateUnique(input);
        System.out.print(res);
        


    }
}
