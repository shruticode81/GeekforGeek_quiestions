//code to remove duplicate elements from the given array and 
//return arraylist without duplicate elements
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        ArrayList<Integer> output = remove(arr);
        for(int i=0;i<output.size();i++){
            System.out.print(output.get(i)+" ");
        }
    }
    public static ArrayList<Integer> remove(int arr[]){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            result.add(arr[i]);
            map.put(arr[i],true);
        }
        return result;
    }
}
