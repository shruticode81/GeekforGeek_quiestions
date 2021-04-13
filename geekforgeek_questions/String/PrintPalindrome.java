import java.util.Scanner;
public class PrintPalindrome {
    public static boolean palindrome(String ss){
        int i=0;
        int j= ss.length()-1;
        while(i<j){
            if(ss.charAt(i)==ss.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void solution(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String ss = str.substring(i,j);
                if(palindrome(ss)==true){
                    System.out.println(ss);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        solution(str);
    }
}
