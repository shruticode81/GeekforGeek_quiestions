//find no. of digits in a number
//input : 1234   output:4
import java.util.Scanner;
public class NoOfDigit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int dig = 0;
        while(num>0){
            num=num/10;
            dig++;
        }
        System.out.println(dig);
    }
}
