//code to return the arraylist which are duplicate in an arary
//for example: input: [1,2,3,3,4]
//output: <3>
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

public class ReturnDuplicate {
    public static ArrayList<Integer> duplicate(int arr[]){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int v = map.get(arr[i]);
                v=v+1;
                map.put(arr[i],v);
            }
            else{
                map.put(arr[i],1);
            }
            
          
        }
        Set<Integer> key = map.keySet();
        for(int li:key){
            System.out.println(map.get(li));
            if(map.get(li)==2){
                System.out.println(li);
                result.add(li);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        ArrayList<Integer> output=duplicate(arr);
        for(int i=0;i<output.size();i++){
            System.out.print(output.get(i) + " ");
        }
    }

}
