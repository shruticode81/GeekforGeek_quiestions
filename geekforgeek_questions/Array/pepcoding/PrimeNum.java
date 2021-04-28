//print all the prime no. between given range 
import java.util.Scanner;
public class PrimeNum {
    public static boolean isprime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int low = s.nextInt();
        int high = s.nextInt();
        for(int i=low;i<=high;i++){
            boolean ans=isprime(i);
            if(ans){
                System.out.println(i);
            }
        }
    }
}
