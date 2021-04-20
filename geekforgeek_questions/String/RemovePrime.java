import java.util.ArrayList;
import java.util.Scanner;
public class RemovePrime {
    public static boolean isprime(int num){
        for(int d=2;d*d<=num;d++){
            if(num%d == 0){
                return false;
            }
        }
        return true;
    }
    public static void remove(ArrayList<Integer> li){
        for(int i= li.size()-1;i>=0;i--){
            if(isprime(li.get(i))==true){
                li.remove(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
        }
        remove(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        
    }
}
