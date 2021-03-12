import java.util.*;
import java.util.Scanner;
public class CharacterFrequency {
    public static void insert(ArrayList<Character> clist,char c){
        clist.add(c);
    }
    public static void frequency(ArrayList<Character> clist,char c){
        //print the frequency of c in arraylist
        if(clist.contains(c)){
            System.out.println(Collections.frequency(clist, c));
        }else{
            System.out.println("not present");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            ArrayList<Character> clist = new ArrayList<>();
            int q = s.nextInt();
            while(q-->0){
                char ch = s.next().charAt(0);
                if(ch=='i'){
                    char c = s.next().charAt(0);
                    insert(clist,c);
                }
                if(ch=='f'){
                    char c = s.next().charAt(0);
                    frequency(clist,c);
                }
            }
        }
    }
}
