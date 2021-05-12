// we can solve it using hashmap 
//but here i am doing to solve it using
// visited array
import java.util.Scanner;
import java.util.ArrayList;
public class RemoveDuplicate{
    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max = findMax(arr);
        //create visited array of size max+1
        boolean visited[] = new boolean[max+1];
        for(int i=0;i<arr.length;i++){
            if(visited[arr[i]]==true){
                continue;
            }
            else{
                visited[arr[i]]=true;
                list.add(arr[i]);
            }
        }
        //print the list remove duplicate
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}