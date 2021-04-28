//print all the fibonaaci no. util nth 
//input n = 9
//output : 0 1 1 2 3 5 8 13 21
import java.util.Scanner;
public class Fibannaci {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
