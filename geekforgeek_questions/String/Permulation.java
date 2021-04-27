// find permulations of a string
//input : String str = "abc"
//output :  total 6 permulations print all
import java.util.Scanner;
public class Permulation {
    public static void findPermulation(String str){
        int n = str.length();
        int fact = factorial(n);
        for(int i=0;i<fact;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int j=n;j>=1;j--){
                int q= temp/j;
                int r = temp%j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }
        
    }
    public static int factorial(int n){
        int product=1;
        for(int i=2;i<=n;i++){
            product*=i;
        }
        return product;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        findPermulation(str);
    }
}
