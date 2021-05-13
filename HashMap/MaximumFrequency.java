//code to print element with maximium frequency
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public class MaximumFrequency {
    public static void frequency(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int v = map.get(arr[i]);
                v=v+1;
                map.put(arr[i],v);
            }else{
                map.put(arr[i],1);
            }
        }
        // find maximum value 
        Collection<Integer> val=map.values();
        // for(int i=0;i<val.size();i++){
        //     System.out.print(val.get(i)+" ");
        // }
       // System.out.println(Collections.max(val));
       int maximum = Collections.max(val);
       Set<Integer> keyData = map.keySet();// return all the keys
       for(int i:keyData){
           if(map.get(i)==maximum){
               System.out.println(i);
               //return;
           }
           return;
       }
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }
        frequency(arr);
    }
}
