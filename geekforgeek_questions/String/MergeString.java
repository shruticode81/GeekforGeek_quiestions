//program to merge two strings alternatively
//input : s1="abc" s2:"stuvwx"
//output : asbtcuvwx
import java.util.Scanner;
public class MergeString {
    public static String merge(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        int len;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        if(l1<l2){
            len=l1;
        }else{
            len=l2;
        }
        String s ="";
        int i;
        for(i=0;i<len;i++){
            s=s+a[i]+b[i];
        }
        if(i<l1){
            while(i<l1){
                s=s+a[i];
                i++;
            }
        }else{
            while(i<l2){
                s=s+b[i];
                i++;
            }
        }
        return s;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        System.out.println(merge(s1,s2));

    }
}
