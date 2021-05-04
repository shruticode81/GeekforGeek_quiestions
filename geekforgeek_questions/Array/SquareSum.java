import java.util.Scanner;
public class SquareSum {
    public static boolean checkSquare(int ele){
        if(Math.ceil(Math.sqrt(ele)) == Math.floor(Math.sqrt(ele)) ){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            if(checkSquare(arr[i])){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
